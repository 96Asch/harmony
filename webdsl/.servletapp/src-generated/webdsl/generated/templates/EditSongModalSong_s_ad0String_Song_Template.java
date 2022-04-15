package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_s_ad0String_Song_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_s_ad0String_Song_s_ad0String_String_Song_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_s_ad0String_Song_s_ad0String_String_Song_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_s_ad0String_Song":keyOverwrite,EditSongModalSong_s_ad0String_Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_s_ad0String_Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSongModalSong_OnSongSave10_=(String)args[0];
song_=(webdsl.generated.domain.Song)args[1];
}
public String getUniqueName(){
return "EditSongModalSong_s_ad0String_Song";
}
public String getTemplateSignature(){
return "template EditSongModalSong_s_ad0(EditSongModalSong_OnSongSave10 : String, song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSongModalSong_OnSongSave10_="";
private webdsl.generated.domain.Song song_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_991834920"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_.gentemplatepredicate_EditSongModal0Song_(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_991834920"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_991834921"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_.genactionpredicate_EditSongModal__0Song_(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_991834921"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_991834920","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSongModalSong_OnSongSave2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSongModalSong_s_ad0String_Song_s_ad0String_String_Song",getElementsContext(),new Object[]{EditSongModalSong_OnSongSave10_,song_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSongModalSong_OnSongSave2\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
