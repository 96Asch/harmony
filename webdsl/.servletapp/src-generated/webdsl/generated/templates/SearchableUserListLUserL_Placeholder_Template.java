package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SearchableUserListLUserL_Placeholder_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SearchableUserListLUserL_Placeholder":keyOverwrite,SearchableUserListLUserL_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SearchableUserListLUserL_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
users_=(java.util.List<webdsl.generated.domain.User>)args[0];
ph_=(String)args[1];
}
public String getUniqueName(){
return "SearchableUserListLUserL_Placeholder";
}
public String getTemplateSignature(){
return "template SearchableUserList(users : [User], ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "SearchableUserListLUserL_Placeholder";
}
else {
return calledName;
}
}
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private String ph_="";
private String query_;
public String getQuery_(){
return query_;
}
public void setQuery_(String query_){
this.query_=query_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"div");
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
utils.TemplateCall.appendWithPadding(classattrs,"");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall9233140990","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Search all users"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String",getElementsContext(),new Object[]{users_,ph_,new webdsl.generated.templates.RefArg_SearchableUserListLUserL_Placeholder_Template0(SearchableUserListLUserL_Placeholder_Template.this)},attrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Search all users\") at dashmodal.app:188/7");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
protected void initializeLocalVars(){
query_="";
}
}
