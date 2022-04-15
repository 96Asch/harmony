package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_s_ad0String_String_SetList_Placeholder_Placeholder_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_s_ad0String_String_SetList_Placeholder_Placeholder_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder":keyOverwrite,EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSetListModalSetList_OnSave10_=(String)args[0];
setlist_=(webdsl.generated.domain.SetList)args[1];
songPh_=(String)args[2];
memberPh_=(String)args[3];
}
public String getUniqueName(){
return "EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_s_ad1(EditSetListModalSetList_OnSave10 : String, setlist : SetList, songPh : Placeholder, memberPh : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSetListModalSetList_OnSave10_="";
private webdsl.generated.domain.SetList setlist_=null;
private String songPh_="";
private String memberPh_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_17785320650"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_EditSetListModal_OnSave0SetList_SetList_.genactionpredicate_EditSetListModal_OnSave0SetList_SetList_(setlist_,setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_17785320650"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_17785320650","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSetListModalSetList_OnSave2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSetListModalSetList_s_ad1String_SetList_Placeholder_Placeholder_s_ad0String_String_SetList_Placeholder_Placeholder",getElementsContext(),new Object[]{EditSetListModalSetList_OnSave10_,setlist_,songPh_,memberPh_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSetListModalSetList_OnSave2\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
