module apivalidation

function isValidField(field : String, request : JSONObject, response : JSONObject) : Bool {
  var ok := true;
  if (!request.has(field)) { AddError(response, "Request has no field ~field"); ok := false; }
  // if (request.getString(field) == null) { AddError(response, "Request field: ~field was null"); ok := false; }
  return ok;
}

function AddError(response : JSONObject, message : String) : JSONObject {
  response.getJSONArray("errors").put(message);
  return response;
}

function getRequest(response : JSONObject) : JSONObject {
  if ( getHttpMethod() != "POST" ) { return AddError(response, "Request must be of type: POST"); }
  
  var requestBody := readRequestBody();
  
  if ( requestBody == null) { AddError(response, "Request body was null"); return null; }
  
  var request := JSONObject(requestBody); //handle request
  
  if (request == null) { AddError(response, "Request was null"); return null; }
  if (!isValidRequest(request, response)) { return response; }
  
  return request;
}

function hasErrors(response : JSONObject) : Bool {
  return response.getJSONArray("errors").length() > 0;
}

function isValidSave(response : JSONObject, saveValidation : ValidationExceptionMultiple) : Bool {
  var ok := true;
  for (e in saveValidation.exceptions) {
    rollback();
    AddError(response, e.message);
    ok := false;
  }
  return ok;
}

function isValidRequest(request : JSONObject, response : JSONObject) : Bool {
  return isValidField("method", request, response) && isValidField("message", request, response);
}


function isValidUsername(request : JSONObject, response : JSONObject) : Bool {
  return isValidField("username", request, response);
}

function isValidPassword(request : JSONObject, response : JSONObject) : Bool {
  var ok := true;
  ok := isValidField("password", request, response);
  if (request.getString("password").length() < 8) { AddError(response, "Password must contain at least 8 characters"); ok := false;}
  return ok;
}

function isSignedIn(request : JSONObject, response : JSONObject) : Bool {
  if (!isValidField("token", request, response) || !isValidUsername(request, response)) { return false; }
  
  var username := request.getString("username");
  var token := request.getString("token");
  
  if (principal.username != username || principal.id != token.parseUUID()) { return false; }
  return true;
}