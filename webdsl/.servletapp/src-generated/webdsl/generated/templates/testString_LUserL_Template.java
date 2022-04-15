package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class testString_LUserL_Template extends utils.TemplateServlet{
public void prefetchFor_8497111370(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.testString_LUserL_ta0String_LUserL_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(testString_LUserL_ta0String_LUserL_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"testString_LUserL":keyOverwrite,testString_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(testString_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
userList_=(java.util.List<webdsl.generated.domain.User>)args[1];
}
public String getUniqueName(){
return "testString_LUserL";
}
public String getTemplateSignature(){
return "ajaxtemplate test(query : String, userList : [User])";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "testString_LUserL";
}
else {
return calledName;
}
}
private String query_="";
private java.util.List<webdsl.generated.domain.User> userList_=new java.util.ArrayList<webdsl.generated.domain.User>();
private java.util.List<webdsl.generated.domain.User> searchList_;
public java.util.List<webdsl.generated.domain.User> getSearchList_(){
return searchList_;
}
public void setSearchList_(java.util.List<webdsl.generated.domain.User> searchList_){
this.searchList_=searchList_;
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_18983862760"+forelementid))==null){
if1=webdsl.generated.functions.genajaxtemplatecombined_test0String_LUserL_.genajaxtemplatecombined_test0String_LUserL_(query_,userList_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18983862760"+forelementid,if1);
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18983862760","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{query_},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(query) at dashmodal.app:509/9");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_18983862761"+forelementid))==null){
if0=org.webdsl.tools.Utils.equal(searchList_.size(),0);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18983862761"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18983862762","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"No users found"},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\"No users found\") at dashmodal.app:513/6");
}
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for_18983862760"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=searchList_;
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor_8497111370(list1,true);
prefetchFor_8497111370(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_18983862760"+forelementid,forcol0);
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
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_18983862760"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.testString_LUserL_onClick0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_18983862760"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.testString_LUserL_onClick0().run(threadLocalPageCached,getEnv(),getElementsContext(),m_,userList_,query_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"onclick","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_18983862760"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18983862764","div",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"div"),new org.webdsl.lang.Environment(env).putWithcall("elements#div",new utils.TemplateCall("testString_LUserL_ta0String_LUserL_User",getElementsContext(),new Object[]{query_,userList_,m_},attrs)),"div",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"div() at dashmodal.app:516/6");
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
}
}
protected void initializeLocalVars(){
searchList_=webdsl.generated.domain.User._static_searchUser_(query_+"*",50);
}
}
