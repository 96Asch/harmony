package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSongModal_ta7Song_File_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSongModal_ta7Song_File":keyOverwrite,AddSongModal_ta7Song_File_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSongModal_ta7Song_File_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
song_=(utils.RefArg)args[0];
choFile_=(utils.RefArg)args[1];
}
public String getUniqueName(){
return "AddSongModal_ta7Song_File";
}
public String getTemplateSignature(){
return "template AddSongModal_ta7(song : ref Song, choFile : ref File)";
}
public String getElementsContext(){
if(calledName==null){
return "AddSongModal";
}
else {
return calledName;
}
}
private utils.RefArg song_=null;
private utils.RefArg choFile_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
if(DATABIND_PHASE==phase){
String actionid0=(inForLoop?forelementid:"")+("action_11297352850"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid0)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.AddSongModal_ta7Song_File_ia0.isValidationDisabled();
}
}
if(ACTION_PHASE==phase){
String actionid1=(inForLoop?forelementid:"")+("action_11297352850"+getUniqueId());
if(threadLocalPageCached.getParammap().get(actionid1)!=null){
threadLocalPageCached.enableAjaxActionExecuted();
new webdsl.generated.actions.AddSongModal_ta7Song_File_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),choFile_,song_,ident);
return;}
}
java.util.Map<String,String> attrsmapout=new java.util.HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-input");
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"onclick","serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+"\",\""+((inForLoop?forelementid:"")+("action_11297352850"+getUniqueId()))+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"false"+",\""+threadLocalPageCached.placeholderId+"\");");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_11297352850","inputFile",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{choFile_},"inputFile"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputFile",utils.TemplateCall.EmptyElementsCall),"inputFile",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputFile(choFile) at dashmodal.app:86/65");
}
}
}
