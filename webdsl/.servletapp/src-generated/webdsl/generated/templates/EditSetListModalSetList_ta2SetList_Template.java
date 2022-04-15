package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_ta2SetList_Template extends utils.TemplateServlet{
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
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_ta2SetList":keyOverwrite,EditSetListModalSetList_ta2SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_ta2SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
}
public String getUniqueName(){
return "EditSetListModalSetList_ta2SetList";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_ta2(setlist : SetList)";
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
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_329591350","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal(setlist_,null)&&!org.webdsl.tools.Utils.equal(setlist_.getDeadline(),null),"You must set a deadline for this setlist"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(setlist != null && setlist.deadline != null, \"You must set a deadline for this setlist\") at dashmodal.app:292/16");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_329591352","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal(setlist_,null)&&setlist_.getDeadline().after(utils.DateType.today()),"Deadline must be later than today"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(setlist != null && setlist.deadline.after(today()), \"Deadline must be later than today\") at dashmodal.app:293/16");
}
}
}
