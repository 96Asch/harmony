package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditSetListModalSetList_Placeholder_ta0SetList_Placeholder_Template extends utils.TemplateServlet{
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
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.validateBool_String_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_EditSetListModalSetList_Placeholder_ta0SetList_Placeholderpc0",RefArg_inputString_1_EditSetListModalSetList_Placeholder_ta0SetList_Placeholderpc0.class);
utils.AbstractPageServlet.loadRefArgClasses(validateBool_String_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditSetListModalSetList_Placeholder_ta0SetList_Placeholder":keyOverwrite,EditSetListModalSetList_Placeholder_ta0SetList_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditSetListModalSetList_Placeholder_ta0SetList_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
setlist_=(webdsl.generated.domain.SetList)args[0];
cPh_=(String)args[1];
}
public String getUniqueName(){
return "EditSetListModalSetList_Placeholder_ta0SetList_Placeholder";
}
public String getTemplateSignature(){
return "template EditSetListModalSetList_Placeholder_ta0(setlist : SetList, cPh : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "EditSetListModalSetList_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.SetList setlist_=null;
private String cPh_="";
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall3864614450","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new webdsl.generated.templates.RefArg_inputString_1_EditSetListModalSetList_Placeholder_ta0SetList_Placeholderpc0(setlist_)},"inputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#inputString",new utils.TemplateCall("validateBool_String",utils.TemplateCall.SkipElementsMarker,new Object[]{!org.webdsl.tools.Utils.equal(setlist_,null)&&!org.webdsl.tools.Utils.equal(setlist_.getTitle(),""),"Title cannot be empty"},utils.TemplateCall.EmptyAttrs)),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(setlist.title) at dashmodal.app:311/14");
}
}
}
