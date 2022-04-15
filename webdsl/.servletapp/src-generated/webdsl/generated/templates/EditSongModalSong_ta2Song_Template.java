package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_ta2Song_Template extends utils.TemplateServlet{
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
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputInt_1_EditSongModalSong_ta2Songpc0",RefArg_inputInt_1_EditSongModalSong_ta2Songpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_ta2Song":keyOverwrite,EditSongModalSong_ta2Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_ta2Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "EditSongModalSong_ta2Song";
}
public String getTemplateSignature(){
return "template EditSongModalSong_ta2(song : Song)";
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
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if13221839980"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_.gentemplatepredicate_EditSongModal0Song_(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if13221839980"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall13221839980","inputInt",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputInt_1_EditSongModalSong_ta2Songpc0(song_)},"inputInt"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputInt",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal(song_,null)&&(!(org.webdsl.tools.Utils.equal(song_.getBpm(),null)||org.webdsl.tools.Utils.equal(0,null))&&song_.getBpm()>0),"Beats per minute cannot be 0"},utils.TemplateCall.EmptyAttrs)),"inputInt",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputInt(song.bpm) at dashmodal.app:122/56");
}
}
}
}
