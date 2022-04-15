package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta1SetList_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputText_1_AddSetListModal_ta1SetListpc0",RefArg_inputText_1_AddSetListModal_ta1SetListpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta1SetList":keyOverwrite,AddSetListModal_ta1SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta1SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSetListModal_ta1SetList";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta1(setlist : ref SetList)";
}
public String getElementsContext(){
if(calledName==null){
return "AddSetListModal";
}
else {
return calledName;
}
}
private utils.RefArg setlist_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall13846708450","inputText",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputText_1_AddSetListModal_ta1SetListpc0((webdsl.generated.domain.SetList)setlist_.get())},"inputText"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputText",utils.TemplateCall.EmptyElementsCall),"inputText",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputText(setlist.description) at dashmodal.app:208/14");
}
}
}
