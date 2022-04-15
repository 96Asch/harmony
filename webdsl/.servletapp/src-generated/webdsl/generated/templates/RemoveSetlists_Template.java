package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RemoveSetlists_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.RemoveSetlists_s_ad0String_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.RemoveSetlists_ta0_Template.class,null,staticEnv));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(RemoveSetlists_ta0_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(RemoveSetlists_s_ad0String_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RemoveSetlists":keyOverwrite,RemoveSetlists_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RemoveSetlists_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "RemoveSetlists";
}
public String getTemplateSignature(){
return "page RemoveSetlists()";
}
public String getElementsContext(){
if(calledName==null){
return "RemoveSetlists";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall17264286260","head",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"head"),new org.webdsl.lang.Environment(env).putWithcall("elements#head",new utils.TemplateCall("RemoveSetlists_ta0",getElementsContext(),org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,attrs)),"head",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"head() at remove.app:8/4");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall17264286262","DashHeaderWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashHeaderWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashHeaderWaves",utils.TemplateCall.EmptyElementsCall),"DashHeaderWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashHeaderWaves() at remove.app:19/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall17264286264","Header",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Header"),new org.webdsl.lang.Environment(env).putWithcall("elements#Header",utils.TemplateCall.EmptyElementsCall),"Header",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Header() at remove.app:20/5");
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
utils.TemplateCall.appendWithPadding(classattrs,"row vh-50");
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
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall17264286266","slSearchString_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"",ph_},"slSearchString_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#slSearchString_Placeholder",utils.TemplateCall.EmptyElementsCall),"slSearchString_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"slSearchString_Placeholder(\"\", ph) at remove.app:23/23");
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
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall17264286268","ConfirmRemoveSLModalString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"deleteSL"},"ConfirmRemoveSLModalString"),new org.webdsl.lang.Environment(env).putWithcall("elements#ConfirmRemoveSLModalString",utils.TemplateCall.EmptyElementsCall),"ConfirmRemoveSLModalString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"ConfirmRemoveSLModalString(\"deleteSL\") at remove.app:26/5");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn-group");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall172642862610","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"RemoveSetlists_OnCancel1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("RemoveSetlists_s_ad0String_Placeholder",getElementsContext(),new Object[]{ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"RemoveSetlists_OnCancel1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("<"+"button");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-danger ml-3 p-2");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("type","button"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-toggle","modal"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#deleteSL"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<img src=\""+threadLocalPageCached.getAbsoluteLocation());
try{
utils.RenderUtils.printPageString("/images/trash.png",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
out.print("\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"button-icon");
if(!ignorecols.contains("image")){
AttributeCollectionLookup.getAttributeCollection("image",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("</"+"button"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall172642862613","DashFooterWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashFooterWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashFooterWaves",utils.TemplateCall.EmptyElementsCall),"DashFooterWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashFooterWaves() at remove.app:35/5");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall172642862615","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at remove.app:37/4");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
}
protected void initializeLocalVarsOnce(){
ph_="ph_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
}
}
