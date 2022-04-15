package webdsl.generated.functions;
@SuppressWarnings("all")public class IsValidUsernameJSONObject_JSONObject_{
public static Boolean IsValidUsernameJSONObject_JSONObject_(com.google.gson.JsonObject request_,com.google.gson.JsonObject response_){
String username_=utils.JSONType.getString(request_,"username");
Boolean ok_=true;
if(org.webdsl.tools.Utils.equal(username_,null)){
webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Username was null");
ok_=false;
}
else {}
return ok_;
}
}
