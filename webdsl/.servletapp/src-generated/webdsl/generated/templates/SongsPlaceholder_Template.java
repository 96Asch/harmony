package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class SongsPlaceholder_Template extends utils.TemplateServlet{
public void prefetchFor3673837100(java.util.List<webdsl.generated.domain.Song> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongsPlaceholder_s_ad1String_Placeholder_String_LSongL_Template.class,null,utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.SongsPlaceholder_s_ad0String_Placeholder_String_LSongL_Template.class,null,staticEnv)));
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(SongsPlaceholder_s_ad0String_Placeholder_String_LSongL_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongsPlaceholder_s_ad1String_Placeholder_String_LSongL_Template.class);
utils.AbstractPageServlet.loadRefArgClasses(SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"SongsPlaceholder":keyOverwrite,SongsPlaceholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(SongsPlaceholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
ph_=(String)args[0];
}
public String getUniqueName(){
return "SongsPlaceholder";
}
public String getTemplateSignature(){
return "template Songs(ph : Placeholder)";
}
public String getElementsContext(){
if(calledName==null){
return "SongsPlaceholder";
}
else {
return calledName;
}
}
private String ph_="";
private String username_;
public String getUsername_(){
return username_;
}
public void setUsername_(String username_){
this.username_=username_;
}
private java.util.List<webdsl.generated.domain.Song> songs_;
public java.util.List<webdsl.generated.domain.Song> getSongs_(){
return songs_;
}
public void setSongs_(java.util.List<webdsl.generated.domain.Song> songs_){
this.songs_=songs_;
}
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
utils.TemplateCall.appendWithPadding(classattrs,"row border rounded cardheader ps-1 pe-1");
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
utils.TemplateCall.appendWithPadding(classattrs,"p-2");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("My Songs",out,threadLocalPageCached.isRawoutput());
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
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall7733578994","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"SongsPlaceholder_OnDelete1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("SongsPlaceholder_s_ad0String_Placeholder_String_LSongL",getElementsContext(),new Object[]{ph_,new webdsl.generated.templates.RefArg_SongsPlaceholder_Template0(SongsPlaceholder_Template.this),new webdsl.generated.templates.RefArg_SongsPlaceholder_Template1(SongsPlaceholder_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"SongsPlaceholder_OnDelete1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall7733578997","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"SongsPlaceholder_OnShowSongAdd1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("SongsPlaceholder_s_ad1String_Placeholder_String_LSongL",getElementsContext(),new Object[]{ph_,new webdsl.generated.templates.RefArg_SongsPlaceholder_Template0(SongsPlaceholder_Template.this),new webdsl.generated.templates.RefArg_SongsPlaceholder_Template1(SongsPlaceholder_Template.this)},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"SongsPlaceholder_OnShowSongAdd1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("id","songCard"));
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
utils.TemplateCall.appendWithPadding(classattrs,"card card-body carddims overflow-500");
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.Song> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.Song>)getTemplatecalls().get("for7733578990"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.Song> expr0=songs_;
java.util.ArrayList<webdsl.generated.domain.Song> list1=new java.util.ArrayList<webdsl.generated.domain.Song>(expr0);
prefetchFor3673837100(list1,true);
prefetchFor3673837100(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for7733578990"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.Song song_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(song_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)song_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall77335789910","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"SongsPlaceholder_OnShowSongEdit1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("SongsPlaceholder_s_ad2String_Placeholder_String_LSongL_Song",getElementsContext(),new Object[]{ph_,new webdsl.generated.templates.RefArg_SongsPlaceholder_Template0(SongsPlaceholder_Template.this),new webdsl.generated.templates.RefArg_SongsPlaceholder_Template1(SongsPlaceholder_Template.this),song_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"SongsPlaceholder_OnShowSongEdit1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
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
protected void initializeLocalVars(){
username_=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getUsername();
songs_=utils.HibernateUtil.getCurrentSession().createQuery("from Song as s where s._owner._username = :param0").setParameter("param0",username_).list();
}
}
