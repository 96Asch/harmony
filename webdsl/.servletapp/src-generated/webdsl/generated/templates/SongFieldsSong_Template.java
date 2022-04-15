package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongFieldsSong_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta8Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta7Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta6Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta5Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta4Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta3Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta1Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongFieldsSong_ta0Song_Template.class,null,staticEnv))))))));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta0Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta1Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta3Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta4Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta5Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta6Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta7Song_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongFieldsSong_ta8Song_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SongFieldsSong":keyOverwrite,SongFieldsSong_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongFieldsSong_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongFieldsSong";
}
public String getTemplateSignature(){
return "template SongFields(song : Song)";
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
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_8433642210","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta0Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title:\") at dashmodal.app:41/4");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_8433642212","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Subtitle:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta1Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Subtitle:\") at dashmodal.app:45/4");
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-12 col-md-5");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_8433642214","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"BPM:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta3Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"BPM:\") at dashmodal.app:49/10");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-12 col-md-7");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_8433642216","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Time Signature:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta4Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Time Signature:\") at dashmodal.app:55/10");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_8433642218","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Key:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta5Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Key:\") at dashmodal.app:66/4");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_84336422110","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Genre:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta6Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Genre:\") at dashmodal.app:70/4");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","d-block text-start");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_84336422112","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Reference Track:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta7Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Reference Track:\") at dashmodal.app:72/4");
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
utils.TemplateCall.appendWithPadding(classattrs,"form-check form-check-inline");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-label");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_84336422114","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Public:"},"labelString"),new org.webdsl.lang.Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("SongFieldsSong_ta8Song",getElementsContext(),new Object[]{song_},attrs)),"labelString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Public:\") at dashmodal.app:75/4");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
