package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSongModal_ta2Song_Template extends utils.TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputInt_1_AddSongModal_ta2Songpc0",RefArg_inputInt_1_AddSongModal_ta2Songpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSongModal_ta2Song":keyOverwrite,AddSongModal_ta2Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSongModal_ta2Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSongModal_ta2Song";
}
public String getTemplateSignature(){
return "template AddSongModal_ta2(song : ref Song)";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall9930077650","inputInt",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputInt_1_AddSongModal_ta2Songpc0((webdsl.generated.domain.Song)song_.get())},"inputInt"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputInt",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal((webdsl.generated.domain.Song)song_.get(),null)&&(!(org.webdsl.tools.Utils.equal(((webdsl.generated.domain.Song)song_.get()).getBpm(),null)||org.webdsl.tools.Utils.equal(0,null))&&((webdsl.generated.domain.Song)song_.get()).getBpm()>0),"Beats per minute cannot be 0"},utils.TemplateCall.EmptyAttrs)),"inputInt",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputInt(song.bpm) at dashmodal.app:65/62");
}
}
}
