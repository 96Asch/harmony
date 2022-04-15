package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddBandModal_ta5Band_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputText_1_AddBandModal_ta5Bandpc0",RefArg_inputText_1_AddBandModal_ta5Bandpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddBandModal_ta5Band":keyOverwrite,AddBandModal_ta5Band_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddBandModal_ta5Band_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddBandModal_ta5Band";
}
public String getTemplateSignature(){
return "template AddBandModal_ta5(band : ref Band)";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall18218511070","inputText",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputText_1_AddBandModal_ta5Bandpc0((webdsl.generated.domain.Band)band_.get())},"inputText"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputText",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal((webdsl.generated.domain.Band)band_.get(),null)&&!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.Band)band_.get()).getName(),""),"Name cannot be empty"},utils.TemplateCall.EmptyAttrs)),"inputText",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputText(band.description) at dashmodal.app:182/73");
}
}
}
