package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Dashboard_ta0_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Dashboard_ta0":keyOverwrite,Dashboard_ta0_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Dashboard_ta0_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "Dashboard_ta0";
}
public String getTemplateSignature(){
return "template Dashboard_ta0()";
}
public String getElementsContext(){
if(calledName==null){
return "Dashboard";
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
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if20410616190"+forelementid))==null){
if0=webdsl.generated.functions.genpagepredicate_Dashboard0_.genpagepredicate_Dashboard0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if20410616190"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall20410616190","Bootstrap",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Bootstrap"),new org.webdsl.lang.Environment(env).putWithcall("elements#Bootstrap",utils.TemplateCall.EmptyElementsCall),"Bootstrap",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Bootstrap() at dashboard.app:15/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall20410616192","GlobalCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"GlobalCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#GlobalCSS",utils.TemplateCall.EmptyElementsCall),"GlobalCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"GlobalCSS() at dashboard.app:16/6");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addStylesheetInclude("dashboard.css");
}
}
}
}
