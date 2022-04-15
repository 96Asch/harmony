package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24String_String_SUserS_Song_Placeholder_Bool_Bool_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==4){
java.util.ArrayList<webdsl.generated.domain.Song> elems0=new java.util.ArrayList<webdsl.generated.domain.Song>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Song")){
elems0.add((webdsl.generated.domain.Song)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24String_String_SUserS_Song_Placeholder_Bool_Bool":keyOverwrite,songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24String_String_SUserS_Song_Placeholder_Bool_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24String_String_SUserS_Song_Placeholder_Bool_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_=(String)args[0];
songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong10_=(String)args[1];
editors_=(java.util.Set<webdsl.generated.domain.User>)args[2];
song_=(webdsl.generated.domain.Song)args[3];
ph_=(String)args[4];
searchPublic_=(Boolean)args[5];
multipleAllowed_=(Boolean)args[6];
}
public String getUniqueName(){
return "songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24String_String_SUserS_Song_Placeholder_Bool_Bool";
}
public String getTemplateSignature(){
return "template songButtonBarSUserS_Song_Placeholder_Bool_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Bo24(songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24 : String, songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong10 : String, editors : {User}, song : Song, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_="";
private String songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong10_="";
private java.util.Set<webdsl.generated.domain.User> editors_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private webdsl.generated.domain.Song song_=null;
private String ph_="";
private Boolean searchPublic_=false;
private Boolean multipleAllowed_=false;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong0().run(threadLocalPageCached,getEnv(),getElementsContext(),((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),song_,multipleAllowed_,searchPublic_,ph_,song_,editors_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+songButtonBarSUserS_Song_Placeholder_Bool_Bool_RemoveSong24_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
