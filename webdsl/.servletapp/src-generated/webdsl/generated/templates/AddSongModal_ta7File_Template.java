package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSongModal_ta7File_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSongModal_ta7File":keyOverwrite,AddSongModal_ta7File_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSongModal_ta7File_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
choFile_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSongModal_ta7File";
}
public String getTemplateSignature(){
return "template AddSongModal_ta7(choFile : ref File)";
}
public String getElementsContext(){
if(calledName==null){
return "AddSongModal";
}
else {
return calledName;
}
}
private utils.RefArg choFile_=null;
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
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","form-check-input");
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16559497590","inputFile",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{choFile_},"inputFile"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputFile",utils.TemplateCall.EmptyElementsCall),"inputFile",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputFile(choFile) at dashmodal.app:86/65");
}
}
}
