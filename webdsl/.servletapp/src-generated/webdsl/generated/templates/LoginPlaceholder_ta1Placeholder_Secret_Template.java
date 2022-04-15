package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LoginPlaceholder_ta1Placeholder_Secret_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LoginPlaceholder_ta1Placeholder_Secret":keyOverwrite,LoginPlaceholder_ta1Placeholder_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LoginPlaceholder_ta1Placeholder_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
pass_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "LoginPlaceholder_ta1Placeholder_Secret";
}
public String getTemplateSignature(){
return "template LoginPlaceholder_ta1(ph : Placeholder, pass : ref Secret)";
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11835670830","inputSecret",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{pass_},"inputSecret"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSecret",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!(org.webdsl.tools.Utils.equal(((String)pass_.get()).length(),null)||org.webdsl.tools.Utils.equal(8,null))&&((String)pass_.get()).length()>=8,"Password needs to be at least 8 characters"},utils.TemplateCall.EmptyAttrs)),"inputSecret",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSecret(pass) at harmony.app:99/61");
}
}
}
