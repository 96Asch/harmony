package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class users_Template extends utils.TemplateServlet{
public void prefetchFor1115786320(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public void prefetchFor1115786321(java.util.List<webdsl.generated.domain.Song> list,boolean early){
if(early){}
else {}
}
public void prefetchFor1115786322(java.util.List<webdsl.generated.domain.SetList> list,boolean early){
if(early){}
else {}
}
public void prefetchFor1115786323(java.util.List<webdsl.generated.domain.Song> list,boolean early){
if(early){}
else {}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"users":keyOverwrite,users_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(users_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "users";
}
public String getTemplateSignature(){
return "page users()";
}
public String getElementsContext(){
if(calledName==null){
return "users";
}
else {
return calledName;
}
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for_2189944650"+forelementid))==null){
java.util.List<webdsl.generated.domain.User> list1=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.User.class).list();
prefetchFor1115786320(list1,true);
prefetchFor1115786320(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_2189944650"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User u_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(u_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)u_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2189944650","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getUsername()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(u.username) at harmony.app:189/8");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2189944652","outputEmail",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getEmail()},"outputEmail"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputEmail",utils.TemplateCall.EmptyElementsCall),"outputEmail",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputEmail(u.email) at harmony.app:190/8");
}
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2189944654","outputSecret",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{u_.getPassword()},"outputSecret"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputSecret",utils.TemplateCall.EmptyElementsCall),"outputSecret",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputSecret(u.password) at harmony.app:191/8");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid1=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.Song> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.Song>)getTemplatecalls().get("for_2189944651"+forelementid))==null){
java.util.List<webdsl.generated.domain.Song> list2=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.Song.class).list();
prefetchFor1115786321(list2,true);
prefetchFor1115786321(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_2189944651"+forelementid,forcol1);
}
}
int i1=-1;
for(webdsl.generated.domain.Song s_:forcol1){
i1++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(s_)){
org.webdsl.WebDSLEntity temp1=(org.webdsl.WebDSLEntity)(Object)s_;
forelementid=temp1.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp1.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2189944656","printSongSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{s_},"printSongSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#printSongSong",utils.TemplateCall.EmptyElementsCall),"printSongSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"printSongSong(s) at harmony.app:199/10");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid3=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex3=0;
java.util.List<webdsl.generated.domain.SetList> forcol3=null;
if(RENDER_PHASE==phase||(forcol3=(java.util.List<webdsl.generated.domain.SetList>)getTemplatecalls().get("for_2189944652"+forelementid))==null){
java.util.List<webdsl.generated.domain.SetList> list4=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.SetList.class).list();
prefetchFor1115786322(list4,true);
prefetchFor1115786322(list4,false);
forcol3=list4;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_2189944652"+forelementid,forcol3);
}
}
int i3=-1;
for(webdsl.generated.domain.SetList s_:forcol3){
i3++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(s_)){
org.webdsl.WebDSLEntity temp3=(org.webdsl.WebDSLEntity)(Object)s_;
forelementid=temp3.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp3.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
if(RENDER_PHASE==phase){
out.print("<"+"h3");
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
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_2189944658","outputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{s_.getTitle()},"outputString"),new org.webdsl.lang.Environment(env).putWithcall("elements#outputString",utils.TemplateCall.EmptyElementsCall),"outputString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"outputString(s.title) at harmony.app:208/14");
}
if(RENDER_PHASE==phase){
out.print("</"+"h3"+">");
}
String old_elementid2=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex2=0;
java.util.List<webdsl.generated.domain.Song> forcol2=null;
if(RENDER_PHASE==phase||(forcol2=(java.util.List<webdsl.generated.domain.Song>)getTemplatecalls().get("for_2189944653"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.Song> expr0=s_.getSongs();
java.util.ArrayList<webdsl.generated.domain.Song> list3=new java.util.ArrayList<webdsl.generated.domain.Song>(expr0);
prefetchFor1115786323(list3,true);
prefetchFor1115786323(list3,false);
forcol2=list3;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for_2189944653"+forelementid,forcol2);
}
}
int i2=-1;
for(webdsl.generated.domain.Song song_:forcol2){
i2++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(song_)){
org.webdsl.WebDSLEntity temp2=(org.webdsl.WebDSLEntity)(Object)song_;
forelementid=temp2.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp2.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall_21899446510","printSongSong",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{song_},"printSongSong"),new org.webdsl.lang.Environment(env).putWithcall("elements#printSongSong",utils.TemplateCall.EmptyElementsCall),"printSongSong",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"printSongSong(song) at harmony.app:211/11");
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid2;
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementid="0";
fallbackcounter=0;
}
threadLocalPageCached.leaveTemplateContext();
}
forelementid=old_elementid3;
forLoopCounter--;
if(forLoopCounter==0){
inForLoop=false;
forelementid="0";
fallbackcounter=0;
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
java.io.StringWriter sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
utils.ThreadLocalOut.push(out);
boolean succeeded0=false;
try{
if(RENDER_PHASE==phase){
out.print("<a href=\"");
out.print(utils.HTMLFilter.filter(utils.Navigate.constructUrl("")));
out.print("\"");
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
if(!ignorecols.contains("navigate")){
AttributeCollectionLookup.getAttributeCollection("navigate",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign Up",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</a>");
}
succeeded0=true;
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
utils.ThreadLocalOut.popChecked(out);
out=utils.ThreadLocalOut.peek();
if(succeeded0){
out.print(sw0.toString());
}
}
protected void initActions(){
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(webdsl.generated.functions.genpagecombined_users0_.genpagecombined_users0_()){}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
