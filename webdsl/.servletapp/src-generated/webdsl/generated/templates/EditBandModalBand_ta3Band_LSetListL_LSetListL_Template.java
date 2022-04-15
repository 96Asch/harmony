package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditBandModalBand_ta3Band_LSetListL_LSetListL_Template extends utils.TemplateServlet{
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
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditBandModalBand_ta3Band_LSetListL_LSetListL":keyOverwrite,EditBandModalBand_ta3Band_LSetListL_LSetListL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditBandModalBand_ta3Band_LSetListL_LSetListL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(webdsl.generated.domain.Band)args[0];
eligibleSetlists_=(utils.RefArg)args[1];
setlists_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "EditBandModalBand_ta3Band_LSetListL_LSetListL";
}
public String getTemplateSignature(){
return "template EditBandModalBand_ta3(band : Band, eligibleSetlists : ref [SetList], setlists : ref [SetList])";
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
private utils.RefArg eligibleSetlists_=null;
private utils.RefArg setlists_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if1231281860"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditBandModal0Band_.gentemplatepredicate_EditBandModal0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if1231281860"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall1231281860","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{setlists_,(java.util.List<webdsl.generated.domain.SetList>)eligibleSetlists_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(setlists, eligibleSetlists) at dashmodal.app:246/16");
}
}
}
}
