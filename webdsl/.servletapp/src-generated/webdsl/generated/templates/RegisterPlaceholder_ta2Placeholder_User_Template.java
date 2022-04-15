package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RegisterPlaceholder_ta2Placeholder_User_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputSecret_1_RegisterPlaceholder_ta2Placeholder_Userpc0",RefArg_inputSecret_1_RegisterPlaceholder_ta2Placeholder_Userpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RegisterPlaceholder_ta2Placeholder_User":keyOverwrite,RegisterPlaceholder_ta2Placeholder_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RegisterPlaceholder_ta2Placeholder_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
u_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "RegisterPlaceholder_ta2Placeholder_User";
}
public String getTemplateSignature(){
return "template RegisterPlaceholder_ta2(ph : Placeholder, u : ref User)";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall7181523620","inputSecret",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputSecret_1_RegisterPlaceholder_ta2Placeholder_Userpc0((webdsl.generated.domain.User)u_.get())},"inputSecret"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSecret",utils.TemplateCall.EmptyElementsCall),"inputSecret",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSecret(u.password) at harmony.app:150/32");
}
}
}
