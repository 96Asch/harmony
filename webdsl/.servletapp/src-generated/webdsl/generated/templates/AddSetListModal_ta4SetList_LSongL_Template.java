package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta4SetList_LSongL_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta4SetList_LSongLpc0",RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta4SetList_LSongLpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta4SetList_LSongL":keyOverwrite,AddSetListModal_ta4SetList_LSongL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta4SetList_LSongL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(utils.RefArg)args[0];
eligibleSongs_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddSetListModal_ta4SetList_LSongL";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta4(setlist : ref SetList, eligibleSongs : ref [Song])";
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
private utils.RefArg eligibleSongs_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_12423179070","inputLEntityL_LEntityL",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputLEntityL_LEntityL_1_AddSetListModal_ta4SetList_LSongLpc0((webdsl.generated.domain.SetList)setlist_.get()),(java.util.List<webdsl.generated.domain.Song>)eligibleSongs_.get()},"inputLEntityL_LEntityL"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputLEntityL_LEntityL",utils.TemplateCall.EmptyElementsCall),"inputLEntityL_LEntityL",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputLEntityL_LEntityL(setlist.songs, eligibleSongs) at dashmodal.app:333/16");
}
}
}
