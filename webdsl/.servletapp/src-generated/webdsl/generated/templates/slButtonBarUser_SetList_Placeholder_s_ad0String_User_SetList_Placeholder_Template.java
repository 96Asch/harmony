package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_Template extends utils.TemplateServlet{
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
java.util.ArrayList<webdsl.generated.domain.SetList> elems1=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems1.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder":keyOverwrite,slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
slButtonBarUser_SetList_Placeholder_RemoveSetList10_=(String)args[0];
editor_=(webdsl.generated.domain.User)args[1];
setlist_=(webdsl.generated.domain.SetList)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder";
}
public String getTemplateSignature(){
return "template slButtonBarUser_SetList_Placeholder_s_ad0(slButtonBarUser_SetList_Placeholder_RemoveSetList10 : String, editor : User, setlist : SetList, ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String slButtonBarUser_SetList_Placeholder_RemoveSetList10_="";
private webdsl.generated.domain.User editor_=null;
private webdsl.generated.domain.SetList setlist_=null;
private String ph_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_5509342210"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_slButtonBar0User_SetList_Placeholder_.gentemplatepredicate_slButtonBar0User_SetList_Placeholder_(editor_,setlist_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_5509342210"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_5509342211"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_slButtonBar__0User_SetList_Placeholder_.genactionpredicate_slButtonBar__0User_SetList_Placeholder_(editor_,setlist_,ph_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_5509342211"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5509342210","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"slButtonBarUser_SetList_Placeholder_RemoveSetList2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("slButtonBarUser_SetList_Placeholder_s_ad0String_User_SetList_Placeholder_s_ad0String_String_User_SetList_Placeholder",getElementsContext(),new Object[]{slButtonBarUser_SetList_Placeholder_RemoveSetList10_,editor_,setlist_,ph_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"slButtonBarUser_SetList_Placeholder_RemoveSetList2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
