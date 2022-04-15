package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_LUserL_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor5546821970(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchString_LUserL_Placeholder_ta0String_LUserL_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchString_LUserL_Placeholder_s_ad0String_String_LUserL_Placeholder_String_User_Template.class,null,staticEnv));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(userSearchString_LUserL_Placeholder_s_ad0String_String_LUserL_Placeholder_String_User_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(userSearchString_LUserL_Placeholder_ta0String_LUserL_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_LUserL_Placeholder":keyOverwrite,userSearchString_LUserL_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_LUserL_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
users_=(java.util.List<webdsl.generated.domain.User>)args[1];
ph_=(String)args[2];
}
public String getUniqueName(){
return "userSearchString_LUserL_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate userSearch(query : String, users : [User], ph : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "userSearchString_LUserL_Placeholder";
}
else {
return calledName;
}
}
private String query_="";
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private String ph_="";
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
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementid:"")+("form14560411110"+getUniqueId());
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
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action14560411110"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.userSearchString_LUserL_Placeholder_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action14560411110"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.userSearchString_LUserL_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),new webdsl.generated.templates.RefArg_userSearchString_LUserL_Placeholder_Template0(userSearchString_LUserL_Placeholder_Template.this),ph_,users_,new webdsl.generated.templates.RefArg_userSearchString_LUserL_Placeholder_Template0(userSearchString_LUserL_Placeholder_Template.this),ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action14560411110"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall14560411110","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_userSearchString_LUserL_Placeholder_Template0(userSearchString_LUserL_Placeholder_Template.this)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newQuery) at dashmodal.app:288/6");
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
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for14560411110"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=webdsl.generated.domain.User._static_searchUser_(newQuery_+"*",10);
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor5546821970(list1,true);
prefetchFor5546821970(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for14560411110"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User m_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(m_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)m_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14560411112","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"userSearchString_LUserL_Placeholder_ia1_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("userSearchString_LUserL_Placeholder_s_ad0String_String_LUserL_Placeholder_String_User",getElementsContext(),new Object[]{query_,users_,ph_,new webdsl.generated.templates.RefArg_userSearchString_LUserL_Placeholder_Template0(userSearchString_LUserL_Placeholder_Template.this),m_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"userSearchString_LUserL_Placeholder_ia1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid0;
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementid="0";
fallbackcounter=0;
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall14560411115","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Add"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("userSearchString_LUserL_Placeholder_ta0String_LUserL_Placeholder",getElementsContext(),new Object[]{query_,users_,ph_},attrs)),"labelString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Add\") at dashmodal.app:301/4");
}
}
protected void initializeLocalVarsOnce(){
newQuery_=query_;
}
}
