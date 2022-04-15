package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songButtonBarSUserS_Song_Placeholder_Bool_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songButtonBarSUserS_Song_Placeholder_Bool":keyOverwrite,songButtonBarSUserS_Song_Placeholder_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songButtonBarSUserS_Song_Placeholder_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editors_=(java.util.Set<webdsl.generated.domain.User>)args[0];
song_=(webdsl.generated.domain.Song)args[1];
ph_=(String)args[2];
searchPublic_=(Boolean)args[3];
}
public String getUniqueName(){
return "songButtonBarSUserS_Song_Placeholder_Bool";
}
public String getTemplateSignature(){
return "template songButtonBar(editors : {User}, song : Song, ph : Placeholder, searchPublic : Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "songButtonBarSUserS_Song_Placeholder_Bool";
}
else {
return calledName;
}
}
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
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_5372988050"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_.gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_(editors_,song_,ph_,searchPublic_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_5372988050"+forelementid,if0);
}
}
if(if0){
if(RENDER_PHASE==phase){
out.print("<"+"div");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"w-100 d-flex justify-content-end");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"div");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"btn-group");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_5372988052","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("songButtonBarSUserS_Song_Placeholder_Bool_s_ad0String_SUserS_Song_Placeholder_Bool",getElementsContext(),new Object[]{editors_,song_,ph_,searchPublic_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
}
