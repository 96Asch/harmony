package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RemoveSongs_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.RemoveSongs_s_ad0String_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.RemoveSongs_ta0_Template.class,null,staticEnv));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(RemoveSongs_ta0_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(RemoveSongs_s_ad0String_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RemoveSongs":keyOverwrite,RemoveSongs_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RemoveSongs_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "RemoveSongs";
}
public String getTemplateSignature(){
return "page RemoveSongs()";
}
public String getElementsContext(){
if(calledName==null){
return "RemoveSongs";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_684151670","head",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"head"),new org.webdsl.lang.Environment(env).putWithcall("elements#head",new utils.TemplateCall("RemoveSongs_ta0",getElementsContext(),org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,attrs)),"head",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"head() at remove.app:43/4");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_684151672","DashHeaderWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashHeaderWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashHeaderWaves",utils.TemplateCall.EmptyElementsCall),"DashHeaderWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashHeaderWaves() at remove.app:54/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_684151674","Header",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Header"),new org.webdsl.lang.Environment(env).putWithcall("elements#Header",utils.TemplateCall.EmptyElementsCall),"Header",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Header() at remove.app:55/5");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_684151676","songSearchString_Placeholder_Bool_Bool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"",ph_,false,false},"songSearchString_Placeholder_Bool_Bool"),new org.webdsl.lang.Environment(env).putWithcall("elements#songSearchString_Placeholder_Bool_Bool",utils.TemplateCall.EmptyElementsCall),"songSearchString_Placeholder_Bool_Bool",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"songSearchString_Placeholder_Bool_Bool(\"\", ph, false, false) at remove.app:58/23");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_684151678","ConfirmRemoveSongModalString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"deleteSong"},"ConfirmRemoveSongModalString"),new org.webdsl.lang.Environment(env).putWithcall("elements#ConfirmRemoveSongModalString",utils.TemplateCall.EmptyElementsCall),"ConfirmRemoveSongModalString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"ConfirmRemoveSongModalString(\"deleteSong\") at remove.app:61/5");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_6841516710","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"RemoveSongs_OnCancel1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("RemoveSongs_s_ad0String_Placeholder",getElementsContext(),new Object[]{ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"RemoveSongs_OnCancel1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#deleteSong"));
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_6841516713","DashFooterWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashFooterWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashFooterWaves",utils.TemplateCall.EmptyElementsCall),"DashFooterWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashFooterWaves() at remove.app:69/5");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_6841516715","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at remove.app:71/4");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
}
protected void initializeLocalVarsOnce(){
ph_="ph_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
}
}
