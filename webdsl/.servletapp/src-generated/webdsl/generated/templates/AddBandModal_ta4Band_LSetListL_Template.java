package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta4Band_LSetListL_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta4Band_LSetListLpc0",RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta4Band_LSetListLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta4Band_LSetListL":keyOverwrite,AddBandModal_ta4Band_LSetListL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta4Band_LSetListL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(utils.RefArg)args[0];
eligibleSetlists_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddBandModal_ta4Band_LSetListL";
}
public String getTemplateSignature(){
return "template AddBandModal_ta4(band : ref Band, eligibleSetlists : ref [SetList])";
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
private utils.RefArg eligibleSetlists_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11023200510","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta4Band_LSetListLpc0((webdsl.generated.domain.Band)band_.get()),(java.util.List<webdsl.generated.domain.SetList>)eligibleSetlists_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(band.setLists, eligibleSetlists) at dashmodal.app:181/16");
}
}
}
