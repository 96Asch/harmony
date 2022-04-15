package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SetListFieldsSetList_Template extends utils.TemplateServlet{
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
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SetListFieldsSetList_ta3SetList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SetListFieldsSetList_ta1SetList_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SetListFieldsSetList_ta0SetList_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(SetListFieldsSetList_ta0SetList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SetListFieldsSetList_ta1SetList_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SetListFieldsSetList_ta3SetList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SetListFieldsSetList":keyOverwrite,SetListFieldsSetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SetListFieldsSetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
}
public String getUniqueName(){
return "SetListFieldsSetList";
}
public String getTemplateSignature(){
return "template SetListFields(setlist : SetList)";
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall6955858020","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SetListFieldsSetList_ta0SetList",getElementsContext(),new Object[]{setlist_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title:\") at dashmodal.app:181/4");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall6955858022","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Short description:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SetListFieldsSetList_ta1SetList",getElementsContext(),new Object[]{setlist_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Short description:\") at dashmodal.app:187/4");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall6955858024","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Setlist Deadline:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SetListFieldsSetList_ta3SetList",getElementsContext(),new Object[]{setlist_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Setlist Deadline:\") at dashmodal.app:191/4");
}
}
}
