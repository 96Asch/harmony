package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class memberButtonBarUser_User_SUserS_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
if(i==2){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.memberButtonBarUser_User_SUserS_Placeholder_s_ad2String_User_User_SUserS_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.memberButtonBarUser_User_SUserS_Placeholder_s_ad1String_User_User_SUserS_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.memberButtonBarUser_User_SUserS_Placeholder_s_ad0String_User_User_SUserS_Placeholder_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(memberButtonBarUser_User_SUserS_Placeholder_s_ad0String_User_User_SUserS_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(memberButtonBarUser_User_SUserS_Placeholder_s_ad1String_User_User_SUserS_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(memberButtonBarUser_User_SUserS_Placeholder_s_ad2String_User_User_SUserS_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"memberButtonBarUser_User_SUserS_Placeholder":keyOverwrite,memberButtonBarUser_User_SUserS_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(memberButtonBarUser_User_SUserS_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editor_=(webdsl.generated.domain.User)args[0];
user_=(webdsl.generated.domain.User)args[1];
pending_=(java.util.Set<webdsl.generated.domain.User>)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "memberButtonBarUser_User_SUserS_Placeholder";
}
public String getTemplateSignature(){
return "template memberButtonBar(editor : User, user : User, pending : {User}, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "memberButtonBarUser_User_SUserS_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.User user_=null;
private java.util.Set<webdsl.generated.domain.User> pending_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"div");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"btn-group");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("role","group"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_10099152920"+forelementid))==null){
if0=org.webdsl.tools.Utils.equal(user_,editor_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_10099152920"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","badge rounded-pill bg-info w-100");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_10099152924","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Owner"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Owner\") at usersearch.app:44/8");
}
}
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_10099152921"+forelementid))==null){
if1=!org.webdsl.tools.Utils.equal(pending_,null)&&pending_.contains(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_10099152921"+forelementid,if1);
}
}
if(if1){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","badge rounded-pill bg-waring w-100");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_10099152926","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Pending"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Pending\") at usersearch.app:48/8");
}
}
Boolean if4=null;
if(RENDER_PHASE==phase||(if4=(Boolean)getTemplatecalls().get("if_10099152922"+forelementid))==null){
if4=org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())&&!org.webdsl.tools.Utils.equal(user_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_10099152922"+forelementid,if4);
}
}
if(if4){
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if_10099152923"+forelementid))==null){
if2=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins().contains(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_10099152923"+forelementid,if2);
}
}
if(if2){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_10099152928","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"memberButtonBarUser_User_SUserS_Placeholder_RemoveAdmin2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("memberButtonBarUser_User_SUserS_Placeholder_s_ad0String_User_User_SUserS_Placeholder",getElementsContext(),new Object[]{editor_,user_,pending_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"memberButtonBarUser_User_SUserS_Placeholder_RemoveAdmin2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
else {
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_100991529211","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"memberButtonBarUser_User_SUserS_Placeholder_AddAdmin2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("memberButtonBarUser_User_SUserS_Placeholder_s_ad1String_User_User_SUserS_Placeholder",getElementsContext(),new Object[]{editor_,user_,pending_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"memberButtonBarUser_User_SUserS_Placeholder_AddAdmin2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
else {
Boolean if3=null;
if(RENDER_PHASE==phase||(if3=(Boolean)getTemplatecalls().get("if_10099152924"+forelementid))==null){
if3=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins().contains(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_10099152924"+forelementid,if3);
}
}
if(if3){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_100991529214","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"memberButtonBarUser_User_SUserS_Placeholder_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("memberButtonBarUser_User_SUserS_Placeholder_s_ad2String_User_User_SUserS_Placeholder",getElementsContext(),new Object[]{editor_,user_,pending_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"memberButtonBarUser_User_SUserS_Placeholder_ia0\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_100991529217","removeMemberButtonUser_User_SUserS_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{editor_,user_,pending_,ph_},"removeMemberButtonUser_User_SUserS_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#removeMemberButtonUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyElementsCall),"removeMemberButtonUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"removeMemberButtonUser_User_SUserS_Placeholder(editor, user, pending, ph) at usersearch.app:65/6");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
