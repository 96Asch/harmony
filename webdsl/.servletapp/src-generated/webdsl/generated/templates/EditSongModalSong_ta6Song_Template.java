package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_ta6Song_Template extends utils.TemplateServlet{
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
refargclasses.put("RefArg_inputBool_1_EditSongModalSong_ta6Songpc0",RefArg_inputBool_1_EditSongModalSong_ta6Songpc0.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_ta6Song":keyOverwrite,EditSongModalSong_ta6Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_ta6Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "EditSongModalSong_ta6Song";
}
public String getTemplateSignature(){
return "template EditSongModalSong_ta6(song : Song)";
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
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if16830151240"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_.gentemplatepredicate_EditSongModal0Song_(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if16830151240"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-input");
handleTemplateCall(phase,inForLoop,forelementid,"tcall16830151240","inputBool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputBool_1_EditSongModalSong_ta6Songpc0(song_)},"inputBool"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputBool",utils.TemplateCall.EmptyElementsCall),"inputBool",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputBool(song.public) at dashmodal.app:135/57");
}
}
}
}
