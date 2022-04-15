package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_User_Template extends utils.TemplateServlet{
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
if(i==6){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_23String_String_User_String_Placeholder_LSetListInvitationL_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_23String_String_User_String_Placeholder_LSetListInvitationL_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_User":keyOverwrite,userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_User_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_User_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
userSearchUser_String_Placeholder_AddUser10_=(String)args[0];
owner_=(webdsl.generated.domain.User)args[1];
query_=(String)args[2];
ph_=(String)args[3];
invites_=(utils.RefArg)args[4];
user_=(webdsl.generated.domain.User)args[5];
}
public String getUniqueName(){
return "userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_User";
}
public String getTemplateSignature(){
return "template userSearchUser_String_Placeholder_s_ad0(userSearchUser_String_Placeholder_AddUser10 : String, owner : User, query : String, ph : Placeholder, invites : ref [SetListInvitation], user : User)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String userSearchUser_String_Placeholder_AddUser10_="";
private webdsl.generated.domain.User owner_=null;
private String query_="";
private String ph_="";
private utils.RefArg invites_=null;
private webdsl.generated.domain.User user_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_15971895240"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_userSearch_AddUser0User_User_.genactionpredicate_userSearch_AddUser0User_User_(owner_,user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_15971895240"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_15971895240","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"userSearchUser_String_Placeholder_AddUser2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("userSearchUser_String_Placeholder_s_ad0String_User_String_Placeholder_LSetListInvitationL_23String_String_User_String_Placeholder_LSetListInvitationL_User",getElementsContext(),new Object[]{userSearchUser_String_Placeholder_AddUser10_,owner_,query_,ph_,invites_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"userSearchUser_String_Placeholder_AddUser2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
