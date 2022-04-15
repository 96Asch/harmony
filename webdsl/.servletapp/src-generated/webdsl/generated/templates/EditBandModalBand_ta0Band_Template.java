package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditBandModalBand_ta0Band_Template extends utils.TemplateServlet{
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
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_EditBandModalBand_ta0Bandpc0",RefArg_inputString_1_EditBandModalBand_ta0Bandpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditBandModalBand_ta0Band":keyOverwrite,EditBandModalBand_ta0Band_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditBandModalBand_ta0Band_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(webdsl.generated.domain.Band)args[0];
}
public String getUniqueName(){
return "EditBandModalBand_ta0Band";
}
public String getTemplateSignature(){
return "template EditBandModalBand_ta0(band : Band)";
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
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_2593819890"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditBandModal0Band_.gentemplatepredicate_EditBandModal0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_2593819890"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2593819890","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_EditBandModalBand_ta0Bandpc0(band_)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal(band_,null)&&!org.webdsl.tools.Utils.equal(band_.getName(),""),"Name cannot be empty"},utils.TemplateCall.EmptyAttrs)),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(band.name) at dashmodal.app:234/66");
}
}
}
}
