package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_SetList_LUserL_Placeholder_s_ad1String_String_SetList_LUserL_Placeholder_String_User_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
if(i==7){
java.util.ArrayList<webdsl.generated.domain.User> elems1=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems1.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_SetList_LUserL_Placeholder_s_ad1String_String_SetList_LUserL_Placeholder_String_User":keyOverwrite,userSearchString_SetList_LUserL_Placeholder_s_ad1String_String_SetList_LUserL_Placeholder_String_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_SetList_LUserL_Placeholder_s_ad1String_String_SetList_LUserL_Placeholder_String_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
userSearchString_SetList_LUserL_Placeholder_ia20_=(String)args[0];
query_=(String)args[1];
setlist_=(webdsl.generated.domain.SetList)args[2];
users_=(java.util.List<webdsl.generated.domain.User>)args[3];
ph_=(String)args[4];
newQuery_=(utils.RefArg)args[5];
m_=(webdsl.generated.domain.User)args[6];
}
public String getUniqueName(){
return "userSearchString_SetList_LUserL_Placeholder_s_ad1String_String_SetList_LUserL_Placeholder_String_User";
}
public String getTemplateSignature(){
return "template userSearchString_SetList_LUserL_Placeholder_s_ad1(userSearchString_SetList_LUserL_Placeholder_ia20 : String, query : String, setlist : SetList, users : [User], ph : Placeholder, newQuery : ref String, m : User)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String userSearchString_SetList_LUserL_Placeholder_ia20_="";
private String query_="";
private webdsl.generated.domain.SetList setlist_=null;
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private String ph_="";
private utils.RefArg newQuery_=null;
private webdsl.generated.domain.User m_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=userSearchString_SetList_LUserL_Placeholder_ia20_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.userSearchString_SetList_LUserL_Placeholder_ia2.isValidationDisabled();
}
break;case ACTION_PHASE:ident=userSearchString_SetList_LUserL_Placeholder_ia20_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.userSearchString_SetList_LUserL_Placeholder_ia2().run(threadLocalPageCached,getEnv(),getElementsContext(),m_,ph_,users_,setlist_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+userSearchString_SetList_LUserL_Placeholder_ia20_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+userSearchString_SetList_LUserL_Placeholder_ia20_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_6288404200"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(m_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_6288404200"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_6288404200","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{m_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(m.name) at unknown context");
}
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+userSearchString_SetList_LUserL_Placeholder_ia20_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+userSearchString_SetList_LUserL_Placeholder_ia20_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_6288404200"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(m_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_6288404200"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_6288404200","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{m_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(m.name) at unknown context");
}
}
out.print("</a>");
}
break;}}
}
