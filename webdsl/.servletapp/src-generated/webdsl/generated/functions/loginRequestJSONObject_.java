package webdsl.generated.functions;
@SuppressWarnings("all")public class loginRequestJSONObject_{
public static com.google.gson.JsonObject loginRequestJSONObject_(com.google.gson.JsonObject response_){
if(!org.webdsl.tools.Utils.equal(utils.ThreadLocalPage.get().getRequest().getMethod(),"POST")){
return webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Request must be of type: POST");
}
else {}
com.google.gson.JsonObject request_=utils.JSONType.parseJsonObject(utils.InputStreamReader.readBody());
if(org.webdsl.tools.Utils.equal(request_,null)){
return webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Request was null");
}
else {}
if(!webdsl.generated.functions.IsValidUsernameJSONObject_JSONObject_.IsValidUsernameJSONObject_JSONObject_(request_,response_)||!webdsl.generated.functions.IsValidPasswordJSONObject_JSONObject_.IsValidPasswordJSONObject_JSONObject_(request_,response_)){
return response_;
}
else {}
String username_=utils.JSONType.getString(request_,"username");
String password_=utils.JSONType.getString(request_,"password");
if(!webdsl.generated.functions.authenticateString_Secret_.authenticateString_Secret_(username_,password_)){
return webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Username and password do not match");
}
else {}
utils.JSONType.put(utils.JSONType.getJSONObject(response_,"message"),"username",username_);
utils.JSONType.put(utils.JSONType.getJSONObject(response_,"message"),"username",username_);
return response_;
}
}
