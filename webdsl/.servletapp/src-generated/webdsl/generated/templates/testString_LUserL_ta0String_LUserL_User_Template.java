package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class testString_LUserL_ta0String_LUserL_User_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"testString_LUserL_ta0String_LUserL_User":keyOverwrite,testString_LUserL_ta0String_LUserL_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(testString_LUserL_ta0String_LUserL_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
userList_=(java.util.List<webdsl.generated.domain.User>)args[1];
m_=(webdsl.generated.domain.User)args[2];
}
public String getUniqueName(){
return "testString_LUserL_ta0String_LUserL_User";
}
public String getTemplateSignature(){
return "template testString_LUserL_ta0(query : String, userList : [User], m : User)";
}
public String getElementsContext(){
if(calledName==null){
return "testString_LUserL";
}
else {
return calledName;
}
}
private String query_="";
private java.util.List<webdsl.generated.domain.User> userList_=new java.util.ArrayList<webdsl.generated.domain.User>();
private webdsl.generated.domain.User m_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_18186393870"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(m_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18186393870"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18186393870","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{m_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(m.name) at unknown context");
}
}
}
}
