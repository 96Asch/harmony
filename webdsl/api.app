module api


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

function LoginResponse() : JSONObject {
  var json := JSONObject("{}");
  json.put("message", JSONObject());
  json.put("errors", JSONArray());
  return json;
}

function AddError(response : JSONObject, message : String) : JSONObject {
  response.getJSONArray("errors").put(message);
  return response;
}

function IsValidUsername(request : JSONObject, response : JSONObject) : Bool {
  var username := request.getString("username");
  var ok := true;
  if (username == null) { AddError(response, "Username was null"); ok := false;}
  return ok;
}

function IsValidPassword(request : JSONObject, response : JSONObject) : Bool {
  var password := request.getString("password");
  var ok := true;
  if (password == null) { AddError(response, "Password was null"); ok := false; }
  if (password.length() < 8) { AddError(response, "Password must contain at least 8 characters"); ok := false;}
  
  return ok;
}

function loginRequest(response : JSONObject) : JSONObject {
  if( getHttpMethod() != "POST" ) { return AddError(response, "Request must be of type: POST"); }
  var request := JSONObject(readRequestBody()); //handle request
  
  if (request == null) { return AddError(response, "Request was null"); }
  if (!IsValidUsername(request, response) || !IsValidPassword(request, response)) { return response; }

  var username := request.getString("username");
  var password := request.getString("password");
  
  if (!authenticate(username, password)) { return AddError(response, "Username and password do not match"); } 
  
  response.getJSONObject("message").put("username", username);
  response.getJSONObject("message").put("username", username);
  
  return response;
}


service loginService() {
  var response := LoginResponse();
  loginRequest(response);
  return response;
}


access control rules
rule page loginService() { true }