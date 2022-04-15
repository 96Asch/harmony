package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class root_ta0_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"root_ta0":keyOverwrite,root_ta0_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(root_ta0_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "root_ta0";
}
public String getTemplateSignature(){
return "template root_ta0()";
}
public String getElementsContext(){
if(calledName==null){
return "root";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall2676203780","Bootstrap",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Bootstrap"),new org.webdsl.lang.Environment(env).putWithcall("elements#Bootstrap",utils.TemplateCall.EmptyElementsCall),"Bootstrap",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Bootstrap() at harmony.app:19/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall2676203782","GlobalCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"GlobalCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#GlobalCSS",utils.TemplateCall.EmptyElementsCall),"GlobalCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"GlobalCSS() at harmony.app:20/5");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall2676203784","RootCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"RootCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#RootCSS",utils.TemplateCall.EmptyElementsCall),"RootCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"RootCSS() at harmony.app:21/5");
}
}
}
