package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LoginPlaceholder_ta0Placeholder_Secret_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LoginPlaceholder_ta0Placeholder_Secret":keyOverwrite,LoginPlaceholder_ta0Placeholder_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LoginPlaceholder_ta0Placeholder_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
pass_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "LoginPlaceholder_ta0Placeholder_Secret";
}
public String getTemplateSignature(){
return "template LoginPlaceholder_ta0(ph : Placeholder, pass : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "LoginPlaceholder";
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","block");
handleTemplateCall(phase,inForLoop,forelementid,"tcall5673433920","inputSecret",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{pass_},"inputSecret"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSecret",utils.TemplateCall.EmptyElementsCall),"inputSecret",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSecret(pass) at harmony.app:97/44");
}
}
}
