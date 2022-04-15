package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Dashboards_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Dashboards":keyOverwrite,Dashboards_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Dashboards_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "Dashboards";
}
public String getTemplateSignature(){
return "page Dashboards()";
}
public String getElementsContext(){
if(calledName==null){
return "Dashboards";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569575710","BootstrapHeader",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapHeader"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapHeader",utils.TemplateCall.EmptyElementsCall),"BootstrapHeader",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapHeader() at dashboard.app:33/4");
}
if(RENDER_PHASE==phase){
out.print("<style");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
out.print(".icon {\n      width : 50px;\n      height : 50px;\n    }\n    \n    .invite-icon {\n      width : 15px;\n      height: 15px;\n    }\n    \n    .setlistinvite {\n      background-color : #66ff66;\n    }\n    \n    .bandinvite {\n      background-color : #ffcc66;\n    }\n  ");
out.print("</style>");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569575712","Header",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Header"),new org.webdsl.lang.Environment(env).putWithcall("elements#Header",utils.TemplateCall.EmptyElementsCall),"Header",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Header() at dashboard.app:57/6");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569575714","NotificationsLNotificationL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboards_listCompr0_.Dashboards_listCompr0_()},"NotificationsLNotificationL"),new org.webdsl.lang.Environment(env).putWithcall("elements#NotificationsLNotificationL",utils.TemplateCall.EmptyElementsCall),"NotificationsLNotificationL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"NotificationsLNotificationL(Dashboards_listCompr0()) at dashboard.app:62/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569575716","SongsLSongL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboards_listCompr1_.Dashboards_listCompr1_()},"SongsLSongL"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongsLSongL",utils.TemplateCall.EmptyElementsCall),"SongsLSongL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongsLSongL(Dashboards_listCompr1()) at dashboard.app:63/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_569575718","BandsLBandL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboards_listCompr2_.Dashboards_listCompr2_()},"BandsLBandL"),new org.webdsl.lang.Environment(env).putWithcall("elements#BandsLBandL",utils.TemplateCall.EmptyElementsCall),"BandsLBandL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BandsLBandL(Dashboards_listCompr2()) at dashboard.app:64/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5695757110","SetListsLSetListL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.functions.Dashboards_listCompr3_.Dashboards_listCompr3_()},"SetListsLSetListL"),new org.webdsl.lang.Environment(env).putWithcall("elements#SetListsLSetListL",utils.TemplateCall.EmptyElementsCall),"SetListsLSetListL",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SetListsLSetListL(Dashboards_listCompr3()) at dashboard.app:65/11");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5695757112","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at dashboard.app:70/5");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_Dashboards0_.genpagecombined_Dashboards0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
