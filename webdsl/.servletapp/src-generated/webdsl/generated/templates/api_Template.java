package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class api_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"api":keyOverwrite,api_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(api_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "api";
}
public String getTemplateSignature(){
return "page api()";
}
public String getElementsContext(){
if(calledName==null){
return "api";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall2367237170","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{result0_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(result0) at unknown context");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_api0_.genpagecombined_api0_()){
webdsl.generated.functions.mimetypeString_.mimetypeString_("application/json");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
result0_="";
}
}
