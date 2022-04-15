package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_ModalType_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.Song> elems0=new java.util.ArrayList<webdsl.generated.domain.Song>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Song")){
elems0.add((webdsl.generated.domain.Song)ent);
}
}
}
if(i==2){
java.util.ArrayList<webdsl.generated.domain.ModalType> elems1=new java.util.ArrayList<webdsl.generated.domain.ModalType>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ModalType")){
elems1.add((webdsl.generated.domain.ModalType)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_s_ad0String_Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta5Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta4Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta3Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta2Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta1Song_ModalType_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_ta0Song_ModalType_Template.class,null,staticEnv)))))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta0Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta1Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta2Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta3Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta4Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_ta5Song_ModalType_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_s_ad0String_Song_ModalType_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_ModalType":keyOverwrite,EditSongModalSong_ModalType_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_ModalType_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
type_=(webdsl.generated.domain.ModalType)args[1];
}
public String getUniqueName(){
return "EditSongModalSong_ModalType";
}
public String getTemplateSignature(){
return "ajaxtemplate EditSongModal(song : Song, type : ModalType)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "EditSongModalSong_ModalType";
}
else {
return calledName;
}
}
private static String c$13(webdsl.generated.domain.ModalType type__){
try{
Object v=type__.getName();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private webdsl.generated.domain.Song song_=null;
private webdsl.generated.domain.ModalType type_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_11580233350"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_ModalType_.gentemplatepredicate_EditSongModal0Song_ModalType_(song_,type_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11580233350"+forelementid,if1);
}
}
if(if1){
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-content");
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-header d-flex justify-content-center");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"h5");
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-title");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString(""+c$13(type_)+" Song",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h5"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-body");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementid:"")+("form_11580233350"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw1=null;
java.io.StringWriter sw0=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw1=new java.io.StringWriter();
out=new java.io.PrintWriter(sw1);
utils.ThreadLocalOut.push(out);
}
out.print("<form name=\""+ident+"\" id=\""+ident+"\" action=\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()+threadLocalPageCached.getExtraQueryArguments("?"))+"\" accept-charset=\"UTF-8\" method=\"POST\"");
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
if(!ignorecols.contains("form")){
AttributeCollectionLookup.getAttributeCollection("form",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
utils.ThreadLocalOut.push(out);
out.print(">");
out.print("<input type=\"hidden\" name=\""+ident+"\" value=\"1\" />");
out.print(threadLocalPageCached.getHiddenParams());
}
if(RENDER_PHASE==phase||threadLocalPageCached.inSubmittedForm()){
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
utils.TemplateCall.appendWithPadding(classattrs,"col-3");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11580233350","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta0Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title:\") at dashmodal.app:132/11");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11580233352","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"BPM:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta1Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"BPM:\") at dashmodal.app:135/11");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11580233354","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Key:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta2Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Key:\") at dashmodal.app:138/11");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11580233356","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Genre:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta3Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Genre:\") at dashmodal.app:141/14");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11580233358","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Reference Track:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta4Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Reference Track:\") at dashmodal.app:142/14");
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
utils.TemplateCall.appendWithPadding(classattrs,"form-check form-check-inline");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-label");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_115802333510","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Public:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSongModalSong_ModalType_ta5Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Public:\") at dashmodal.app:145/11");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-9");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_115802333512","SongViewSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_},"SongViewSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongViewSong",utils.TemplateCall.EmptyElementsCall),"SongViewSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongViewSong(song) at dashmodal.app:149/13");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-footer mt-3 d-flex justify-content-center");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_115802333514","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSongModalSong_ModalType_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSongModalSong_ModalType_s_ad0String_Song_ModalType",getElementsContext(),new Object[]{song_,type_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSongModalSong_ModalType_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</form>");
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(threadLocalPageCached.formRequiresMultipartEnc){
out.write(" enctype=\"multipart/form-data\"");
}
out.write(sw0.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
utils.ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw1.toString();
}
else {
out=utils.ThreadLocalOut.peek();
out.write(threadLocalPageCached.submittedFormContent);
}
}
threadLocalPageCached.formRequiresMultipartEnc=false;
}
threadLocalPageCached.setInSubmittedForm(false);
threadLocalPageCached.setFormIdent("");
threadLocalPageCached.leaveForm();
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
}
