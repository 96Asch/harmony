package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class searchString_s_ad0String_String_String_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.searchString_s_ad0String_String_String_s_ad0String_String_String_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(searchString_s_ad0String_String_String_s_ad0String_String_String_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"searchString_s_ad0String_String_String":keyOverwrite,searchString_s_ad0String_String_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(searchString_s_ad0String_String_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
searchString_doSearch20_=(String)args[0];
query_=(String)args[1];
newQuery_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "searchString_s_ad0String_String_String";
}
public String getTemplateSignature(){
return "template searchString_s_ad0(searchString_doSearch20 : String, query : String, newQuery : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String searchString_doSearch20_="";
private String query_="";
private utils.RefArg newQuery_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if11865165300"+forelementid))==null){
if0=webdsl.generated.functions.genactioncombined_doSearch0String_.genactioncombined_doSearch0String_(query_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if11865165300"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall11865165300","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"searchString_doSearch3"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("searchString_s_ad0String_String_String_s_ad0String_String_String_String",getElementsContext(),new Object[]{searchString_doSearch20_,query_,newQuery_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"searchString_doSearch3\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
