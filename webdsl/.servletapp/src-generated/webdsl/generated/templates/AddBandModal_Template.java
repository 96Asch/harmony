package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_s_ad0String_Band_LUserL_LSetListL_SUserS_SUserS_SSetListS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_ta4Band_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_ta3LSetListL_SSetListS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_ta2LUserL_SUserS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_ta1LUserL_SUserS_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddBandModal_ta0Band_Template.class,null,staticEnv))))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_ta0Band_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_ta1LUserL_SUserS_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_ta2LUserL_SUserS_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_ta3LSetListL_SSetListS_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_ta4Band_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(AddBandModal_s_ad0String_Band_LUserL_LSetListL_SUserS_SUserS_SSetListS_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal":keyOverwrite,AddBandModal_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "AddBandModal";
}
public String getTemplateSignature(){
return "ajaxtemplate AddBandModal()";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "AddBandModal";
}
else {
return calledName;
}
}
private webdsl.generated.domain.Band band_;
public webdsl.generated.domain.Band getBand_(){
return band_;
}
public void setBand_(webdsl.generated.domain.Band band_){
this.band_=band_;
}
private java.util.List<webdsl.generated.domain.User> eligibleUsers_;
public java.util.List<webdsl.generated.domain.User> getEligibleUsers_(){
return eligibleUsers_;
}
public void setEligibleUsers_(java.util.List<webdsl.generated.domain.User> eligibleUsers_){
this.eligibleUsers_=eligibleUsers_;
}
private java.util.List<webdsl.generated.domain.SetList> eligibleSetlists_;
public java.util.List<webdsl.generated.domain.SetList> getEligibleSetlists_(){
return eligibleSetlists_;
}
public void setEligibleSetlists_(java.util.List<webdsl.generated.domain.SetList> eligibleSetlists_){
this.eligibleSetlists_=eligibleSetlists_;
}
private java.util.Set<webdsl.generated.domain.User> members_;
public java.util.Set<webdsl.generated.domain.User> getMembers_(){
return members_;
}
public void setMembers_(java.util.Set<webdsl.generated.domain.User> members_){
this.members_=members_;
}
private java.util.Set<webdsl.generated.domain.User> admins_;
public java.util.Set<webdsl.generated.domain.User> getAdmins_(){
return admins_;
}
public void setAdmins_(java.util.Set<webdsl.generated.domain.User> admins_){
this.admins_=admins_;
}
private java.util.Set<webdsl.generated.domain.SetList> setlists_;
public java.util.Set<webdsl.generated.domain.SetList> getSetlists_(){
return setlists_;
}
public void setSetlists_(java.util.Set<webdsl.generated.domain.SetList> setlists_){
this.setlists_=setlists_;
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
utils.RenderUtils.printPageString("Add Band",out,threadLocalPageCached.isRawoutput());
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
ident=(inForLoop?forelementid:"")+("form5826666250"+getUniqueId());
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
utils.TemplateCall.appendWithPadding(classattrs,"col-6");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5826666250","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Band Name:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("AddBandModal_ta0Band",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template0(AddBandModal_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Band Name:\") at dashmodal.app:171/14");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5826666252","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Add member"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("AddBandModal_ta1LUserL_SUserS",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template1(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template2(AddBandModal_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Add member\") at dashmodal.app:174/14");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5826666254","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Add admins"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("AddBandModal_ta2LUserL_SUserS",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template1(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template3(AddBandModal_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Add admins\") at dashmodal.app:176/14");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-6");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5826666256","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Add setlists"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("AddBandModal_ta3LSetListL_SSetListS",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template4(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template5(AddBandModal_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Add setlists\") at dashmodal.app:180/14");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5826666258","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Band Description:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("AddBandModal_ta4Band",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template0(AddBandModal_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Band Description:\") at dashmodal.app:182/14");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall58266662510","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"AddBandModal_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("AddBandModal_s_ad0String_Band_LUserL_LSetListL_SUserS_SUserS_SSetListS",getElementsContext(),new Object[]{new webdsl.generated.templates.RefArg_AddBandModal_Template0(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template1(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template4(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template2(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template3(AddBandModal_Template.this),new webdsl.generated.templates.RefArg_AddBandModal_Template5(AddBandModal_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"AddBandModal_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
protected void initializeLocalVars(){
band_=webdsl.generated.domain.Band._static_createEmpty_();
eligibleUsers_=webdsl.generated.functions.AddBandModal_listCompr0_.AddBandModal_listCompr0_();
eligibleSetlists_=webdsl.generated.functions.AddBandModal_listCompr1_.AddBandModal_listCompr1_();
members_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
admins_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
setlists_=new java.util.LinkedHashSet<webdsl.generated.domain.SetList>();
}
}
