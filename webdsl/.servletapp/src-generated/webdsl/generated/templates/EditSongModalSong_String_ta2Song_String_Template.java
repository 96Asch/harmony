package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_String_ta2Song_String_Template extends utils.TemplateServlet{
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
refargclasses.put("RefArg_inputEntity_1_EditSongModalSong_String_ta2Song_Stringpc0",RefArg_inputEntity_1_EditSongModalSong_String_ta2Song_Stringpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_String_ta2Song_String":keyOverwrite,EditSongModalSong_String_ta2Song_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_String_ta2Song_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
header_=(String)args[1];
}
public String getUniqueName(){
return "EditSongModalSong_String_ta2Song_String";
}
public String getTemplateSignature(){
return "template EditSongModalSong_String_ta2(song : Song, header : String)";
}
public String getElementsContext(){
if(calledName==null){
return "EditSongModalSong_String";
}
else {
return calledName;
}
}
private webdsl.generated.domain.Song song_=null;
private String header_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if4827769670"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_String_.gentemplatepredicate_EditSongModal0Song_String_(song_,header_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if4827769670"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
handleTemplateCall(phase,inForLoop,forelementid,"tcall4827769670","inputEntity",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputEntity_1_EditSongModalSong_String_ta2Song_Stringpc0(song_)},"inputEntity"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputEntity",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal(song_,null)&&!org.webdsl.tools.Utils.equal(song_.getKey(),null),"Key cannot be null"},utils.TemplateCall.EmptyAttrs)),"inputEntity",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputEntity(song.key) at dashmodal.app:129/59");
}
}
}
}
