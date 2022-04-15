package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder_Template extends utils.TemplateServlet{
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
java.util.ArrayList<webdsl.generated.domain.SetList> elems1=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems1.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder":keyOverwrite,slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
slButtonBarUser_SetList_Placeholder_RemoveSetList24_=(String)args[0];
slButtonBarUser_SetList_Placeholder_RemoveSetList10_=(String)args[1];
editor_=(webdsl.generated.domain.User)args[2];
setlist_=(webdsl.generated.domain.SetList)args[3];
ph_=(String)args[4];
}
public String getUniqueName(){
return "slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder";
}
public String getTemplateSignature(){
return "template slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0(slButtonBarUser_SetList_Placeholder_RemoveSetList24 : String, slButtonBarUser_SetList_Placeholder_RemoveSetList10 : String, editor : User, setlist : SetList, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String slButtonBarUser_SetList_Placeholder_RemoveSetList24_="";
private String slButtonBarUser_SetList_Placeholder_RemoveSetList10_="";
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.SetList setlist_=null;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=slButtonBarUser_SetList_Placeholder_RemoveSetList24_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.slButtonBarUser_SetList_Placeholder_RemoveSetList0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=slButtonBarUser_SetList_Placeholder_RemoveSetList24_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.slButtonBarUser_SetList_Placeholder_RemoveSetList0().run(threadLocalPageCached,getEnv(),getElementsContext(),((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),setlist_,ph_,setlist_,editor_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+slButtonBarUser_SetList_Placeholder_RemoveSetList24_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+slButtonBarUser_SetList_Placeholder_RemoveSetList24_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn border btn-close");
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
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+slButtonBarUser_SetList_Placeholder_RemoveSetList24_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+slButtonBarUser_SetList_Placeholder_RemoveSetList24_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn border btn-close");
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
