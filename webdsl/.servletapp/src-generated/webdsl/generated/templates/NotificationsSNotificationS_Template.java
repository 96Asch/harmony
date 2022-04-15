package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class NotificationsSNotificationS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"NotificationsSNotificationS":keyOverwrite,NotificationsSNotificationS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(NotificationsSNotificationS_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
notifications_=(java.util.Set<webdsl.generated.domain.Notification>)args[0];
}
public String getUniqueName(){
return "NotificationsSNotificationS";
}
public String getTemplateSignature(){
return "template Notifications(notifications : {Notification})";
}
public String getElementsContext(){
if(calledName==null){
return "NotificationsSNotificationS";
}
else {
return calledName;
}
}
private java.util.Set<webdsl.generated.domain.Notification> notifications_=new java.util.LinkedHashSet<webdsl.generated.domain.Notification>();
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
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
utils.TemplateCall.appendWithPadding(classattrs,"col-12 col-sm-12 col-md-4 col-lg-3");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
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
utils.TemplateCall.appendWithPadding(classattrs,"row bg-secondary border rounded");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
out.print("<"+"h5");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Notifications",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"h5"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"col d-flex justify-content-end");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if11197204160"+forelementid))==null){
if0=!(org.webdsl.tools.Utils.equal(notifications_.size(),null)||org.webdsl.tools.Utils.equal(0,null))&&notifications_.size()>0;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if11197204160"+forelementid,if0);
}
}
if(if0){
if(RENDER_PHASE==phase){
out.print("<"+"button");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-danger mt-1 mb-1");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("type","button"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-toggle","modal"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("data-bs-target","#clearNotification"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Clear",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"button"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
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
utils.TemplateCall.appendWithPadding(classattrs,"row card card-body carddims");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group ");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.Notification> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.Notification>)getTemplatecalls().get("for11197204160"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.Notification> expr0=notifications_;
java.util.ArrayList<webdsl.generated.domain.Notification> list1=new java.util.ArrayList<webdsl.generated.domain.Notification>(expr0);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for11197204160"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.Notification notification_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(notification_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)notification_;
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
utils.TemplateCall.appendWithPadding(classattrs,"row list-group-item");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
Boolean if2=null;
if(RENDER_PHASE==phase||(if2=(Boolean)getTemplatecalls().get("if11197204161"+forelementid))==null){
if2=org.webdsl.tools.Utils.instanceOf(notification_,"BandInvitation");
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if11197204161"+forelementid,if2);
}
}
if(if2){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall11197204160","NotificationContentBandInvitation",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.domain.BandInvitation._static_cast_(notification_)},"NotificationContentBandInvitation"),new org.webdsl.lang.Environment(env).putWithcall("elements#NotificationContentBandInvitation",utils.TemplateCall.EmptyElementsCall),"NotificationContentBandInvitation",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"NotificationContentBandInvitation(( notification as BandInvitation )) at dashboard.app:225/23");
}
}
else {
Boolean if1=null;
if(RENDER_PHASE==phase||(if1=(Boolean)getTemplatecalls().get("if11197204162"+forelementid))==null){
if1=org.webdsl.tools.Utils.instanceOf(notification_,"SetListInvitation");
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if11197204162"+forelementid,if1);
}
}
if(if1){
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall11197204162","NotificationContentSetListInvitation",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{webdsl.generated.domain.SetListInvitation._static_cast_(notification_)},"NotificationContentSetListInvitation"),new org.webdsl.lang.Environment(env).putWithcall("elements#NotificationContentSetListInvitation",utils.TemplateCall.EmptyElementsCall),"NotificationContentSetListInvitation",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"NotificationContentSetListInvitation(( notification as SetListInvitation )) at dashboard.app:229/23");
}
}
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
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
}
}
