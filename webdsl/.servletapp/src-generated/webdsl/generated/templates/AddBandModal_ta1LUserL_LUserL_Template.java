package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta1LUserL_LUserL_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta1LUserL_LUserL":keyOverwrite,AddBandModal_ta1LUserL_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta1LUserL_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
eligibleUsers_=(utils.RefArg)args[0];
members_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddBandModal_ta1LUserL_LUserL";
}
public String getTemplateSignature(){
return "template AddBandModal_ta1(eligibleUsers : ref [User], members : ref [User])";
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
private utils.RefArg members_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11885736520","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{members_,(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(members, eligibleUsers) at dashmodal.app:175/16");
}
}
}