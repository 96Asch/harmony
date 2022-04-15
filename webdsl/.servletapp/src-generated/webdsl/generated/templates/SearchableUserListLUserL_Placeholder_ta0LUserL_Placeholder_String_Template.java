package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String":keyOverwrite,SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
users_=(java.util.List<webdsl.generated.domain.User>)args[0];
ph_=(String)args[1];
query_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String";
}
public String getTemplateSignature(){
return "template SearchableUserListLUserL_Placeholder_ta0(users : [User], ph : Placeholder, query : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "SearchableUserListLUserL_Placeholder";
}
else {
return calledName;
}
}
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private String ph_="";
private utils.RefArg query_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action16221207290"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action16221207290"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.SearchableUserListLUserL_Placeholder_ta0LUserL_Placeholder_String_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),query_,ph_,users_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action16221207290"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall16221207290","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{query_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(query) at dashmodal.app:188/35");
}
}
}
