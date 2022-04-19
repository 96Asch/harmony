module api

imports apivalidation


routing {
  receive(urlargs:[String]) {
    log(baseUrl());
    if(urlargs[0] == "api" && urlargs.length > 1){
      var url := [urlargs[1] + "Service"].addAll(urlargs.subList(2, urlargs.length));
      log("[routing]: ~urlargs -> ~url");
      return url;
    }
    else{
      return null; // will use default
    }
  }
  // construct is not necessarily the same as receive, e.g. when using the domain name to specify one of the arguments in a multitenant application
  construct (appurl:String,pagename:String, pageargs:[String]) {
    if(pagename == "api" && pageargs.length > 0){
      var url := [appurl, pageargs[0] + "Service"].addAll(pageargs.subList(1, pageargs.length));
      log("[construct]: ~pagename/~pageargs -> ~url");
      return url;
    }
    else{
      return null;
    }
  }
}

function Response() : JSONObject {
  var json := JSONObject("{}");
  json.put("message", JSONObject());
  json.put("errors", JSONArray());
  return json;
}

function loginRequest(response : JSONObject) : JSONObject {
  var request := getRequest(response);
  request := request.getJSONObject("message");
  
  if (!isValidUsername(request, response) || !isValidPassword(request, response)) { return response; }

  var username := request.getString("username");
  var password := request.getString("password");
  
  if (!authenticate(username, password)) { return AddError(response, "Username and password do not match"); } 
  
  response.getJSONObject("message").put("isLoggedIn", true);
  response.getJSONObject("message").put("username", username);
  response.getJSONObject("message").put("token", principal.id);
  
  return response;
}


service loginService() {
  var response := Response();
  response := loginRequest(response);
  return response;
}

function registerRequest(response : JSONObject) : JSONObject {
  var request := getRequest(response);
  request := request.getJSONObject("message");
  
  if (hasErrors(response)) { return response; }
  if (!isValidUsername(request, response) || !isValidPassword(request, response)) { return response; }

  var username := request.getString("username");
  var password := request.getString("password") as Secret;
  var email := request.getString("email") as Email;
  
  var newUser := User { 
    username := username, 
    password := password.digest(),
    email    := email
  };
  
  newUser.save();
  
  if (!isValidSave(response, newUser.validateSave())) { return response; }
  return response;
}

service registerService() {
  var response :=  Response();
  response := registerRequest(response);
  return response;
}

function notificationRequest(response : JSONObject) : JSONObject {
  var request := getRequest(response);
  var method := request.getString("method");
  request := request.getJSONObject("message");
  
  if (!isSignedIn(request, response)) { return response; }
    
  var username := principal.username;
  var notifications := from Notification as n where n.receiver.username = ~username;
  case(method) {
    "GET" {
    
      var nArray := JSONArray();
      for (n in notifications) {
        nArray.put(n.toJSON());
      }
      response.getJSONObject("message").put("notifications", nArray);
    }
    "DELETE" {
      if (!isValidField("uuid", request, response)) { return response; }
      var toDelete := request.getString("uuid").parseUUID();
      if (toDelete == null) { return AddError(response, "Provided UUID is not a valid UUID"); }
      
      for (n in notifications) {
        if (n.id == toDelete) {
          notifications.remove(n);
          n.delete();
        }
      }
      
    }
    default {
      AddError(response, "Invalid method: ~method");
    }
  }
  
  return response;
}

service notificationService() {
  var response := Response();
  response := notificationRequest(response);
  return response;
}


access control rules
rule page loginService() { true }
rule page registerService() { true }
rule page notificationService() { true }