package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==5){
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
staticEnv.putTemplate(keyOverwrite==null?"SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song":keyOverwrite,SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
SongsPlaceholder_OnShowSongEdit10_=(String)args[0];
ph_=(String)args[1];
username_=(utils.RefArg)args[2];
songs_=(utils.RefArg)args[3];
song_=(webdsl.generated.domain.Song)args[4];
}
public String getUniqueName(){
return "SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song";
}
public String getTemplateSignature(){
return "template SongsPlaceholder_s_ad2(SongsPlaceholder_OnShowSongEdit10 : String, ph : Placeholder, username : ref String, songs : ref [Song], song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String SongsPlaceholder_OnShowSongEdit10_="";
private String ph_="";
private utils.RefArg username_=null;
private utils.RefArg songs_=null;
private webdsl.generated.domain.Song song_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=SongsPlaceholder_OnShowSongEdit10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SongsPlaceholder_OnShowSongEdit0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=SongsPlaceholder_OnShowSongEdit10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.SongsPlaceholder_OnShowSongEdit0().run(threadLocalPageCached,getEnv(),getElementsContext(),song_,ph_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+SongsPlaceholder_OnShowSongEdit10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+SongsPlaceholder_OnShowSongEdit10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("id",song_.getId()));
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5968102600","SongCardSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_},"SongCardSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongCardSong",utils.TemplateCall.EmptyElementsCall),"SongCardSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongCardSong(song) at dashboard.app:203/14");
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+SongsPlaceholder_OnShowSongEdit10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+SongsPlaceholder_OnShowSongEdit10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("id",song_.getId()));
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5968102600","SongCardSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_},"SongCardSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongCardSong",utils.TemplateCall.EmptyElementsCall),"SongCardSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongCardSong(song) at dashboard.app:203/14");
}
out.print("</a>");
}
break;}}
}
