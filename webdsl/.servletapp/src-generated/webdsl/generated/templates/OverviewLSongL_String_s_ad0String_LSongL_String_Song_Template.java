package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class OverviewLSongL_String_s_ad0String_LSongL_String_Song_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==4){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.OverviewLSongL_String_s_ad0String_LSongL_String_Song_s_ad0String_String_LSongL_String_Song_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(OverviewLSongL_String_s_ad0String_LSongL_String_Song_s_ad0String_String_LSongL_String_Song_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"OverviewLSongL_String_s_ad0String_LSongL_String_Song":keyOverwrite,OverviewLSongL_String_s_ad0String_LSongL_String_Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(OverviewLSongL_String_s_ad0String_LSongL_String_Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
OverviewLSongL_String_ia00_=(String)args[0];
songs_=(java.util.List<webdsl.generated.domain.Song>)args[1];
collapseId_=(String)args[2];
song_=(webdsl.generated.domain.Song)args[3];
}
public String getUniqueName(){
return "OverviewLSongL_String_s_ad0String_LSongL_String_Song";
}
public String getTemplateSignature(){
return "template OverviewLSongL_String_s_ad0(OverviewLSongL_String_ia00 : String, songs : [Song], collapseId : String, song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String OverviewLSongL_String_ia00_="";
private java.util.List<webdsl.generated.domain.Song> songs_=new java.util.ArrayList<webdsl.generated.domain.Song>();
private String collapseId_="";
private webdsl.generated.domain.Song song_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if9305404380"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_Overview0_.gentemplatepredicate_Overview0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if9305404380"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if9305404381"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_Overview__0_.genactionpredicate_Overview__0_();
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if9305404381"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall9305404380","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"OverviewLSongL_String_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("OverviewLSongL_String_s_ad0String_LSongL_String_Song_s_ad0String_String_LSongL_String_Song",getElementsContext(),new Object[]{OverviewLSongL_String_ia00_,songs_,collapseId_,song_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"OverviewLSongL_String_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
