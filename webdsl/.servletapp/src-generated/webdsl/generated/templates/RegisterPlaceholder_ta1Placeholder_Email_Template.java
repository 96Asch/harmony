package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RegisterPlaceholder_ta1Placeholder_Email_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RegisterPlaceholder_ta1Placeholder_Email":keyOverwrite,RegisterPlaceholder_ta1Placeholder_Email_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RegisterPlaceholder_ta1Placeholder_Email_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
email_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "RegisterPlaceholder_ta1Placeholder_Email";
}
public String getTemplateSignature(){
return "template RegisterPlaceholder_ta1(ph : Placeholder, email : ref Email)";
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
private utils.RefArg email_=null;
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"placeholder","example@email.com");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall7786121740","inputEmail",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{email_},"inputEmail"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputEmail",utils.TemplateCall.EmptyElementsCall),"inputEmail",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputEmail(email) at harmony.app:143/59");
}
}
}
