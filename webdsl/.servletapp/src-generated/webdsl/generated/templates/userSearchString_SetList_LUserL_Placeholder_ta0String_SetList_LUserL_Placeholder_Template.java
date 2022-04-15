package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_Template extends utils.TemplateServlet{
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
public void prefetchFor15028688860(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder":keyOverwrite,userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
setlist_=(webdsl.generated.domain.SetList)args[1];
users_=(java.util.List<webdsl.generated.domain.User>)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder";
}
public String getTemplateSignature(){
return "template userSearchString_SetList_LUserL_Placeholder_ta0(query : String, setlist : SetList, users : [User], ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "userSearchString_SetList_LUserL_Placeholder";
}
else {
return calledName;
}
}
private String query_="";
private webdsl.generated.domain.SetList setlist_=null;
private java.util.List<webdsl.generated.domain.User> users_=new java.util.ArrayList<webdsl.generated.domain.User>();
private String ph_="";
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
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for_16090622670"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=users_;
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor15028688860(list1,true);
prefetchFor15028688860(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_16090622670"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0_;
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
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_16090622670"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0_,null);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_16090622670"+forelementid,if0);
}
}
if(if0){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_16090622670","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{userSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0_.getName()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(\nuserSearchString_SetList_LUserL_Placeholder_ta0String_SetList_LUserL_Placeholder_outputlis0.name) at unknown context");
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
