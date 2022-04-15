package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta3Band_LUserL_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LUserLpc0",RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LUserLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta3Band_LUserL":keyOverwrite,AddBandModal_ta3Band_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta3Band_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(utils.RefArg)args[0];
members_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddBandModal_ta3Band_LUserL";
}
public String getTemplateSignature(){
return "template AddBandModal_ta3(band : ref Band, members : ref [User])";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall18655965060","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LUserLpc0((webdsl.generated.domain.Band)band_.get()),(java.util.List<webdsl.generated.domain.User>)members_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(band.admins, members) at dashmodal.app:179/16");
}
}
}
