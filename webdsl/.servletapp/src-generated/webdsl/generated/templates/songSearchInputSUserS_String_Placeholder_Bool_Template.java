package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songSearchInputSUserS_String_Placeholder_Bool_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.songSearchInputSUserS_String_Placeholder_Bool_ta0SUserS_String_Placeholder_Bool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(songSearchInputSUserS_String_Placeholder_Bool_ta0SUserS_String_Placeholder_Bool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songSearchInputSUserS_String_Placeholder_Bool":keyOverwrite,songSearchInputSUserS_String_Placeholder_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songSearchInputSUserS_String_Placeholder_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editors_=(java.util.Set<webdsl.generated.domain.User>)args[0];
query_=(String)args[1];
ph_=(String)args[2];
searchPublic_=(Boolean)args[3];
}
public String getUniqueName(){
return "songSearchInputSUserS_String_Placeholder_Bool";
}
public String getTemplateSignature(){
return "template songSearchInput(editors : {User}, query : String, ph : Placeholder, searchPublic : Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "songSearchInputSUserS_String_Placeholder_Bool";
}
else {
return calledName;
}
}
private java.util.Set<webdsl.generated.domain.User> editors_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private String query_="";
private String ph_="";
private Boolean searchPublic_=false;
private String newQuery_;
public String getNewQuery_(){
return newQuery_;
}
public void setNewQuery_(String newQuery_){
this.newQuery_=newQuery_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if4163879970"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_Bool_.gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_Bool_(editors_,query_,ph_,searchPublic_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if4163879970"+forelementid,if0);
}
}
if(if0){
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementid:"")+("form4163879970"+getUniqueId());
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start mr-2");
handleTemplateCall(phase,inForLoop,forelementid,"tcall4163879972","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Add a song:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("songSearchInputSUserS_String_Placeholder_Bool_ta0SUserS_String_Placeholder_Bool_String",getElementsContext(),new Object[]{editors_,query_,ph_,searchPublic_,new webdsl.generated.templates.RefArg_songSearchInputSUserS_String_Placeholder_Bool_Template0(songSearchInputSUserS_String_Placeholder_Bool_Template.this)},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Add a song:\") at songsearch.app:12/6");
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
}
}
protected void initializeLocalVarsOnce(){
newQuery_=query_;
}
}
