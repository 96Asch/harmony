package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditBandModalBand_ta4Band_Template extends utils.TemplateServlet{
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
refargclasses.put("RefArg_inputText_1_EditBandModalBand_ta4Bandpc0",RefArg_inputText_1_EditBandModalBand_ta4Bandpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditBandModalBand_ta4Band":keyOverwrite,EditBandModalBand_ta4Band_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditBandModalBand_ta4Band_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(webdsl.generated.domain.Band)args[0];
}
public String getUniqueName(){
return "EditBandModalBand_ta4Band";
}
public String getTemplateSignature(){
return "template EditBandModalBand_ta4(band : Band)";
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
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if1014491370"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditBandModal0Band_.gentemplatepredicate_EditBandModal0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if1014491370"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall1014491370","inputText",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputText_1_EditBandModalBand_ta4Bandpc0(band_)},"inputText"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputText",utils.TemplateCall.EmptyElementsCall),"inputText",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputText(band.description) at dashmodal.app:251/73");
}
}
}
}
