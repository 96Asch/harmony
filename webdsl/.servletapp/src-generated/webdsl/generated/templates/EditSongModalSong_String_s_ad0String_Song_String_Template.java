package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_String_s_ad0String_Song_String_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_String_s_ad0String_Song_String_s_ad0String_String_Song_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_String_s_ad0String_Song_String_s_ad0String_String_Song_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_String_s_ad0String_Song_String":keyOverwrite,EditSongModalSong_String_s_ad0String_Song_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_String_s_ad0String_Song_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSongModalSong_String_ia00_=(String)args[0];
song_=(webdsl.generated.domain.Song)args[1];
header_=(String)args[2];
}
public String getUniqueName(){
return "EditSongModalSong_String_s_ad0String_Song_String";
}
public String getTemplateSignature(){
return "template EditSongModalSong_String_s_ad0(EditSongModalSong_String_ia00 : String, song : Song, header : String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSongModalSong_String_ia00_="";
private webdsl.generated.domain.Song song_=null;
private String header_="";
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_11628729380"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_String_.gentemplatepredicate_EditSongModal0Song_String_(song_,header_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11628729380"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_11628729381"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_String_.genactionpredicate_EditSongModal__0Song_String_(song_,header_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_11628729381"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11628729380","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSongModalSong_String_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSongModalSong_String_s_ad0String_Song_String_s_ad0String_String_Song_String",getElementsContext(),new Object[]{EditSongModalSong_String_ia00_,song_,header_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSongModalSong_String_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
