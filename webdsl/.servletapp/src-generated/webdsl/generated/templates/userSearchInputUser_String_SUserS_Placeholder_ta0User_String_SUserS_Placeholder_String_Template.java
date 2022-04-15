package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchInputUser_String_SUserS_Placeholder_ta0User_String_SUserS_Placeholder_String_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchInputUser_String_SUserS_Placeholder_ta0User_String_SUserS_Placeholder_String":keyOverwrite,userSearchInputUser_String_SUserS_Placeholder_ta0User_String_SUserS_Placeholder_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchInputUser_String_SUserS_Placeholder_ta0User_String_SUserS_Placeholder_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editor_=(webdsl.generated.domain.User)args[0];
query_=(String)args[1];
pending_=(java.util.Set<webdsl.generated.domain.User>)args[2];
ph_=(String)args[3];
newQuery_=(utils.RefArg)args[4];
}
public String getUniqueName(){
return "userSearchInputUser_String_SUserS_Placeholder_ta0User_String_SUserS_Placeholder_String";
}
public String getTemplateSignature(){
return "template userSearchInputUser_String_SUserS_Placeholder_ta0(editor : User, query : String, pending : {User}, ph : Placeholder, newQuery : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "userSearchInputUser_String_SUserS_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User editor_=null;
private String query_="";
private java.util.Set<webdsl.generated.domain.User> pending_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private String ph_="";
private utils.RefArg newQuery_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_18313440860"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_userSearchInput0User_String_SUserS_Placeholder_.gentemplatepredicate_userSearchInput0User_String_SUserS_Placeholder_(editor_,query_,pending_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18313440860"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_18313440860"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.userSearchInputUser_String_SUserS_Placeholder_OnSearch0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_18313440860"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.userSearchInputUser_String_SUserS_Placeholder_OnSearch0().run(threadLocalPageCached,getEnv(),getElementsContext(),((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getOwner(),newQuery_,ph_,pending_,query_,editor_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_18313440860"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18313440860","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{newQuery_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newQuery) at usersearch.app:81/8");
}
}
}
}
