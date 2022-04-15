package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS":keyOverwrite,EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSetListModalSetList_Placeholder_OnDelete10_=(String)args[0];
setlist_=(webdsl.generated.domain.SetList)args[1];
cPh_=(String)args[2];
songPh_=(String)args[3];
memberPh_=(String)args[4];
nonPendingMembers_=(utils.RefArg)args[5];
nonPendingAdmins_=(utils.RefArg)args[6];
pendingMembers_=(utils.RefArg)args[7];
}
public String getUniqueName(){
return "EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_Placeholder_s_ad2(EditSetListModalSetList_Placeholder_OnDelete10 : String, setlist : SetList, cPh : Placeholder, songPh : Placeholder, memberPh : Placeholder, nonPendingMembers : ref {User}, nonPendingAdmins : ref {User}, pendingMembers : ref {User})";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSetListModalSetList_Placeholder_OnDelete10_="";
private webdsl.generated.domain.SetList setlist_=null;
private String cPh_="";
private String songPh_="";
private String memberPh_="";
private utils.RefArg nonPendingMembers_=null;
private utils.RefArg nonPendingAdmins_=null;
private utils.RefArg pendingMembers_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_13211526460"+forelementid))==null){
if0=webdsl.generated.functions.genactioncombined_OnDelete0SetList_Placeholder_Placeholder_SetList_.genactioncombined_OnDelete0SetList_Placeholder_Placeholder_SetList_(setlist_,cPh_,cPh_,setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_13211526460"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_13211526460","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSetListModalSetList_Placeholder_OnDelete2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSetListModalSetList_Placeholder_s_ad2String_SetList_Placeholder_Placeholder_Placeholde29String_String_SetList_Placeholder_Placeholder_Placeholder_SUserS_SUserS_SUserS",getElementsContext(),new Object[]{EditSetListModalSetList_Placeholder_OnDelete10_,setlist_,cPh_,songPh_,memberPh_,nonPendingMembers_,nonPendingAdmins_,pendingMembers_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSetListModalSetList_Placeholder_OnDelete2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
