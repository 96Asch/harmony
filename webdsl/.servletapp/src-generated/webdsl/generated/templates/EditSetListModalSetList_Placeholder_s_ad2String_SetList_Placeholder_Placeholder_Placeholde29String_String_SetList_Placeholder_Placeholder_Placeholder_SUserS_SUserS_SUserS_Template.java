package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template extends utils.TemplateServlet{
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
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS":keyOverwrite,EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSetListModalSetList_Placeholder_OnDelete23_=(String)args[0];
EditSetListModalSetList_Placeholder_OnDelete10_=(String)args[1];
setlist_=(webdsl.generated.domain.SetList)args[2];
cPh_=(String)args[3];
songPh_=(String)args[4];
memberPh_=(String)args[5];
nonPendingMembers_=(utils.RefArg)args[6];
nonPendingAdmins_=(utils.RefArg)args[7];
pendingMembers_=(utils.RefArg)args[8];
}
public String getUniqueName(){
return "EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29(EditSetListModalSetList_Placeholder_OnDelete23 : String, EditSetListModalSetList_Placeholder_OnDelete10 : String, setlist : SetList, cPh : Placeholder, songPh : Placeholder, memberPh : Placeholder, nonPendingMembers : ref {User}, nonPendingAdmins : ref {User}, pendingMembers : ref {User})";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSetListModalSetList_Placeholder_OnDelete23_="";
private String EditSetListModalSetList_Placeholder_OnDelete10_="";
private webdsl.generated.domain.SetList setlist_=null;
private String cPh_="";
private String songPh_="";
private String memberPh_="";
private utils.RefArg nonPendingMembers_=null;
private utils.RefArg nonPendingAdmins_=null;
private utils.RefArg pendingMembers_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=EditSetListModalSetList_Placeholder_OnDelete23_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.EditSetListModalSetList_Placeholder_OnDelete0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=EditSetListModalSetList_Placeholder_OnDelete23_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.EditSetListModalSetList_Placeholder_OnDelete0().run(threadLocalPageCached,getEnv(),getElementsContext(),cPh_,setlist_,cPh_,setlist_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+EditSetListModalSetList_Placeholder_OnDelete23_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+EditSetListModalSetList_Placeholder_OnDelete23_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-primary p-3 w-50 p-2");
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Delete",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+EditSetListModalSetList_Placeholder_OnDelete23_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+EditSetListModalSetList_Placeholder_OnDelete23_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-primary p-3 w-50 p-2");
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Delete",out,threadLocalPageCached.isRawoutput());
}
out.print("</a>");
}
break;}}
}
