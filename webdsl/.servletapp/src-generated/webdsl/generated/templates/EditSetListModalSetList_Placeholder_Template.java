package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_Placeholder_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_s_ad1String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_ta3SetList_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_ta1SetList_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_ta0SetList_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_s_ad0String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class,null,staticEnv))))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_s_ad0String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_ta0SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_ta1SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_ta3SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_s_ad1String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_Placeholder":keyOverwrite,EditSetListModalSetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
cPh_=(String)args[1];
}
public String getUniqueName(){
return "EditSetListModalSetList_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate EditSetListModal(setlist : SetList, cPh : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "EditSetListModalSetList_Placeholder";
}
else {
return calledName;
}
}
private static String c$6(webdsl.generated.domain.SetList setlist__){
try{
Object v=setlist__.getTitle();
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
private webdsl.generated.domain.SetList setlist_=null;
private String cPh_="";
private String songPh_=null;
public String getSongPh_(){
return songPh_;
}
public void setSongPh_(String songPh_){
this.songPh_=songPh_;
}
private String memberPh_=null;
public String getMemberPh_(){
return memberPh_;
}
public void setMemberPh_(String memberPh_){
this.memberPh_=memberPh_;
}
private java.util.Set<webdsl.generated.domain.User> nonPendingMembers_;
public java.util.Set<webdsl.generated.domain.User> getNonPendingMembers_(){
return nonPendingMembers_;
}
public void setNonPendingMembers_(java.util.Set<webdsl.generated.domain.User> nonPendingMembers_){
this.nonPendingMembers_=nonPendingMembers_;
}
private java.util.Set<webdsl.generated.domain.User> nonPendingAdmins_;
public java.util.Set<webdsl.generated.domain.User> getNonPendingAdmins_(){
return nonPendingAdmins_;
}
public void setNonPendingAdmins_(java.util.Set<webdsl.generated.domain.User> nonPendingAdmins_){
this.nonPendingAdmins_=nonPendingAdmins_;
}
private java.util.Set<webdsl.generated.domain.User> pendingMembers_;
public java.util.Set<webdsl.generated.domain.User> getPendingMembers_(){
return pendingMembers_;
}
public void setPendingMembers_(java.util.Set<webdsl.generated.domain.User> pendingMembers_){
this.pendingMembers_=pendingMembers_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-header row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(classattrs,"col");
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
utils.RenderUtils.printPageString(""+"Edit Setlist "+c$6(setlist_),out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h5"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(classattrs,"col d-flex justify-content-end");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall10902083820","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSetListModalSetList_Placeholder_OnLive1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSetListModalSetList_Placeholder_s_ad0String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS",getElementsContext(),new Object[]{setlist_,cPh_,songPh_,memberPh_,new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template0(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template1(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template2(EditSetListModalSetList_Placeholder_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSetListModalSetList_Placeholder_OnLive1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"modal-body row");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm col-md-3 border-end");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementid:"")+("form10902083820"+getUniqueId());
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
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall10902083823","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSetListModalSetList_Placeholder_ta0SetList_Placeholder",getElementsContext(),new Object[]{setlist_,cPh_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title:\") at dashmodal.app:310/12");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall10902083825","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Short description:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSetListModalSetList_Placeholder_ta1SetList_Placeholder",getElementsContext(),new Object[]{setlist_,cPh_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Short description:\") at dashmodal.app:316/12");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall10902083827","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Setlist Deadline:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("EditSetListModalSetList_Placeholder_ta3SetList_Placeholder",getElementsContext(),new Object[]{setlist_,cPh_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Setlist Deadline:\") at dashmodal.app:320/12");
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
utils.TemplateCall.appendWithPadding(classattrs,"mt-3 d-flex justify-content-center");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall10902083829","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSetListModalSetList_Placeholder_OnSave1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSetListModalSetList_Placeholder_s_ad1String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS",getElementsContext(),new Object[]{setlist_,cPh_,songPh_,memberPh_,new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template0(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template1(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template2(EditSetListModalSetList_Placeholder_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSetListModalSetList_Placeholder_OnSave1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall109020838212","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSetListModalSetList_Placeholder_OnDelete1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS",getElementsContext(),new Object[]{setlist_,cPh_,songPh_,memberPh_,new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template0(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template1(EditSetListModalSetList_Placeholder_Template.this),new webdsl.generated.templates.RefArg_EditSetListModalSetList_Placeholder_Template2(EditSetListModalSetList_Placeholder_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSetListModalSetList_Placeholder_OnDelete1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm col-md-9");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
java.io.StringWriter tmpstringwriter0=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+memberPh_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter0=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter0);
utils.ThreadLocalOut.push(out);
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall109020838215","userSearchUser_String_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{setlist_.getOwner(),"",memberPh_},"userSearchUser_String_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#userSearchUser_String_Placeholder",utils.TemplateCall.EmptyElementsCall),"userSearchUser_String_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"userSearchUser_String_Placeholder(setlist.owner, \"\", memberPh) at dashmodal.app:337/33");
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring0=tmpstringwriter0.toString();
out.write(tmpstring0);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+memberPh_),tmpstring0);
out.print("</"+"div"+">");
}
java.io.StringWriter tmpstringwriter1=null;
if(RENDER_PHASE==phase){
out.print("<"+"div"+" id=\""+utils.URLFilter.filter(""+songPh_)+"\" class=\"webdsl-placeholder\">");
tmpstringwriter1=new java.io.StringWriter();
out=new java.io.PrintWriter(tmpstringwriter1);
utils.ThreadLocalOut.push(out);
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall109020838217","songSearchString_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"",songPh_},"songSearchString_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#songSearchString_Placeholder",utils.TemplateCall.EmptyElementsCall),"songSearchString_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"songSearchString_Placeholder(\"\", songPh) at dashmodal.app:338/31");
}
if(RENDER_PHASE==phase){
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
String tmpstring1=tmpstringwriter1.toString();
out.write(tmpstring1);
threadLocalPageCached.addReRenderPlaceholdersContent(utils.URLFilter.filter(""+songPh_),tmpstring1);
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
}
protected void initializeLocalVarsOnce(){
songPh_="songPh_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
memberPh_="memberPh_"+utils.TemplateServlet.getCurrentTemplate().getUniqueId();
}
protected void initializeLocalVars(){
nonPendingMembers_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
nonPendingAdmins_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
pendingMembers_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
}
}
