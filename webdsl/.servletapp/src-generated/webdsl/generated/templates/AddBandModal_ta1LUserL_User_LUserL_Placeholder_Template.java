package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta1LUserL_User_LUserL_Placeholder_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta1LUserL_User_LUserL_Placeholder":keyOverwrite,AddBandModal_ta1LUserL_User_LUserL_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta1LUserL_User_LUserL_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
eligibleUsers_=(utils.RefArg)args[0];
user_=(utils.RefArg)args[1];
members_=(utils.RefArg)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "AddBandModal_ta1LUserL_User_LUserL_Placeholder";
}
public String getTemplateSignature(){
return "template AddBandModal_ta1(eligibleUsers : ref [User], user : ref User, members : ref [User], ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "AddBandModal";
}
else {
return calledName;
}
}
private utils.RefArg eligibleUsers_=null;
private utils.RefArg user_=null;
private utils.RefArg members_=null;
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
String actionid0=(inForLoop?forelementid:"")+("action_2766292480"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.AddBandModal_ta1LUserL_User_LUserL_Placeholder_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_2766292480"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.AddBandModal_ta1LUserL_User_LUserL_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),ph_,members_,user_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"onchange","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_2766292480"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2766292480","inputEntity_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{user_,(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputEntity_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputEntity_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputEntity_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputEntity_LEntityL(user, eligibleUsers) at dashmodal.app:171/16");
}
}
}
