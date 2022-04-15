package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class test_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"test":keyOverwrite,test_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(test_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "test";
}
public String getTemplateSignature(){
return "page test()";
}
public String getElementsContext(){
if(calledName==null){
return "test";
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
out.print(".icon {\n      width : 25px;\n      height : 25px;\n    }\n  ");
out.print("</style>");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addStylesheetInclude("bootstrap.css");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("bootstrap.js");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall93444990","Header",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Header"),new org.webdsl.lang.Environment(env).putWithcall("elements#Header",utils.TemplateCall.EmptyElementsCall),"Header",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Header() at dashboard.app:20/6");
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
utils.TemplateCall.appendWithPadding(classattrs,"row m-2");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall93444992","OverviewLSongL_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{utils.HibernateUtil.getCurrentSession().createQuery("from Song").list(),"song"},"OverviewLSongL_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#OverviewLSongL_String",utils.TemplateCall.EmptyElementsCall),"OverviewLSongL_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"OverviewLSongL_String(from Song, \"song\") at dashboard.app:25/10");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall93444994","OverviewLSongL_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{utils.HibernateUtil.getCurrentSession().createQuery("from Song").list(),"setlist"},"OverviewLSongL_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#OverviewLSongL_String",utils.TemplateCall.EmptyElementsCall),"OverviewLSongL_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"OverviewLSongL_String(from Song, \"setlist\") at dashboard.app:27/11");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall93444996","OverviewLSongL_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{utils.HibernateUtil.getCurrentSession().createQuery("from Song").list(),"band"},"OverviewLSongL_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#OverviewLSongL_String",utils.TemplateCall.EmptyElementsCall),"OverviewLSongL_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"OverviewLSongL_String(from Song, \"band\") at dashboard.app:29/11");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_test0_.genpagecombined_test0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
