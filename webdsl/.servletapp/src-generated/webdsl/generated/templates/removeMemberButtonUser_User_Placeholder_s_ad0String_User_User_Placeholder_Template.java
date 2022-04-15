package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
if(i==3){
java.util.ArrayList<webdsl.generated.domain.User> elems1=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems1.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder":keyOverwrite,removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
removeMemberButtonUser_User_Placeholder_RemoveUser20_=(String)args[0];
editor_=(webdsl.generated.domain.User)args[1];
user_=(webdsl.generated.domain.User)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder";
}
public String getTemplateSignature(){
return "template removeMemberButtonUser_User_Placeholder_s_ad0(removeMemberButtonUser_User_Placeholder_RemoveUser20 : String, editor : User, user : User, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String removeMemberButtonUser_User_Placeholder_RemoveUser20_="";
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.User user_=null;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_20357626040"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_removeMemberButton0User_User_Placeholder_.gentemplatepredicate_removeMemberButton0User_User_Placeholder_(editor_,user_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20357626040"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_20357626041"+forelementid))==null){
if0=webdsl.generated.functions.genactioncombined_RemoveUser0User_User_Placeholder_User_User_.genactioncombined_RemoveUser0User_User_Placeholder_User_User_(editor_,user_,ph_,((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getOwner(),user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20357626041"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_20357626040","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"removeMemberButtonUser_User_Placeholder_RemoveUser3"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("removeMemberButtonUser_User_Placeholder_s_ad0String_User_User_Placeholder_s_ad0String_String_User_User_Placeholder",getElementsContext(),new Object[]{removeMemberButtonUser_User_Placeholder_RemoveUser20_,editor_,user_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"removeMemberButtonUser_User_Placeholder_RemoveUser3\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
