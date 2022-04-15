package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class ChoInterpreterJS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"ChoInterpreterJS":keyOverwrite,ChoInterpreterJS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(ChoInterpreterJS_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "ChoInterpreterJS";
}
public String getTemplateSignature(){
return "template ChoInterpreterJS()";
}
public String getElementsContext(){
if(calledName==null){
return "ChoInterpreterJS";
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
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude(utils.IncludePaths.jQueryJS());
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addJavascriptInclude("chordproInterpreter.js");
}
}
}
