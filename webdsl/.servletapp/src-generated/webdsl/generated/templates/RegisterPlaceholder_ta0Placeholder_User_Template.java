package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RegisterPlaceholder_ta0Placeholder_User_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0",RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RegisterPlaceholder_ta0Placeholder_User":keyOverwrite,RegisterPlaceholder_ta0Placeholder_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RegisterPlaceholder_ta0Placeholder_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
u_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "RegisterPlaceholder_ta0Placeholder_User";
}
public String getTemplateSignature(){
return "template RegisterPlaceholder_ta0(ph : Placeholder, u : ref User)";
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
private utils.RefArg u_=null;
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
attrsmapout.put("internal#TemplateCallPropertyNotNull","true");
handleTemplateCall(phase,inForLoop,forelementid,"tcall9944215990","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0((webdsl.generated.domain.User)u_.get())},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(u.username) at harmony.app:148/32");
}
}
}
