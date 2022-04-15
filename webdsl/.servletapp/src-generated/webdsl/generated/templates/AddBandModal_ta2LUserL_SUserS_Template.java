package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta2LUserL_SUserS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta2LUserL_SUserS":keyOverwrite,AddBandModal_ta2LUserL_SUserS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta2LUserL_SUserS_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
eligibleUsers_=(utils.RefArg)args[0];
admins_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddBandModal_ta2LUserL_SUserS";
}
public String getTemplateSignature(){
return "template AddBandModal_ta2(eligibleUsers : ref [User], admins : ref {User})";
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
private utils.RefArg admins_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18436999810","inputSEntityS_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{admins_,(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputSEntityS_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSEntityS_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputSEntityS_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSEntityS_LEntityL(admins, eligibleUsers) at dashmodal.app:177/16");
}
}
}
