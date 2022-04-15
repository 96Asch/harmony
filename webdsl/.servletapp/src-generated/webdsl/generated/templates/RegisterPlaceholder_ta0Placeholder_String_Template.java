package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RegisterPlaceholder_ta0Placeholder_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RegisterPlaceholder_ta0Placeholder_String":keyOverwrite,RegisterPlaceholder_ta0Placeholder_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RegisterPlaceholder_ta0Placeholder_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
uname_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "RegisterPlaceholder_ta0Placeholder_String";
}
public String getTemplateSignature(){
return "template RegisterPlaceholder_ta0(ph : Placeholder, uname : ref String)";
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
private utils.RefArg uname_=null;
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"placeholder","username");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall672168730","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{uname_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(uname) at harmony.app:142/59");
}
}
}
