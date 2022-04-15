package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta3SetList_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.AddSetListModal_ta2SetList_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputDate_1_AddSetListModal_ta3SetListpc0",RefArg_inputDate_1_AddSetListModal_ta3SetListpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(AddSetListModal_ta2SetList_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta3SetList":keyOverwrite,AddSetListModal_ta3SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta3SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSetListModal_ta3SetList";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta3(setlist : ref SetList)";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11571168530","inputDate",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputDate_1_AddSetListModal_ta3SetListpc0((webdsl.generated.domain.SetList)setlist_.get())},"inputDate"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputDate",new utils.TemplateCall("AddSetListModal_ta2SetList",getElementsContext(),new Object[]{setlist_},attrs)),"inputDate",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputDate(setlist.deadline) at dashmodal.app:212/14");
}
}
}
