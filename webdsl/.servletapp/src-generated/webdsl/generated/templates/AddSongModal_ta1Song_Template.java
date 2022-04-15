package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSongModal_ta1Song_Template extends utils.TemplateServlet{
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_AddSongModal_ta1Songpc0",RefArg_inputString_1_AddSongModal_ta1Songpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSongModal_ta1Song":keyOverwrite,AddSongModal_ta1Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSongModal_ta1Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSongModal_ta1Song";
}
public String getTemplateSignature(){
return "template AddSongModal_ta1(song : ref Song)";
}
public String getElementsContext(){
if(calledName==null){
return "AddSongModal";
}
else {
return calledName;
}
}
private utils.RefArg song_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_12446836800","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_AddSongModal_ta1Songpc0((webdsl.generated.domain.Song)song_.get())},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(song.subtitle) at dashmodal.app:63/65");
}
}
}
