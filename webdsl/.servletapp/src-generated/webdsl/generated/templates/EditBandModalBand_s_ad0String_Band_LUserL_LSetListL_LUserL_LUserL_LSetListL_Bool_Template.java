package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==2){
java.util.ArrayList<webdsl.generated.domain.Band> elems0=new java.util.ArrayList<webdsl.generated.domain.Band>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Band")){
elems0.add((webdsl.generated.domain.Band)ent);
}
}
}
}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_s_ad0String_String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_s_ad0String_String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool":keyOverwrite,EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
EditBandModalBand_ia00_=(String)args[0];
band_=(webdsl.generated.domain.Band)args[1];
eligibleUsers_=(utils.RefArg)args[2];
eligibleSetlists_=(utils.RefArg)args[3];
members_=(utils.RefArg)args[4];
admins_=(utils.RefArg)args[5];
setlists_=(utils.RefArg)args[6];
valid_=(utils.RefArg)args[7];
}
public String getUniqueName(){
return "EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool";
}
public String getTemplateSignature(){
return "template EditBandModalBand_s_ad0(EditBandModalBand_ia00 : String, band : Band, eligibleUsers : ref [User], eligibleSetlists : ref [SetList], members : ref [User], admins : ref [User], setlists : ref [SetList], valid : ref Bool)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String EditBandModalBand_ia00_="";
private webdsl.generated.domain.Band band_=null;
private utils.RefArg eligibleUsers_=null;
private utils.RefArg eligibleSetlists_=null;
private utils.RefArg members_=null;
private utils.RefArg admins_=null;
private utils.RefArg setlists_=null;
private utils.RefArg valid_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if_14144287430"+forelementid))==null){
if1=webdsl.generated.functions.gentemplatepredicate_EditBandModal0Band_.gentemplatepredicate_EditBandModal0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_14144287430"+forelementid,if1);
}
}
if(if1){
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_14144287431"+forelementid))==null){
if0=webdsl.generated.functions.genactionpredicate_EditBandModal__0Band_.genactionpredicate_EditBandModal__0Band_(band_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_14144287431"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_14144287430","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"EditBandModalBand_ia0_"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("EditBandModalBand_s_ad0String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool_s_ad0String_String_Band_LUserL_LSetListL_LUserL_LUserL_LSetListL_Bool",getElementsContext(),new Object[]{EditBandModalBand_ia00_,band_,eligibleUsers_,eligibleSetlists_,members_,admins_,setlists_,valid_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"EditBandModalBand_ia0\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
}
}
}
