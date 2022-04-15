package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSongModalSong_ModalType_s_ad0String_Song_ModalType_Template extends utils.TemplateServlet{
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
if(i==3){
java.util.ArrayList<webdsl.generated.domain.ModalType> elems1=new java.util.ArrayList<webdsl.generated.domain.ModalType>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("ModalType")){
elems1.add((webdsl.generated.domain.ModalType)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditSongModalSong_ModalType_s_ad0String_Song_ModalType_s_ad0String_String_Song_ModalType_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditSongModalSong_ModalType_s_ad0String_Song_ModalType_s_ad0String_String_Song_ModalType_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSongModalSong_ModalType_s_ad0String_Song_ModalType":keyOverwrite,EditSongModalSong_ModalType_s_ad0String_Song_ModalType_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSongModalSong_ModalType_s_ad0String_Song_ModalType_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditSongModalSong_ModalType_ia00_=(String)args[0];
song_=(webdsl.generated.domain.Song)args[1];
type_=(webdsl.generated.domain.ModalType)args[2];
}
public String getUniqueName(){
return "EditSongModalSong_ModalType_s_ad0String_Song_ModalType";
}
public String getTemplateSignature(){
return "template EditSongModalSong_ModalType_s_ad0(EditSongModalSong_ModalType_ia00 : String, song : Song, type : ModalType)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditSongModalSong_ModalType_ia00_="";
private webdsl.generated.domain.Song song_=null;
private webdsl.generated.domain.ModalType type_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_20066289470"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_EditSongModal0Song_ModalType_.gentemplatepredicate_EditSongModal0Song_ModalType_(song_,type_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20066289470"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_20066289471"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_ModalType_.genactionpredicate_EditSongModal__0Song_ModalType_(song_,type_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20066289471"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_20066289470","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditSongModalSong_ModalType_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditSongModalSong_ModalType_s_ad0String_Song_ModalType_s_ad0String_String_Song_ModalType",getElementsContext(),new Object[]{EditSongModalSong_ModalType_ia00_,song_,type_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditSongModalSong_ModalType_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
