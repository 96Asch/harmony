package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class memberButtonBarUser_User_Placeholder_Template extends utils.TemplateServlet{
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
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"memberButtonBarUser_User_Placeholder":keyOverwrite,memberButtonBarUser_User_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(memberButtonBarUser_User_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editor_=(webdsl.generated.domain.User)args[0];
user_=(webdsl.generated.domain.User)args[1];
ph_=(String)args[2];
}
public String getUniqueName(){
return "memberButtonBarUser_User_Placeholder";
}
public String getTemplateSignature(){
return "template memberButtonBar(editor : User, user : User, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "memberButtonBarUser_User_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.User user_=null;
private String ph_="";
private Boolean interactible_;
public Boolean getInteractible_(){
return interactible_;
}
public void setInteractible_(Boolean interactible_){
this.interactible_=interactible_;
}
private Boolean isShown_;
public Boolean getIsShown_(){
return isShown_;
}
public void setIsShown_(Boolean isShown_){
this.isShown_=isShown_;
}
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
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_11397589040"+forelementid))==null){
if0=org.webdsl.tools.Utils.equal(user_,editor_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11397589040"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","badge rounded-pill bg-info w-100");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11397589040","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Owner"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Owner\") at usersearch.app:55/8");
}
}
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_11397589041"+forelementid))==null){
if1=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getPending(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getPending().contains(user_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11397589041"+forelementid,if1);
}
}
if(if1){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","badge rounded-pill bg-warning w-100");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11397589042","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Pending"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",utils.TemplateCall.EmptyElementsCall),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Pending\") at usersearch.app:59/8");
}
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11397589044","adminButtonUser_User_Bool_Bool_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{editor_,user_,isShown_,interactible_,ph_},"adminButtonUser_User_Bool_Bool_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#adminButtonUser_User_Bool_Bool_Placeholder",utils.TemplateCall.EmptyElementsCall),"adminButtonUser_User_Bool_Bool_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"adminButtonUser_User_Bool_Bool_Placeholder(editor, user, isShown, interactible, ph) at usersearch.app:62/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11397589046","removeMemberButtonUser_User_Bool_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{editor_,user_,isShown_,ph_},"removeMemberButtonUser_User_Bool_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#removeMemberButtonUser_User_Bool_Placeholder",utils.TemplateCall.EmptyElementsCall),"removeMemberButtonUser_User_Bool_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"removeMemberButtonUser_User_Bool_Placeholder(editor, user, isShown, ph) at usersearch.app:63/6");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
protected void initializeLocalVars(){
interactible_=org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
isShown_=(!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins().contains(user_)||interactible_)&&!(!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getPending(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getPending().contains(user_));
}
}
