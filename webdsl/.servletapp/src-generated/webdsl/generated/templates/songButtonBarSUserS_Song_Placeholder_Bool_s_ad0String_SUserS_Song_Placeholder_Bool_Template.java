package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==3){
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_s_ad0String_String_SUserS_Song_Placeholder_Bool_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_s_ad0String_String_SUserS_Song_Placeholder_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool":keyOverwrite,songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong10_=(String)args[0];
editors_=(java.util.Set<webdsl.generated.domain.User>)args[1];
song_=(webdsl.generated.domain.Song)args[2];
ph_=(String)args[3];
searchPublic_=(Boolean)args[4];
}
public String getUniqueName(){
return "songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool";
}
public String getTemplateSignature(){
return "template songButtonBarSUserS_Song_Placeholder_Bool_s_ad0(songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong10 : String, editors : {User}, song : Song, ph : Placeholder, searchPublic : Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong10_="";
private java.util.Set<webdsl.generated.domain.User> editors_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private webdsl.generated.domain.Song song_=null;
private String ph_="";
private Boolean searchPublic_=false;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_20650265430"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_.gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_(editors_,song_,ph_,searchPublic_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20650265430"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_20650265431"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_.genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_(editors_,song_,ph_,searchPublic_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_20650265431"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_20650265430","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_s_ad0String_String_SUserS_Song_Placeholder_Bool",getElementsContext(),new Object[]{songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong10_,editors_,song_,ph_,searchPublic_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong2\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
