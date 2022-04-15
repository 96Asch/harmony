package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongFieldsSong_ta4Song_Int_Template extends utils.TemplateServlet{
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
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SongFieldsSong_ta4Song_Int":keyOverwrite,SongFieldsSong_ta4Song_Int_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongFieldsSong_ta4Song_Int_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
time1_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "SongFieldsSong_ta4Song_Int";
}
public String getTemplateSignature(){
return "template SongFieldsSong_ta4(song : Song, time1 : ref Int)";
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
private utils.RefArg time1_=null;
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"maxlength","2");
handleTemplateCall(phase,inForLoop,forelementid,"tcall21414806470","inputInt",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{time1_},"inputInt"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputInt",utils.TemplateCall.EmptyElementsCall),"inputInt",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputInt(time1) at dashmodal.app:57/56");
}
}
}
