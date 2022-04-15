package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LiveSetList_Int_ta0SetList_Int_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LiveSetList_Int_ta0SetList_Int":keyOverwrite,LiveSetList_Int_ta0SetList_Int_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LiveSetList_Int_ta0SetList_Int_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
index_=(Integer)args[1];
}
public String getUniqueName(){
return "LiveSetList_Int_ta0SetList_Int";
}
public String getTemplateSignature(){
return "template LiveSetList_Int_ta0(setlist : SetList, index : Int)";
}
public String getElementsContext(){
if(calledName==null){
return "LiveSetList_Int";
}
else {
return calledName;
}
}
private webdsl.generated.domain.SetList setlist_=null;
private Integer index_=0;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_738290740"+forelementid))==null){
if0=webdsl.generated.functions.genpagepredicate_Live0SetList_Int_.genpagepredicate_Live0SetList_Int_(setlist_,index_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_738290740"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_738290740","Bootstrap",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"Bootstrap"),new org.webdsl.lang.Environment(env).putWithcall("elements#Bootstrap",utils.TemplateCall.EmptyElementsCall),"Bootstrap",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"Bootstrap() at live.app:9/6");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_738290742","GlobalCSS",env.addExtraLocalTemplateArgumentsToArguments(org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY,"GlobalCSS"),new org.webdsl.lang.Environment(env).putWithcall("elements#GlobalCSS",utils.TemplateCall.EmptyElementsCall),"GlobalCSS",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"GlobalCSS() at live.app:10/6");
}
if(RENDER_PHASE==phase){
threadLocalPageCached.addStylesheetInclude("dashboard.css");
}
}
}
}
