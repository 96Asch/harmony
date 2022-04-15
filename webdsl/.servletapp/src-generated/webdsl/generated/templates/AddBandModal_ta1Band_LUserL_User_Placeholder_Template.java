package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta1Band_LUserL_User_Placeholder_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta1Band_LUserL_User_Placeholder":keyOverwrite,AddBandModal_ta1Band_LUserL_User_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta1Band_LUserL_User_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(utils.RefArg)args[0];
eligibleUsers_=(utils.RefArg)args[1];
user_=(utils.RefArg)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "AddBandModal_ta1Band_LUserL_User_Placeholder";
}
public String getTemplateSignature(){
return "template AddBandModal_ta1(band : ref Band, eligibleUsers : ref [User], user : ref User, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "AddBandModal";
}
else {
return calledName;
}
}
private utils.RefArg band_=null;
private utils.RefArg eligibleUsers_=null;
private utils.RefArg user_=null;
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
String actionid0=(inForLoop?forelementid:"")+("action8568860360"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.AddBandModal_ta1Band_LUserL_User_Placeholder_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action8568860360"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.AddBandModal_ta1Band_LUserL_User_Placeholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),ph_,user_,band_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"onchange","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action8568860360"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall8568860360","inputEntity_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{user_,(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputEntity_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputEntity_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputEntity_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputEntity_LEntityL(user, eligibleUsers) at dashmodal.app:169/65");
}
}
}
