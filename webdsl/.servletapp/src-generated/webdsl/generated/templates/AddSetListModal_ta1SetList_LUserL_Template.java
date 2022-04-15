package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta1SetList_LUserL_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta1SetList_LUserLpc0",RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta1SetList_LUserLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta1SetList_LUserL":keyOverwrite,AddSetListModal_ta1SetList_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta1SetList_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(utils.RefArg)args[0];
eligibleUsers_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddSetListModal_ta1SetList_LUserL";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta1(setlist : ref SetList, eligibleUsers : ref [User])";
}
public String getElementsContext(){
if(calledName==null){
return "AddSetListModal";
}
else {
return calledName;
}
}
private utils.RefArg setlist_=null;
private utils.RefArg eligibleUsers_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall15691412670","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta1SetList_LUserLpc0((webdsl.generated.domain.SetList)setlist_.get()),(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(setlist.admins, eligibleUsers) at dashmodal.app:347/16");
}
}
}
