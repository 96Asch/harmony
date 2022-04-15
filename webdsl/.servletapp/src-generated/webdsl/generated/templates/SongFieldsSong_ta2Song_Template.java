package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongFieldsSong_ta2Song_Template extends utils.TemplateServlet{
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
staticEnv.putTemplate(keyOverwrite==null?"SongFieldsSong_ta2Song":keyOverwrite,SongFieldsSong_ta2Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongFieldsSong_ta2Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongFieldsSong_ta2Song";
}
public String getTemplateSignature(){
return "template SongFieldsSong_ta2(song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "SongFieldsSong";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall_14474951870","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal(song_,null)&&(!(org.webdsl.tools.Utils.equal(song_.getBpm(),null)||org.webdsl.tools.Utils.equal(0,null))&&song_.getBpm()>0),"Beats per minute cannot be 0"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(song != null && song.bpm > 0, \"Beats per minute cannot be 0\") at dashmodal.app:50/9");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_14474951872","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal(song_,null)&&(!(org.webdsl.tools.Utils.equal(song_.getBpm(),null)||org.webdsl.tools.Utils.equal(400,null))&&song_.getBpm()<400),"Beats per minute cannot exceed 400"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(song != null && song.bpm < 400, \"Beats per minute cannot exceed 400\") at dashmodal.app:51/9");
}
}
}
