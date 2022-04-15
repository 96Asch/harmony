package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class getAvatarURLs_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"getAvatarURLs":keyOverwrite,getAvatarURLs_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(getAvatarURLs_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "getAvatarURLs";
}
public String getTemplateSignature(){
return "page getAvatarURLs()";
}
public String getElementsContext(){
if(calledName==null){
return "getAvatarURLs";
}
else {
return calledName;
}
}
private String result2_;
public String getResult2_(){
return result2_;
}
public void setResult2_(String result2_){
this.result2_=result2_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_17853670210","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result2_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result2) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_getAvatarURLs0_.genpagecombined_getAvatarURLs0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
com.google.gson.JsonArray avatarArray_=new com.google.gson.JsonArray();
com.google.gson.JsonObject drums_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(drums_,"url","/images/avatar/drums.png");
utils.JSONType.put(avatarArray_,drums_);
com.google.gson.JsonObject eg_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(eg_,"url","/images/avatar/eg.png");
utils.JSONType.put(avatarArray_,eg_);
com.google.gson.JsonObject guitar_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(guitar_,"url","/images/avatar/guitar.png");
utils.JSONType.put(avatarArray_,guitar_);
com.google.gson.JsonObject mic_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(mic_,"url","/images/avatar/microphone.png");
utils.JSONType.put(avatarArray_,mic_);
com.google.gson.JsonObject piano_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(piano_,"url","/images/avatar/piano.png");
utils.JSONType.put(avatarArray_,piano_);
com.google.gson.JsonObject sax_=utils.JSONType.parseJsonObject("{}");
utils.JSONType.put(sax_,"url","/images/avatar/saxophone.png");
utils.JSONType.put(avatarArray_,sax_);
result2_=utils.JSONType.toString(avatarArray_);
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result2_="";
}
}
