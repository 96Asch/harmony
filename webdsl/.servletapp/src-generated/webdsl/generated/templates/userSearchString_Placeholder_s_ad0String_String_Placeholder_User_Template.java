package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_Placeholder_s_ad0String_String_Placeholder_User_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==4){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchString_Placeholder_s_ad0String_String_Placeholder_User_s_ad0String_String_String_Placeholder_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(userSearchString_Placeholder_s_ad0String_String_Placeholder_User_s_ad0String_String_String_Placeholder_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_Placeholder_s_ad0String_String_Placeholder_User":keyOverwrite,userSearchString_Placeholder_s_ad0String_String_Placeholder_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_Placeholder_s_ad0String_String_Placeholder_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
userSearchString_Placeholder_AddUser10_=(String)args[0];
query_=(String)args[1];
ph_=(String)args[2];
user_=(webdsl.generated.domain.User)args[3];
}
public String getUniqueName(){
return "userSearchString_Placeholder_s_ad0String_String_Placeholder_User";
}
public String getTemplateSignature(){
return "template userSearchString_Placeholder_s_ad0(userSearchString_Placeholder_AddUser10 : String, query : String, ph : Placeholder, user : User)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String userSearchString_Placeholder_AddUser10_="";
private String query_="";
private String ph_="";
private webdsl.generated.domain.User user_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_18633557740"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_userSearch_AddUser0User_User_.genactionpredicate_userSearch_AddUser0User_User_(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getOwner(),user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18633557740"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18633557740","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"userSearchString_Placeholder_AddUser2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("userSearchString_Placeholder_s_ad0String_String_Placeholder_User_s_ad0String_String_String_Placeholder_User",getElementsContext(),new Object[]{userSearchString_Placeholder_AddUser10_,query_,ph_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"userSearchString_Placeholder_AddUser2\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
