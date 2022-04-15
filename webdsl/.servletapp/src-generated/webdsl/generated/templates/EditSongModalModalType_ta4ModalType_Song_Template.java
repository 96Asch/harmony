package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalModalType_ta4ModalType_Song_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.ModalType> elems0=new java.util.ArrayList<webdsl.generated.domain.ModalType>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ModalType")){
elems0.add((webdsl.generated.domain.ModalType)ent);
}
}
}
}
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputFile_1_EditSongModalModalType_ta4ModalType_Songpc0",RefArg_inputFile_1_EditSongModalModalType_ta4ModalType_Songpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalModalType_ta4ModalType_Song":keyOverwrite,EditSongModalModalType_ta4ModalType_Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalModalType_ta4ModalType_Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
type_=(webdsl.generated.domain.ModalType)args[0];
song_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "EditSongModalModalType_ta4ModalType_Song";
}
public String getTemplateSignature(){
return "template EditSongModalModalType_ta4(type : ModalType, song : ref Song)";
}
public String getElementsContext(){
if(calledName==null){
return "EditSongModalModalType";
}
else {
return calledName;
}
}
private webdsl.generated.domain.ModalType type_=null;
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16614660000","inputFile",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputFile_1_EditSongModalModalType_ta4ModalType_Songpc0((webdsl.generated.domain.Song)song_.get())},"inputFile"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputFile",utils.TemplateCall.EmptyElementsCall),"inputFile",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputFile(song.refTrack) at dashmodal.app:134/74");
}
}
}
