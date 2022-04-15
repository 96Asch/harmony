package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SearchableUserListBand_Placeholder_ta0Band_Placeholder_String_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.Band> elems0=new java.util.ArrayList<webdsl.generated.domain.Band>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Band")){
elems0.add((webdsl.generated.domain.Band)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SearchableUserListBand_Placeholder_ta0Band_Placeholder_String":keyOverwrite,SearchableUserListBand_Placeholder_ta0Band_Placeholder_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SearchableUserListBand_Placeholder_ta0Band_Placeholder_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
band_=(webdsl.generated.domain.Band)args[0];
ph_=(String)args[1];
query_=(utils.RefArg)args[2];
}
public String getUniqueName(){
return "SearchableUserListBand_Placeholder_ta0Band_Placeholder_String";
}
public String getTemplateSignature(){
return "template SearchableUserListBand_Placeholder_ta0(band : Band, ph : Placeholder, query : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "SearchableUserListBand_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.Band band_=null;
private String ph_="";
private utils.RefArg query_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_4711555490"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.SearchableUserListBand_Placeholder_ta0Band_Placeholder_String_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_4711555490"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.SearchableUserListBand_Placeholder_ta0Band_Placeholder_String_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),query_,ph_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_4711555490"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_4711555490","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{query_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(query) at dashmodal.app:191/26");
}
}
}
