package webdsl.generated.functions;
@SuppressWarnings("all")public class IsValidPasswordJSONObject_JSONObject_{
public static Boolean IsValidPasswordJSONObject_JSONObject_(com.google.gson.JsonObject request_,com.google.gson.JsonObject response_){
String password_=utils.JSONType.getString(request_,"password");
Boolean ok_=true;
if(org.webdsl.tools.Utils.equal(password_,null)){
webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Password was null");
ok_=false;
}
else {}
if(!(org.webdsl.tools.Utils.equal(password_.length(),null)||org.webdsl.tools.Utils.equal(8,null))&&password_.length()<8){
webdsl.generated.functions.AddErrorJSONObject_String_.AddErrorJSONObject_String_(response_,"Password must contain at least 8 characters");
ok_=false;
}
else {}
return ok_;
}
}
