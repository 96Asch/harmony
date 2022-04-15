package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_s_ad0String_String_String_SetList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_s_ad0String_String_String_SetList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"ConfirmRemoveModalString_SetList_s_ad0String_String_SetList":keyOverwrite,ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ConfirmRemoveModalString_SetList_OnDelete10_=(String)args[0];
modalId_=(String)args[1];
setlist_=(webdsl.generated.domain.SetList)args[2];
}
public String getUniqueName(){
return "ConfirmRemoveModalString_SetList_s_ad0String_String_SetList";
}
public String getTemplateSignature(){
return "template ConfirmRemoveModalString_SetList_s_ad0(ConfirmRemoveModalString_SetList_OnDelete10 : String, modalId : String, setlist : SetList)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String ConfirmRemoveModalString_SetList_OnDelete10_="";
private String modalId_="";
private webdsl.generated.domain.SetList setlist_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if5333801780"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_ConfirmRemoveModal0String_SetList_.gentemplatepredicate_ConfirmRemoveModal0String_SetList_(modalId_,setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5333801780"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if5333801781"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_ConfirmRemoveModal__0String_SetList_.genactionpredicate_ConfirmRemoveModal__0String_SetList_(modalId_,setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if5333801781"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall5333801780","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"ConfirmRemoveModalString_SetList_OnDelete2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("ConfirmRemoveModalString_SetList_s_ad0String_String_SetList_s_ad0String_String_String_SetList",getElementsContext(),new Object[]{ConfirmRemoveModalString_SetList_OnDelete10_,modalId_,setlist_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"ConfirmRemoveModalString_SetList_OnDelete2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
