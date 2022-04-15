package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongOutputFieldsSong_ta6Song_Template extends utils.TemplateServlet{
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
staticEnv.putTemplate(keyOverwrite==null?"SongOutputFieldsSong_ta6Song":keyOverwrite,SongOutputFieldsSong_ta6Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongOutputFieldsSong_ta6Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(webdsl.generated.domain.Song)args[0];
}
public String getUniqueName(){
return "SongOutputFieldsSong_ta6Song";
}
public String getTemplateSignature(){
return "template SongOutputFieldsSong_ta6(song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "SongOutputFieldsSong";
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
switch(phase){case DATABIND_PHASE:ident="";
if(inForLoop){
ident+=forelementid;
}
ident=(inForLoop?forelementid:"")+("action_19468038490"+getUniqueId());
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SongOutputFieldsSong_ta6Song_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident="";
if(inForLoop){
ident+=forelementid;
}
ident=(inForLoop?forelementid:"")+("action_19468038490"+getUniqueId());
if(threadLocalPageCached.getParammap().get(ident)!=null){
new webdsl.generated.actions.SongOutputFieldsSong_ta6Song_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),song_,ident);
}
break;case RENDER_PHASE:out.print("<a href=\"javascript:void(0)\" onclick='javascript:serverInvokeDownloadCompatible(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+((inForLoop?forelementid:"")+("action_19468038490"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this,\""+threadLocalPageCached.placeholderId+"\")'");
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
if(!ignorecols.contains("downloadlink")){
AttributeCollectionLookup.getAttributeCollection("downloadlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_19468038490","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_.getRefTrack().getFileName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(song.refTrack.fileName()) at unknown context");
}
out.print("</a>");
break;}}
}
