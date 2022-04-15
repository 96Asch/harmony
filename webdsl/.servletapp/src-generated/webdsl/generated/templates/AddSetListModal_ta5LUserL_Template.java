package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class AddSetListModal_ta5LUserL_Template extends utils.TemplateServlet{
public void prefetchFor_17997770020(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"AddSetListModal_ta5LUserL":keyOverwrite,AddSetListModal_ta5LUserL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(AddSetListModal_ta5LUserL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
userList_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "AddSetListModal_ta5LUserL";
}
public String getTemplateSignature(){
return "template AddSetListModal_ta5(userList : ref [User])";
}
public String getElementsContext(){
if(calledName==null){
return "AddSetListModal";
}
else {
return calledName;
}
}
private utils.RefArg userList_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<"+"ul");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for17773568950"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=(java.util.List<webdsl.generated.domain.User>)userList_.get();
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor_17997770020(list1,true);
prefetchFor_17997770020(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for17773568950"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User AddSetListModal_ta5LUserL_outputlist0_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(AddSetListModal_ta5LUserL_outputlist0_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)AddSetListModal_ta5LUserL_outputlist0_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
if(RENDER_PHASE==phase){
out.print("<"+"li");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"block");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if17773568950"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(AddSetListModal_ta5LUserL_outputlist0_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if17773568950"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall17773568950","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{AddSetListModal_ta5LUserL_outputlist0_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(AddSetListModal_ta5LUserL_outputlist0.name) at unknown context");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"li"+">");
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid0;
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementid="0";
fallbackcounter=0;
}
if(RENDER_PHASE==phase){
out.print("</"+"ul"+">");
}
}
}
