package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LiveSetList_s_ad1String_SetList_Placeholder_Int_Template extends utils.TemplateServlet{
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
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.LiveSetList_s_ad1String_SetList_Placeholder_Int_s_ad0String_String_SetList_Placeholder_Int_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(LiveSetList_s_ad1String_SetList_Placeholder_Int_s_ad0String_String_SetList_Placeholder_Int_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LiveSetList_s_ad1String_SetList_Placeholder_Int":keyOverwrite,LiveSetList_s_ad1String_SetList_Placeholder_Int_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LiveSetList_s_ad1String_SetList_Placeholder_Int_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
LiveSetList_ia00_=(String)args[0];
setlist_=(webdsl.generated.domain.SetList)args[1];
ph_=(String)args[2];
pageIndex_=(utils.RefArg)args[3];
}
public String getUniqueName(){
return "LiveSetList_s_ad1String_SetList_Placeholder_Int";
}
public String getTemplateSignature(){
return "template LiveSetList_s_ad1(LiveSetList_ia00 : String, setlist : SetList, ph : Placeholder, pageIndex : ref Int)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String LiveSetList_ia00_="";
private webdsl.generated.domain.SetList setlist_=null;
private String ph_="";
private utils.RefArg pageIndex_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if13323018960"+forelementid))==null){
if1=webdsl.generated.functions.genpagepredicate_Live0SetList_.genpagepredicate_Live0SetList_(setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if13323018960"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if13323018961"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_Live__0SetList_.genactionpredicate_Live__0SetList_(setlist_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if13323018961"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall13323018960","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"LiveSetList_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("LiveSetList_s_ad1String_SetList_Placeholder_Int_s_ad0String_String_SetList_Placeholder_Int",getElementsContext(),new Object[]{LiveSetList_ia00_,setlist_,ph_,pageIndex_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"LiveSetList_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
