package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songSearchString_Placeholder_Bool_Bool_Template extends utils.TemplateServlet{
public void prefetchFor_13297138180(java.util.List<webdsl.generated.domain.Song> list,boolean early){
if(early){}
else {}
}
public void prefetchFor_13297138181(java.util.List<webdsl.generated.domain.Song> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.songSearchString_Placeholder_Bool_Bool_s_ad0String_String_Placeholder_Bool_Bool_Song_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(songSearchString_Placeholder_Bool_Bool_s_ad0String_String_Placeholder_Bool_Bool_Song_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songSearchString_Placeholder_Bool_Bool":keyOverwrite,songSearchString_Placeholder_Bool_Bool_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songSearchString_Placeholder_Bool_Bool_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
query_=(String)args[0];
ph_=(String)args[1];
searchPublic_=(Boolean)args[2];
multipleAllowed_=(Boolean)args[3];
}
public String getUniqueName(){
return "songSearchString_Placeholder_Bool_Bool";
}
public String getTemplateSignature(){
return "ajaxtemplate songSearch(query : String, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "songSearchString_Placeholder_Bool_Bool";
}
else {
return calledName;
}
}
private String query_="";
private String ph_="";
private Boolean searchPublic_=false;
private Boolean multipleAllowed_=false;
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
utils.TemplateCall.appendWithPadding(classattrs,"row");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm col-md-4");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18061877762","songSearchInputSUserS_String_Placeholder_Bool_Bool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),query_,ph_,searchPublic_,multipleAllowed_},"songSearchInputSUserS_String_Placeholder_Bool_Bool"),new org.webdsl.lang.Environment(env).putWithcall("elements#songSearchInputSUserS_String_Placeholder_Bool_Bool",utils.TemplateCall.EmptyElementsCall),"songSearchInputSUserS_String_Placeholder_Bool_Bool",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"songSearchInputSUserS_String_Placeholder_Bool_Bool(session.tempFormData.admins, query, ph, searchPublic, multipleAllowed) at songsearch.app:52/8");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if_18061877760"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(query_,"");
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if_18061877760"+forelementid,if0);
}
}
if(if0){
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group carddims overflow-400");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.Song> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.Song>)getTemplatecalls().get("for_18061877760"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.Song> expr0=webdsl.generated.domain.Song._static_searchSong_(query_+"*",5);
java.util.ArrayList<webdsl.generated.domain.Song> list1=new java.util.ArrayList<webdsl.generated.domain.Song>(expr0);
prefetchFor_13297138180(list1,true);
java.util.ArrayList<webdsl.generated.domain.Song> filtered0=new java.util.ArrayList<webdsl.generated.domain.Song>(list1.size());
int i0=-1;
for(webdsl.generated.domain.Song song_:list1){
i0++;
if(webdsl.generated.functions.filterQuerySong_Bool_Bool_.filterQuerySong_Bool_Bool_(song_,searchPublic_,multipleAllowed_)){
filtered0.add(song_);
}
}
list1=filtered0;
prefetchFor_13297138180(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_18061877760"+forelementid,forcol0);
}
}
int i1=-1;
for(webdsl.generated.domain.Song song_:forcol0){
i1++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(song_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)song_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18061877764","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"songSearchString_Placeholder_Bool_Bool_AddSong1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("songSearchString_Placeholder_Bool_Bool_s_ad0String_String_Placeholder_Bool_Bool_Song",getElementsContext(),new Object[]{query_,ph_,searchPublic_,multipleAllowed_,song_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"songSearchString_Placeholder_Bool_Bool_AddSong1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
utils.TemplateCall.appendWithPadding(classattrs,"col-sm col-md");
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
utils.TemplateCall.appendWithPadding(classattrs,"searchheader p-2 fw-bold");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Songs: ",out,threadLocalPageCached.isRawoutput());
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group card card-body carddims overflow-400");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid1=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.Song> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.Song>)getTemplatecalls().get("for_18061877761"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.Song> expr1=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs();
java.util.ArrayList<webdsl.generated.domain.Song> list2=new java.util.ArrayList<webdsl.generated.domain.Song>(expr1);
prefetchFor_13297138181(list2,true);
prefetchFor_13297138181(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_18061877761"+forelementid,forcol1);
}
}
int i2=-1;
for(webdsl.generated.domain.Song song_:forcol1){
i2++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(song_)){
org.webdsl.WebDSLEntity temp1=(org.webdsl.WebDSLEntity)(Object)song_;
forelementid=temp1.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp1.getId());
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group-item");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18061877767","SongCardSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_},"SongCardSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#SongCardSong",utils.TemplateCall.EmptyElementsCall),"SongCardSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"SongCardSong(song) at songsearch.app:78/14");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_18061877769","songButtonBarSUserS_Song_Placeholder_Bool_Bool",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),song_,ph_,searchPublic_,multipleAllowed_},"songButtonBarSUserS_Song_Placeholder_Bool_Bool"),new org.webdsl.lang.Environment(env).putWithcall("elements#songButtonBarSUserS_Song_Placeholder_Bool_Bool",utils.TemplateCall.EmptyElementsCall),"songButtonBarSUserS_Song_Placeholder_Bool_Bool",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"songButtonBarSUserS_Song_Placeholder_Bool_Bool(session.tempFormData.admins, song, ph, searchPublic, multipleAllowed) at songsearch.app:79/14");
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid1;
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
