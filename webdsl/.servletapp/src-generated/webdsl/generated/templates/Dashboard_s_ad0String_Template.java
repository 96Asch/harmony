package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Dashboard_s_ad0String_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.Dashboard_s_ad0String_s_ad0String_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(Dashboard_s_ad0String_s_ad0String_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Dashboard_s_ad0String":keyOverwrite,Dashboard_s_ad0String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Dashboard_s_ad0String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
Dashboard_ia00_=(String)args[0];
}
public String getUniqueName(){
return "Dashboard_s_ad0String";
}
public String getTemplateSignature(){
return "template Dashboard_s_ad0(Dashboard_ia00 : String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String Dashboard_ia00_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if1968765230"+forelementid))==null){
if1=webdsl.generated.functions.genpagepredicate_Dashboard0_.genpagepredicate_Dashboard0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if1968765230"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if1968765231"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_Dashboard__0_.genactionpredicate_Dashboard__0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if1968765231"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall1968765230","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Dashboard_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("Dashboard_s_ad0String_s_ad0String_String",getElementsContext(),new Object[]{Dashboard_ia00_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"Dashboard_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
