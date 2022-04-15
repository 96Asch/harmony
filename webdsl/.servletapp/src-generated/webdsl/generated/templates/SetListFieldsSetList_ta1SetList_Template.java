package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SetListFieldsSetList_ta1SetList_Template extends utils.TemplateServlet{
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
refargclasses.put("RefArg_inputText_1_SetListFieldsSetList_ta1SetListpc0",RefArg_inputText_1_SetListFieldsSetList_ta1SetListpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SetListFieldsSetList_ta1SetList":keyOverwrite,SetListFieldsSetList_ta1SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SetListFieldsSetList_ta1SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
}
public String getUniqueName(){
return "SetListFieldsSetList_ta1SetList";
}
public String getTemplateSignature(){
return "template SetListFieldsSetList_ta1(setlist : SetList)";
}
public String getElementsContext(){
if(calledName==null){
return "SetListFieldsSetList";
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
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"prompt","Optional");
handleTemplateCall(phase,inForLoop,forelementid,"tcall1888727900","inputText",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputText_1_SetListFieldsSetList_ta1SetListpc0(setlist_)},"inputText"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputText",utils.TemplateCall.EmptyElementsCall),"inputText",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputText(setlist.description) at dashmodal.app:188/6");
}
}
}
