package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class UserListString_LUserL_Template extends utils.TemplateServlet{
public void prefetchFor_9197209230(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.UserListString_LUserL_s_ad0String_String_LUserL_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(UserListString_LUserL_s_ad0String_String_LUserL_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"UserListString_LUserL":keyOverwrite,UserListString_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(UserListString_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
users_=(java.util.List<webdsl.generated.domain.User>)args[1];
}
public String getUniqueName(){
return "UserListString_LUserL";
}
public String getTemplateSignature(){
return "ajaxtemplate UserList(query : String, users : [User])";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "UserListString_LUserL";
}
else {
return calledName;
}
}
private String query_="";
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for19340652140"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=webdsl.generated.domain.User._static_searchUser_(query_);
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor_9197209230(list1,true);
prefetchFor_9197209230(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for19340652140"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User user_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(user_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)user_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall19340652140","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"UserListString_LUserL_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("UserListString_LUserL_s_ad0String_String_LUserL_User",getElementsContext(),new Object[]{query_,users_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"UserListString_LUserL_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid0;
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementid="0";
fallbackcounter=0;
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
