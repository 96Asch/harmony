package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class Live_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LiveSetList_Int_s_ad1String_SetList_Int_Int_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LiveSetList_Int_s_ad0String_SetList_Int_Int_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LiveSetList_Int_ta0SetList_Int_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(LiveSetList_Int_ta0SetList_Int_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(LiveSetList_Int_s_ad0String_SetList_Int_Int_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(LiveSetList_Int_s_ad1String_SetList_Int_Int_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"Live":keyOverwrite,Live_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(Live_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
index_=(Integer)args[1];
}
public String getUniqueName(){
return "Live";
}
public String getTemplateSignature(){
return "page Live(setlist : SetList, index : Int)";
}
public String getElementsContext(){
if(calledName==null){
return "Live";
}
else {
return calledName;
}
}
private webdsl.generated.domain.SetList setlist_=null;
private Integer index_=0;
private Integer pageIndex_;
public Integer getPageIndex_(){
return pageIndex_;
}
public void setPageIndex_(Integer pageIndex_){
this.pageIndex_=pageIndex_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14314986920","head",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"head"),new org.webdsl.lang.Environment(env).putWithcall("elements#head",new utils.TemplateCall("LiveSetList_Int_ta0SetList_Int",getElementsContext(),new Object[]{setlist_,index_},attrs)),"head",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"head() at live.app:8/4");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall14314986922","DashHeaderWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashHeaderWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashHeaderWaves",utils.TemplateCall.EmptyElementsCall),"DashHeaderWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashHeaderWaves() at live.app:35/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14314986924","HeaderString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{setlist_.getTitle()},"HeaderString"),new org.webdsl.lang.Environment(env).putWithcall("elements#HeaderString",utils.TemplateCall.EmptyElementsCall),"HeaderString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"HeaderString(setlist.title) at live.app:36/6");
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
utils.TemplateCall.appendWithPadding(classattrs,"row d-flex justify-content-center front");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14314986926","SongViewerSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{(webdsl.generated.domain.Song)setlist_.getSongs().get(pageIndex_)},"SongViewerSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongViewerSong",utils.TemplateCall.EmptyElementsCall),"SongViewerSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongViewerSong(setlist.songs.get(pageIndex)) at live.app:38/7");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"row modal-footer d-flex justify-content-center front");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if14314986920"+forelementid))==null){
if0=!(org.webdsl.tools.Utils.equal(setlist_.getSongs().size(),null)||org.webdsl.tools.Utils.equal(1,null))&&setlist_.getSongs().size()>1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if14314986920"+forelementid,if0);
}
}
if(if0){
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
utils.TemplateCall.appendWithPadding(classattrs,"w-25 btn-group");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14314986928","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"LiveSetList_Int_OnPrevSong1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("LiveSetList_Int_s_ad0String_SetList_Int_Int",getElementsContext(),new Object[]{setlist_,index_,new webdsl.generated.templates.RefArg_Live_Template0(Live_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"LiveSetList_Int_OnPrevSong1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall143149869211","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"LiveSetList_Int_OnNextSong1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("LiveSetList_Int_s_ad1String_SetList_Int_Int",getElementsContext(),new Object[]{setlist_,index_,new webdsl.generated.templates.RefArg_Live_Template0(Live_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"LiveSetList_Int_OnNextSong1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall143149869214","DashFooterWaves",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"DashFooterWaves"),new org.webdsl.lang.Environment(env).putWithcall("elements#DashFooterWaves",utils.TemplateCall.EmptyElementsCall),"DashFooterWaves",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"DashFooterWaves() at live.app:53/5");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall143149869216","ChoInterpreterJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"ChoInterpreterJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#ChoInterpreterJS",utils.TemplateCall.EmptyElementsCall),"ChoInterpreterJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"ChoInterpreterJS() at live.app:56/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall143149869218","BootstrapJS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"BootstrapJS"),new org.webdsl.lang.Environment(env).putWithcall("elements#BootstrapJS",utils.TemplateCall.EmptyElementsCall),"BootstrapJS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"BootstrapJS() at live.app:57/5");
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagepredicate_Live0SetList_Int_.genpagepredicate_Live0SetList_Int_(setlist_,index_)){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
protected void initializeLocalVars(){
pageIndex_=index_;
}
}
