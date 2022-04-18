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
  if ( getHttpMethod() != "POST" ) { return AddError(response, "Request must be of type: POST"); }
  
  var requestBody := readRequestBody();
  
  if ( requestBody == null) { return AddError(response, "Request body was null"); }
  
  var request := JSONObject(requestBody); //handle request
  log(request);
  if (request == null) { return AddError(response, "Request was null"); }
  
  if (!isValidRequest(request, response)) { return response; }
  
  request := request.getJSONObject("message");
  
  if (!IsValidUsername(request, response) || !IsValidPassword(request, response)) { return response; }

  var username := request.getString("username");
  var password := request.getString("password");
  
  if (!authenticate(username, password)) { return AddError(response, "Username and password do not match"); } 
  
  response.getJSONObject("message").put("username", username);
  response.getJSONObject("message").put("password", password);
  
  return response;
}


service loginService() {
  var response := Response();
  response := loginRequest(response);
  log(response);
  return response;
}

service testService() {
  var json :=  Response();
  json.put("messages", "Hello");
  json.put("errore", "Nothing");
  return json;
}


access control rules
rule page loginService() { true }
rule page testService() { true }