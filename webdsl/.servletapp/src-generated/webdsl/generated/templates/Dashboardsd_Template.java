package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Dashboardsd_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Dashboardsd":keyOverwrite,Dashboardsd_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Dashboardsd_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "Dashboardsd";
}
public String getTemplateSignature(){
return "page Dashboardsd()";
}
public String getElementsContext(){
if(calledName==null){
return "Dashboardsd";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16845392830","DashCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashCSS",utils.TemplateCall.EmptyElementsCall),"DashCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashCSS() at dashboard.app:133/6");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("chordproInterpreter.js");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16845392832","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at dashboard.app:138/5");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_Dashboardsd0_.genpagecombined_Dashboardsd0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
