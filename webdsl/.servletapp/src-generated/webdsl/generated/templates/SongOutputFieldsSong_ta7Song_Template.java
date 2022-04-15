package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongOutputFieldsSong_ta7Song_Template extends utils.TemplateServlet{
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
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SongOutputFieldsSong_ta7Song":keyOverwrite,SongOutputFieldsSong_ta7Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongOutputFieldsSong_ta7Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongOutputFieldsSong_ta7Song";
}
public String getTemplateSignature(){
return "template SongOutputFieldsSong_ta7(song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "SongOutputFieldsSong";
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
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-output");
handleTemplateCall(phase,inForLoop,forelementid,"tcall2908875960","outputBool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_.getPublic()},"outputBool"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputBool",utils.TemplateCall.EmptyElementsCall),"outputBool",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputBool(song.public) at live.app:26/50");
}
}
}
