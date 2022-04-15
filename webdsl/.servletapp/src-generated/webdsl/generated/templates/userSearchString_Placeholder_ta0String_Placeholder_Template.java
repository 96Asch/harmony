package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_Placeholder_ta0String_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor_3651611080(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchString_Placeholder_ta0String_Placeholder_s_ad0String_String_Placeholder_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(userSearchString_Placeholder_ta0String_Placeholder_s_ad0String_String_Placeholder_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_Placeholder_ta0String_Placeholder":keyOverwrite,userSearchString_Placeholder_ta0String_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_Placeholder_ta0String_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
ph_=(String)args[1];
}
public String getUniqueName(){
return "userSearchString_Placeholder_ta0String_Placeholder";
}
public String getTemplateSignature(){
return "template userSearchString_Placeholder_ta0(query : String, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "userSearchString_Placeholder";
}
else {
return calledName;
}
}
private String query_="";
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for8266539050"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getUsers();
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor_3651611080(list1,true);
prefetchFor_3651611080(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for8266539050"+forelementid,forcol0);
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
utils.TemplateCall.appendWithPadding(classattrs,"btn-group");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("role","group"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall8266539050","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"userSearchString_Placeholder_ta0String_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("userSearchString_Placeholder_ta0String_Placeholder_s_ad0String_String_Placeholder_User",getElementsContext(),new Object[]{query_,ph_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"userSearchString_Placeholder_ta0String_Placeholder_ia0\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
}
}
