package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_ta3SetList_LUserL_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputSEntityS_LEntityL_1_EditSetListModalSetList_ta3SetList_LUserLpc0",RefArg_inputSEntityS_LEntityL_1_EditSetListModalSetList_ta3SetList_LUserLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_ta3SetList_LUserL":keyOverwrite,EditSetListModalSetList_ta3SetList_LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_ta3SetList_LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
eligibleUsers_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "EditSetListModalSetList_ta3SetList_LUserL";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_ta3(setlist : SetList, eligibleUsers : ref [User])";
}
public String getElementsContext(){
if(calledName==null){
return "EditSetListModalSetList";
}
else {
return calledName;
}
}
private webdsl.generated.domain.SetList setlist_=null;
private utils.RefArg eligibleUsers_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_9300061870","inputSEntityS_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputSEntityS_LEntityL_1_EditSetListModalSetList_ta3SetList_LUserLpc0(setlist_),(java.util.List<webdsl.generated.domain.User>)eligibleUsers_.get()},"inputSEntityS_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputSEntityS_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputSEntityS_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputSEntityS_LEntityL(setlist.admins, eligibleUsers) at dashmodal.app:488/16");
}
}
}
