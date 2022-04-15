package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LiveSetList_Int_s_ad0String_SetList_Int_Int_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
java.util.ArrayList<webdsl.generated.domain.SetList> elems0=new java.util.ArrayList<webdsl.generated.domain.SetList>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("SetList")){
elems0.add((webdsl.generated.domain.SetList)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LiveSetList_Int_s_ad0String_SetList_Int_Int_s_ad0String_String_SetList_Int_Int_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(LiveSetList_Int_s_ad0String_SetList_Int_Int_s_ad0String_String_SetList_Int_Int_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LiveSetList_Int_s_ad0String_SetList_Int_Int":keyOverwrite,LiveSetList_Int_s_ad0String_SetList_Int_Int_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LiveSetList_Int_s_ad0String_SetList_Int_Int_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
LiveSetList_Int_OnPrevSong10_=(String)args[0];
setlist_=(webdsl.generated.domain.SetList)args[1];
index_=(Integer)args[2];
pageIndex_=(utils.RefArg)args[3];
}
public String getUniqueName(){
return "LiveSetList_Int_s_ad0String_SetList_Int_Int";
}
public String getTemplateSignature(){
return "template LiveSetList_Int_s_ad0(LiveSetList_Int_OnPrevSong10 : String, setlist : SetList, index : Int, pageIndex : ref Int)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String LiveSetList_Int_OnPrevSong10_="";
private webdsl.generated.domain.SetList setlist_=null;
private Integer index_=0;
private utils.RefArg pageIndex_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if8443577570"+forelementid))==null){
if1=webdsl.generated.functions.genpagepredicate_Live0SetList_Int_.genpagepredicate_Live0SetList_Int_(setlist_,index_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8443577570"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if8443577571"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_Live__0SetList_Int_.genactionpredicate_Live__0SetList_Int_(setlist_,index_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8443577571"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall8443577570","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"LiveSetList_Int_OnPrevSong2"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("LiveSetList_Int_s_ad0String_SetList_Int_Int_s_ad0String_String_SetList_Int_Int",getElementsContext(),new Object[]{LiveSetList_Int_OnPrevSong10_,setlist_,index_,pageIndex_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"LiveSetList_Int_OnPrevSong2\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
