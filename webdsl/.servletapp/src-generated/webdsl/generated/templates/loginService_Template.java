package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class loginService_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"loginService":keyOverwrite,loginService_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(loginService_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "loginService";
}
public String getTemplateSignature(){
return "page loginService()";
}
public String getElementsContext(){
if(calledName==null){
return "loginService";
}
else {
return calledName;
}
}
private String result0_;
public String getResult0_(){
return result0_;
}
public void setResult0_(String result0_){
this.result0_=result0_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall6339011570","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result0_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result0) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
com.google.gson.JsonObject response_=webdsl.generated.functions.LoginResponse_.LoginResponse_();
webdsl.generated.functions.loginRequestJSONObject_.loginRequestJSONObject_(response_);
result0_=utils.JSONType.toString(response_);
}
protected void initializeLocalVars(){
result0_="";
}
}
