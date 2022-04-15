package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SearchableUserListLUserL_ta0LUserL_String_Placeholder_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SearchableUserListLUserL_ta0LUserL_String_Placeholder":keyOverwrite,SearchableUserListLUserL_ta0LUserL_String_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SearchableUserListLUserL_ta0LUserL_String_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
users_=(java.util.List<webdsl.generated.domain.User>)args[0];
query_=(utils.RefArg)args[1];
ph_=(String)args[2];
}
public String getUniqueName(){
return "SearchableUserListLUserL_ta0LUserL_String_Placeholder";
}
public String getTemplateSignature(){
return "template SearchableUserListLUserL_ta0(users : [User], query : ref String, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "SearchableUserListLUserL";
}
else {
return calledName;
}
}
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private utils.RefArg query_=null;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_16339636470"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SearchableUserListLUserL_ta0LUserL_String_Placeholder_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_16339636470"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.SearchableUserListLUserL_ta0LUserL_String_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),ph_,query_,users_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_16339636470"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16339636470","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{query_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(query) at dashmodal.app:190/35");
}
}
}
