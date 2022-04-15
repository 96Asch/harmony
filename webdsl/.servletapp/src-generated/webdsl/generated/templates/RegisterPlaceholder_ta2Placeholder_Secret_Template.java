package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RegisterPlaceholder_ta2Placeholder_Secret_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RegisterPlaceholder_ta2Placeholder_Secret":keyOverwrite,RegisterPlaceholder_ta2Placeholder_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RegisterPlaceholder_ta2Placeholder_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
pass_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "RegisterPlaceholder_ta2Placeholder_Secret";
}
public String getTemplateSignature(){
return "template RegisterPlaceholder_ta2(ph : Placeholder, pass : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "RegisterPlaceholder";
}
else {
return calledName;
}
}
private String ph_="";
private utils.RefArg pass_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall5922889250","inputSecret",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{pass_},"inputSecret"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSecret",utils.TemplateCall.EmptyElementsCall),"inputSecret",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSecret(pass) at harmony.app:144/59");
}
}
}
