package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LoginPlaceholder_ta2Placeholder_Bool_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LoginPlaceholder_ta2Placeholder_Bool":keyOverwrite,LoginPlaceholder_ta2Placeholder_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LoginPlaceholder_ta2Placeholder_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
remember_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "LoginPlaceholder_ta2Placeholder_Bool";
}
public String getTemplateSignature(){
return "template LoginPlaceholder_ta2(ph : Placeholder, remember : ref Bool)";
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
private utils.RefArg remember_=null;
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-input");
handleTemplateCall(phase,inForLoop,forelementid,"tcall8503682250","inputBool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{remember_},"inputBool"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputBool",utils.TemplateCall.EmptyElementsCall),"inputBool",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputBool(remember) at harmony.app:103/59");
}
}
}
