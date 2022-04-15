package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_s_ad1String_Placeholder_SetList_LUserL_LSongL_LUserL_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_s_ad1String_Placeholder_SetList_LUserL_LSongL_LUserL_String":keyOverwrite,AddSetListModal_s_ad1String_Placeholder_SetList_LUserL_LSongL_LUserL_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_s_ad1String_Placeholder_SetList_LUserL_LSongL_LUserL_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
AddSetListModal_ia20_=(String)args[0];
results_=(String)args[1];
setlist_=(utils.RefArg)args[2];
eligibleUsers_=(utils.RefArg)args[3];
eligibleSongs_=(utils.RefArg)args[4];
userList_=(utils.RefArg)args[5];
newQuery_=(utils.RefArg)args[6];
}
public String getUniqueName(){
return "AddSetListModal_s_ad1String_Placeholder_SetList_LUserL_LSongL_LUserL_String";
}
public String getTemplateSignature(){
return "template AddSetListModal_s_ad1(AddSetListModal_ia20 : String, results : Placeholder, setlist : ref SetList, eligibleUsers : ref [User], eligibleSongs : ref [Song], userList : ref [User], newQuery : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String AddSetListModal_ia20_="";
private String results_="";
private utils.RefArg setlist_=null;
private utils.RefArg eligibleUsers_=null;
private utils.RefArg eligibleSongs_=null;
private utils.RefArg userList_=null;
private utils.RefArg newQuery_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=AddSetListModal_ia20_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.AddSetListModal_ia2.isValidationDisabled();
}
break;case ACTION_PHASE:ident=AddSetListModal_ia20_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.AddSetListModal_ia2().run(threadLocalPageCached,getEnv(),getElementsContext(),results_,ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+AddSetListModal_ia20_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+AddSetListModal_ia20_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("search",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+AddSetListModal_ia20_+"\"");
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
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("search",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
