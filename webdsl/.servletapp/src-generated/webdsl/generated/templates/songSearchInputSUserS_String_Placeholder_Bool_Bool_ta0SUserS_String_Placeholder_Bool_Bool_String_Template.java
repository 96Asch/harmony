package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0SUserS_String_Placeholder_Bool_Bool_String_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0SUserS_String_Placeholder_Bool_Bool_String":keyOverwrite,songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0SUserS_String_Placeholder_Bool_Bool_String_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0SUserS_String_Placeholder_Bool_Bool_String_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
editors_=(java.util.Set<webdsl.generated.domain.User>)args[0];
query_=(String)args[1];
ph_=(String)args[2];
searchPublic_=(Boolean)args[3];
multipleAllowed_=(Boolean)args[4];
newQuery_=(utils.RefArg)args[5];
}
public String getUniqueName(){
return "songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0SUserS_String_Placeholder_Bool_Bool_String";
}
public String getTemplateSignature(){
return "template songSearchInputSUserS_String_Placeholder_Bool_Bool_ta0(editors : {User}, query : String, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool, newQuery : ref String)";
}
public String getElementsContext(){
if(calledName==null){
return "songSearchInputSUserS_String_Placeholder_Bool_Bool";
}
else {
return calledName;
}
}
private java.util.Set<webdsl.generated.domain.User> editors_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private String query_="";
private String ph_="";
private Boolean searchPublic_=false;
private Boolean multipleAllowed_=false;
private utils.RefArg newQuery_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if15979245760"+forelementid))==null){
if0=webdsl.generated.functions.gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_Bool_Bool_.gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_Bool_Bool_(editors_,query_,ph_,searchPublic_,multipleAllowed_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if15979245760"+forelementid,if0);
}
}
if(if0){
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action15979245760"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.songSearchInputSUserS_String_Placeholder_Bool_Bool_OnSearch0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action15979245760"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.songSearchInputSUserS_String_Placeholder_Bool_Bool_OnSearch0().run(threadLocalPageCached,getEnv(),getElementsContext(),newQuery_,multipleAllowed_,searchPublic_,ph_,query_,editors_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-control");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"oninput","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action15979245760"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall15979245760","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{newQuery_},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",utils.TemplateCall.EmptyElementsCall),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(newQuery) at songsearch.app:13/8");
}
}
}
}
