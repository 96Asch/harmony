package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_ta5Song_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.Song> elems0=new java.util.ArrayList<webdsl.generated.domain.Song>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Song")){
elems0.add((webdsl.generated.domain.Song)ent);
}
}
}
}
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputFile_1_EditSongModalSong_ta5Songpc0",RefArg_inputFile_1_EditSongModalSong_ta5Songpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_ta5Song":keyOverwrite,EditSongModalSong_ta5Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_ta5Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "EditSongModalSong_ta5Song";
}
public String getTemplateSignature(){
return "template EditSongModalSong_ta5(song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "EditSongModalSong";
}
else {
return calledName;
}
}
private webdsl.generated.domain.Song song_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_5546763210"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_.gentemplatepredicate_EditSongModal0Song_(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_5546763210"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5546763210","inputFile",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputFile_1_EditSongModalSong_ta5Songpc0(song_)},"inputFile"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputFile",utils.TemplateCall.EmptyElementsCall),"inputFile",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputFile(song.refTrack) at dashmodal.app:132/68");
}
}
}
}