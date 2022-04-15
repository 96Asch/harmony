package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongFieldsSong_ta4Song_Template extends utils.TemplateServlet{
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
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputInt_1_SongFieldsSong_ta4Songpc0",RefArg_inputInt_1_SongFieldsSong_ta4Songpc0.class);
refargclasses.put("RefArg_inputInt_1_SongFieldsSong_ta4Songpc1",RefArg_inputInt_1_SongFieldsSong_ta4Songpc1.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SongFieldsSong_ta4Song":keyOverwrite,SongFieldsSong_ta4Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongFieldsSong_ta4Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongFieldsSong_ta4Song";
}
public String getTemplateSignature(){
return "template SongFieldsSong_ta4(song : Song)";
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
utils.TemplateCall.appendWithPadding(classattrs,"d-flex");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"maxlength","2");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_12670795930","inputInt",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputInt_1_SongFieldsSong_ta4Songpc0(song_)},"inputInt"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputInt",utils.TemplateCall.EmptyElementsCall),"inputInt",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputInt(song.timeSignature1) at dashmodal.app:57/13");
}
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"maxlength","2");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_12670795932","inputInt",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputInt_1_SongFieldsSong_ta4Songpc1(song_)},"inputInt"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputInt",utils.TemplateCall.EmptyElementsCall),"inputInt",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputInt(song.timeSignature2) at dashmodal.app:58/13");
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
}
}
