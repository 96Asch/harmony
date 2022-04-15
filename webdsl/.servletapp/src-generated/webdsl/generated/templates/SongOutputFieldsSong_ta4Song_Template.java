package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongOutputFieldsSong_ta4Song_Template extends utils.TemplateServlet{
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
staticEnv.putTemplate(keyOverwrite==null?"SongOutputFieldsSong_ta4Song":keyOverwrite,SongOutputFieldsSong_ta4Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongOutputFieldsSong_ta4Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongOutputFieldsSong_ta4Song";
}
public String getTemplateSignature(){
return "template SongOutputFieldsSong_ta4(song : Song)";
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
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_21272194120"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(song_.getKey(),null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_21272194120"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_21272194120","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_.getKey().getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(song.key.name) at unknown context");
}
}
}
}
