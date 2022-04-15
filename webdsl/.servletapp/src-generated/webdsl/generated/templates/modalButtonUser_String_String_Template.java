package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class modalButtonUser_String_String_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"modalButtonUser_String_String":keyOverwrite,modalButtonUser_String_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(modalButtonUser_String_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editor_=(webdsl.generated.domain.User)args[0];
text_=(String)args[1];
modalId_=(String)args[2];
}
public String getUniqueName(){
return "modalButtonUser_String_String";
}
public String getTemplateSignature(){
return "template modalButton(editor : User, text : String, modalId : String)";
}
public String getElementsContext(){
if(calledName==null){
return "modalButtonUser_String_String";
}
else {
return calledName;
}
}
private static String c$25(String text__){
try{
Object v=text__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private webdsl.generated.domain.User editor_=null;
private String text_="";
private String modalId_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_7198991110"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_modalButton0User_String_String_.gentemplatepredicate_modalButton0User_String_String_(editor_,text_,modalId_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_7198991110"+forelementid,if0);
}
}
if(if0){
if(RENDER_PHASE==phase){
out.print("<"+"button");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-danger mt-1 mb-1");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("type","button"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-toggle","modal"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#"+modalId_));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-dismiss","modal"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_7198991110","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{""+c$25(text_)},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"~text\") at dashmodal.app:10/5");
}
if(RENDER_PHASE==phase){
out.print("</"+"button"+">");
}
}
}
}
