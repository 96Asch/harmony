package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_Placeholder_ta0String_Placeholder_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_Placeholder_ta0String_Placeholder_String":keyOverwrite,userSearchString_Placeholder_ta0String_Placeholder_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_Placeholder_ta0String_Placeholder_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
ph_=(String)args[1];
newQuery_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "userSearchString_Placeholder_ta0String_Placeholder_String";
}
public String getTemplateSignature(){
return "template userSearchString_Placeholder_ta0(query : String, ph : Placeholder, newQuery : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "userSearchString_Placeholder";
}
else {
return calledName;
}
}
private String query_="";
private String ph_="";
private utils.RefArg newQuery_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_16735632130"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.userSearchString_Placeholder_OnSearch0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_16735632130"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.userSearchString_Placeholder_OnSearch0().run(threadLocalPageCached,getEnv(),getElementsContext(),((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getOwner(),newQuery_,ph_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_16735632130"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16735632130","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{newQuery_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newQuery) at dashmodal.app:297/10");
}
}
}