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

function isValidRequest(request : JSONObject, response : JSONObject) : Bool {
  return isValidField("method", request, response) && isValidField("message", request, response);
}

function isValidLoginRequest(request : JSONObject) : Bool {
  return true;
}

function IsValidUsername(request : JSONObject, response : JSONObject) : Bool {
  return isValidField("username", request, response);
}

function IsValidPassword(request : JSONObject, response : JSONObject) : Bool {
  var ok := true;
  ok := isValidField("password", request, response);
  if (request.getString("password").length() < 8) { AddError(response, "Password must contain at least 8 characters"); ok := false;}
  return ok;
}