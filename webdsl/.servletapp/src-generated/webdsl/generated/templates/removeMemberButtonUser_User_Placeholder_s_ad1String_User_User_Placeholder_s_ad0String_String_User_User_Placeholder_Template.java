package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
if(i==4){
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
staticEnv.putTemplate(keyOverwrite==null?"removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder":keyOverwrite,removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
removeMemberButtonUser_User_Placeholder_ia04_=(String)args[0];
removeMemberButtonUser_User_Placeholder_ia00_=(String)args[1];
editor_=(webdsl.generated.domain.User)args[2];
user_=(webdsl.generated.domain.User)args[3];
ph_=(String)args[4];
}
public String getUniqueName(){
return "removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder";
}
public String getTemplateSignature(){
return "template removeMemberButtonUser_User_Placeholder_s_ad1String_User_User_Placeholder_s_ad0(removeMemberButtonUser_User_Placeholder_ia04 : String, removeMemberButtonUser_User_Placeholder_ia00 : String, editor : User, user : User, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String removeMemberButtonUser_User_Placeholder_ia04_="";
private String removeMemberButtonUser_User_Placeholder_ia00_="";
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.User user_=null;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=removeMemberButtonUser_User_Placeholder_ia04_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.removeMemberButtonUser_User_Placeholder_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=removeMemberButtonUser_User_Placeholder_ia04_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.removeMemberButtonUser_User_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),ph_,editor_,ph_,user_,editor_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+removeMemberButtonUser_User_Placeholder_ia04_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+removeMemberButtonUser_User_Placeholder_ia04_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"badge rounded-pill border btn-close");
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+removeMemberButtonUser_User_Placeholder_ia04_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+removeMemberButtonUser_User_Placeholder_ia04_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"badge rounded-pill border btn-close");
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
out.print("</a>");
}
break;}}
}