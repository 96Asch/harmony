package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class one_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"one":keyOverwrite,one_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(one_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "one";
}
public String getTemplateSignature(){
return "template one()";
}
public String getElementsContext(){
if(calledName==null){
return "one";
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
utils.RenderUtils.printPageString("1",out,threadLocalPageCached.isRawoutput());
}
}
}
