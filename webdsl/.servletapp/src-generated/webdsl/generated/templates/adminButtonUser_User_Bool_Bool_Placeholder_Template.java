package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class adminButtonUser_User_Bool_Bool_Placeholder_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.adminButtonUser_User_Bool_Bool_Placeholder_s_ad1String_User_User_Bool_Bool_Placeholder_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.adminButtonUser_User_Bool_Bool_Placeholder_s_ad0String_User_User_Bool_Bool_Placeholder_Template.class,null,staticEnv));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(adminButtonUser_User_Bool_Bool_Placeholder_s_ad0String_User_User_Bool_Bool_Placeholder_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(adminButtonUser_User_Bool_Bool_Placeholder_s_ad1String_User_User_Bool_Bool_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"adminButtonUser_User_Bool_Bool_Placeholder":keyOverwrite,adminButtonUser_User_Bool_Bool_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(adminButtonUser_User_Bool_Bool_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editor_=(webdsl.generated.domain.User)args[0];
user_=(webdsl.generated.domain.User)args[1];
isShown_=(Boolean)args[2];
interactible_=(Boolean)args[3];
ph_=(String)args[4];
}
public String getUniqueName(){
return "adminButtonUser_User_Bool_Bool_Placeholder";
}
public String getTemplateSignature(){
return "template adminButton(editor : User, user : User, isShown : Bool, interactible : Bool, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "adminButtonUser_User_Bool_Bool_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.User user_=null;
private Boolean isShown_=false;
private Boolean interactible_=false;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if2386193220"+forelementid))==null){
if2=isShown_;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if2386193220"+forelementid,if2);
}
}
if(if2){
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if2386193221"+forelementid))==null){
if1=interactible_&&!org.webdsl.tools.Utils.equal(editor_,user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if2386193221"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if2386193222"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins().contains(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if2386193222"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall2386193224","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"adminButtonUser_User_Bool_Bool_Placeholder_RemoveAdmin1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("adminButtonUser_User_Bool_Bool_Placeholder_s_ad0String_User_User_Bool_Bool_Placeholder",getElementsContext(),new Object[]{editor_,user_,isShown_,interactible_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"adminButtonUser_User_Bool_Bool_Placeholder_RemoveAdmin1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
else {
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall2386193227","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"adminButtonUser_User_Bool_Bool_Placeholder_AddAdmin1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("adminButtonUser_User_Bool_Bool_Placeholder_s_ad1String_User_User_Bool_Bool_Placeholder",getElementsContext(),new Object[]{editor_,user_,isShown_,interactible_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"adminButtonUser_User_Bool_Bool_Placeholder_AddAdmin1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
else {
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","badge rounded-pill bg-success disabled w-100");
handleTemplateCall(phase,inForLoop,forelementid,"tcall23861932210","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Admin"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Admin\") at usersearch.app:40/9");
}
}
}
}
}
