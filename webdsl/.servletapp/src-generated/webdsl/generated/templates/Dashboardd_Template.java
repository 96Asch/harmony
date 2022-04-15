package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Dashboardd_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Dashboardd":keyOverwrite,Dashboardd_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Dashboardd_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "Dashboardd";
}
public String getTemplateSignature(){
return "page Dashboardd()";
}
public String getElementsContext(){
if(calledName==null){
return "Dashboardd";
}
else {
return calledName;
}
}
private String ph_=null;
public String getPh_(){
return ph_;
}
public void setPh_(String ph_){
this.ph_=ph_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569946600","BootstrapHeader",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapHeader"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapHeader",utils.TemplateCall.EmptyElementsCall),"BootstrapHeader",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapHeader() at dashboard.app:167/4");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569946602","DashCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashCSS",utils.TemplateCall.EmptyElementsCall),"DashCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashCSS() at dashboard.app:168/4");
}
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
utils.TemplateCall.appendWithPadding(classattrs,"container");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569946604","Header",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Header"),new org.webdsl.lang.Environment(env).putWithcall("elements#Header",utils.TemplateCall.EmptyElementsCall),"Header",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Header() at dashboard.app:173/6");
}
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569946606","NotificationsLNotificationL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboardd_listCompr0_.Dashboardd_listCompr0_()},"NotificationsLNotificationL"),new org.webdsl.lang.Environment(env).putWithcall("elements#NotificationsLNotificationL",utils.TemplateCall.EmptyElementsCall),"NotificationsLNotificationL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"NotificationsLNotificationL(Dashboardd_listCompr0()) at dashboard.app:177/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569946608","SongsLSongL_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboardd_listCompr1_.Dashboardd_listCompr1_(),ph_},"SongsLSongL_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongsLSongL_Placeholder",utils.TemplateCall.EmptyElementsCall),"SongsLSongL_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongsLSongL_Placeholder(Dashboardd_listCompr1(), ph) at dashboard.app:178/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5699466010","BandsLBandL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboardd_listCompr2_.Dashboardd_listCompr2_()},"BandsLBandL"),new org.webdsl.lang.Environment(env).putWithcall("elements#BandsLBandL",utils.TemplateCall.EmptyElementsCall),"BandsLBandL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BandsLBandL(Dashboardd_listCompr2()) at dashboard.app:179/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5699466012","SetListsLSetListL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboardd_listCompr3_.Dashboardd_listCompr3_()},"SetListsLSetListL"),new org.webdsl.lang.Environment(env).putWithcall("elements#SetListsLSetListL",utils.TemplateCall.EmptyElementsCall),"SetListsLSetListL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SetListsLSetListL(Dashboardd_listCompr3()) at dashboard.app:180/11");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5699466014","ClearNotificationModal",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"ClearNotificationModal"),new org.webdsl.lang.Environment(env).putWithcall("elements#ClearNotificationModal",utils.TemplateCall.EmptyElementsCall),"ClearNotificationModal",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"ClearNotificationModal() at dashboard.app:183/7");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5699466016","AddSongModal",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"AddSongModal"),new org.webdsl.lang.Environment(env).putWithcall("elements#AddSongModal",utils.TemplateCall.EmptyElementsCall),"AddSongModal",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"AddSongModal() at dashboard.app:184/7");
}
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
utils.TemplateCall.appendWithPadding(classattrs,"modal fade");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("id","editSong"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("tabindex","-1"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-dialog modal-dialog-centered");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter tmpstringwriter0=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+ph_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter0=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter0);
utils.ThreadLocalOut.push(out);
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring0=tmpstringwriter0.toString();
out.write(tmpstring0);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+ph_),tmpstring0);
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("chordproInterpreter.js");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5699466018","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at dashboard.app:197/5");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_Dashboardd0_.genpagecombined_Dashboardd0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVarsOnce(){
ph_="ph_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
}
}
