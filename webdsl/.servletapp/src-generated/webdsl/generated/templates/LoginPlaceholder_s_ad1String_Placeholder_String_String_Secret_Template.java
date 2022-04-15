package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret":keyOverwrite,LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
LoginPlaceholder_ia10_=(String)args[0];
ph_=(String)args[1];
uname_=(utils.RefArg)args[2];
email_=(utils.RefArg)args[3];
pass_=(utils.RefArg)args[4];
}
public String getUniqueName(){
return "LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret";
}
public String getTemplateSignature(){
return "template LoginPlaceholder_s_ad1(LoginPlaceholder_ia10 : String, ph : Placeholder, uname : ref String, email : ref String, pass : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String LoginPlaceholder_ia10_="";
private String ph_="";
private utils.RefArg uname_=null;
private utils.RefArg email_=null;
private utils.RefArg pass_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if13541093270"+forelementid))==null){
if0=webdsl.generated.functions.genactioncombined_LoginPlaceholder_ia10Placeholder_Placeholder_.genactioncombined_LoginPlaceholder_ia10Placeholder_Placeholder_(ph_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if13541093270"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall13541093270","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"LoginPlaceholder_ia1_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("LoginPlaceholder_s_ad1String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret",getElementsContext(),new Object[]{LoginPlaceholder_ia10_,ph_,uname_,email_,pass_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"LoginPlaceholder_ia1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
