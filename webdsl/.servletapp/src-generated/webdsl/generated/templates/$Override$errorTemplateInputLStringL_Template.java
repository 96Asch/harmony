package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class $Override$errorTemplateInputLStringL_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"errorTemplateInputLStringL":keyOverwrite,$Override$errorTemplateInputLStringL_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap($Override$errorTemplateInputLStringL_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
messages_=(java.util.List<String>)args[0];
}
public String getUniqueName(){
return "errorTemplateInputLStringL";
}
public String getTemplateSignature(){
return "template errorTemplateInput(messages : [String])";
}
public String getElementsContext(){
if(calledName==null){
return "errorTemplateInputLStringL";
}
else {
return calledName;
}
}
private java.util.List<String> messages_=new java.util.ArrayList<String>();
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
try{
utils.TemplateCall elems=env.getElementscall("elements#"+getElementsContext());
java.util.Map<String,String> attrsmapout=elems.attrs;
handleTemplateCall(phase,inForLoop,forelementid,"tcall12408285120",elems.name,env.addExtraLocalTemplateArgumentsToArguments(elems.args,elems.name),new org.webdsl.lang.Environment(env),elems.parentName,attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"elements()");
}
if(RENDER_PHASE==phase){
out.print("<"+"div");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-6");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<String> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<String>)getTemplatecalls().get("for12408285120"+forelementid))==null){
java.util.Collection<? extends String> expr0=messages_;
java.util.ArrayList<String> list1=new java.util.ArrayList<String>(expr0);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for12408285120"+forelementid,forcol0);
}
}
int i0=-1;
for(String ve_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(ve_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)ve_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
if(RENDER_PHASE==phase){
out.print("<"+"div");
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"span");
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
utils.TemplateCall.appendWithPadding(styleattrs,"color: #FF0000");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString(ve_,out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
out.print("</"+"div"+">");
}
}
}
