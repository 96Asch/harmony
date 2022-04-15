package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SetListsPlaceholder_s_ad1String_Placeholder_User_LSetListL_SetList_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==5){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SetListsPlaceholder_s_ad1String_Placeholder_User_LSetListL_SetList":keyOverwrite,SetListsPlaceholder_s_ad1String_Placeholder_User_LSetListL_SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SetListsPlaceholder_s_ad1String_Placeholder_User_LSetListL_SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
SetListsPlaceholder_ShowSetListEdit10_=(String)args[0];
ph_=(String)args[1];
u_=(utils.RefArg)args[2];
setLists_=(utils.RefArg)args[3];
setlist_=(webdsl.generated.domain.SetList)args[4];
}
public String getUniqueName(){
return "SetListsPlaceholder_s_ad1String_Placeholder_User_LSetListL_SetList";
}
public String getTemplateSignature(){
return "template SetListsPlaceholder_s_ad1(SetListsPlaceholder_ShowSetListEdit10 : String, ph : Placeholder, u : ref User, setLists : ref [SetList], setlist : SetList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String SetListsPlaceholder_ShowSetListEdit10_="";
private String ph_="";
private utils.RefArg u_=null;
private utils.RefArg setLists_=null;
private webdsl.generated.domain.SetList setlist_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=SetListsPlaceholder_ShowSetListEdit10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SetListsPlaceholder_ShowSetListEdit0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=SetListsPlaceholder_ShowSetListEdit10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.SetListsPlaceholder_ShowSetListEdit0().run(threadLocalPageCached,getEnv(),getElementsContext(),ph_,setlist_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+SetListsPlaceholder_ShowSetListEdit10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+SetListsPlaceholder_ShowSetListEdit10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group-item list-group-item-action");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-toggle","modal"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#phModal"));
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall19038320730","SetListCardSetList",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{setlist_},"SetListCardSetList"),new org.webdsl.lang.Environment(env).putWithcall("elements#SetListCardSetList",utils.TemplateCall.EmptyElementsCall),"SetListCardSetList",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SetListCardSetList(setlist) at dashboard.app:390/14");
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+SetListsPlaceholder_ShowSetListEdit10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+SetListsPlaceholder_ShowSetListEdit10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group-item list-group-item-action");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-toggle","modal"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#phModal"));
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall19038320730","SetListCardSetList",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{setlist_},"SetListCardSetList"),new org.webdsl.lang.Environment(env).putWithcall("elements#SetListCardSetList",utils.TemplateCall.EmptyElementsCall),"SetListCardSetList",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SetListCardSetList(setlist) at dashboard.app:390/14");
}
out.print("</a>");
}
break;}}
}
