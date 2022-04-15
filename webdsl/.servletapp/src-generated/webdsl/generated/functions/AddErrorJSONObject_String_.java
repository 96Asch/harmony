package webdsl.generated.functions;
@SuppressWarnings("all")public class AddErrorJSONObject_String_{
public static com.google.gson.JsonObject AddErrorJSONObject_String_(com.google.gson.JsonObject response_,String message_){
utils.JSONType.put(utils.JSONType.getJSONArray(response_,"errors"),message_);
return response_;
}
}
