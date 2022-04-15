package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta2SetList_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta2SetList":keyOverwrite,AddSetListModal_ta2SetList_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta2SetList_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSetListModal_ta2SetList";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta2(setlist : ref SetList)";
}
public String getElementsContext(){
if(calledName==null){
return "AddSetListModal";
}
else {
return calledName;
}
}
private utils.RefArg setlist_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_20337066520","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal((webdsl.generated.domain.SetList)setlist_.get(),null)&&!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SetList)setlist_.get()).getDeadline(),null),"You must set a deadline for this setlist"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(setlist != null && setlist.deadline != null, \"You must set a deadline for this setlist\") at dashmodal.app:213/15");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_20337066522","validateBool_String",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{!org.webdsl.tools.Utils.equal((webdsl.generated.domain.SetList)setlist_.get(),null)&&((webdsl.generated.domain.SetList)setlist_.get()).getDeadline().after(utils.DateType.today()),"Deadline must be later than today"},"validateBool_String"),new org.webdsl.lang.Environment(env).putWithcall("elements#validateBool_String",utils.TemplateCall.EmptyElementsCall),"validateBool_String",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"validateBool_String(setlist != null && setlist.deadline.after(today()), \"Deadline must be later than today\") at dashmodal.app:214/15");
}
}
}
