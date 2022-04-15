package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditBandModalBand_ta2Band_LUserL_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.Band> elems0=new java.util.ArrayList<webdsl.generated.domain.Band>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Band")){
elems0.add((webdsl.generated.domain.Band)ent);
}
}
}
}
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputSEntityS_LEntityL_1_EditBandModalBand_ta2Band_LUserLpc0",RefArg_inputSEntityS_LEntityL_1_EditBandModalBand_ta2Band_LUserLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditBandModalBand_ta2Band_LUserL":keyOverwrite,EditBandModalBand_ta2Band_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditBandModalBand_ta2Band_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(webdsl.generated.domain.Band)args[0];
eligibleUsers_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "EditBandModalBand_ta2Band_LUserL";
}
public String getTemplateSignature(){
return "template EditBandModalBand_ta2(band : Band, eligibleUsers : ref [User])";
}
public String getElementsContext(){
if(calledName==null){
return "EditBandModalBand";
}
else {
return calledName;
}
}
private webdsl.generated.domain.Band band_=null;
private utils.RefArg eligibleUsers_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_19977318900"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditBandModal0Band_.gentemplatepredicate_EditBandModal0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_19977318900"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_19977318900","inputSEntityS_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputSEntityS_LEntityL_1_EditBandModalBand_ta2Band_LUserLpc0(band_),(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputSEntityS_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSEntityS_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputSEntityS_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSEntityS_LEntityL(band.admins, eligibleUsers) at dashmodal.app:243/16");
}
}
}
}
