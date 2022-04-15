package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class userSearchUser_String_SUserS_Placeholder_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==1){
java.util.ArrayList<webdsl.generated.domain.User> elems0=new java.util.ArrayList<webdsl.generated.domain.User>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("User")){
elems0.add((webdsl.generated.domain.User)ent);
}
}
}
}
}
public void prefetchFor5546821660(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public void prefetchFor5546821661(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public void prefetchFor5546821662(java.util.List<webdsl.generated.domain.User> list,boolean early){
if(early){}
else {}
}
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
utils.AbstractPageServlet.loadTemplateMap(webdsl.generated.templates.userSearchUser_String_SUserS_Placeholder_s_ad0String_User_String_SUserS_Placeholder_User_Template.class,null,staticEnv);
}
public static void loadRefArgClasses(java.util.Map<String,Class<?>> refargclasses){
utils.AbstractPageServlet.loadRefArgClasses(userSearchUser_String_SUserS_Placeholder_s_ad0String_User_String_SUserS_Placeholder_User_Template.class);
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"userSearchUser_String_SUserS_Placeholder":keyOverwrite,userSearchUser_String_SUserS_Placeholder_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(userSearchUser_String_SUserS_Placeholder_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
owner_=(webdsl.generated.domain.User)args[0];
query_=(String)args[1];
pending_=(java.util.Set<webdsl.generated.domain.User>)args[2];
ph_=(String)args[3];
}
public String getUniqueName(){
return "userSearchUser_String_SUserS_Placeholder";
}
public String getTemplateSignature(){
return "ajaxtemplate userSearch(owner : User, query : String, pending : {User}, ph : Placeholder)";
}
protected boolean isAjaxTemplate(){
return true;
}
public String getElementsContext(){
if(calledName==null){
return "userSearchUser_String_SUserS_Placeholder";
}
else {
return calledName;
}
}
private webdsl.generated.domain.User owner_=null;
private String query_="";
private java.util.Set<webdsl.generated.domain.User> pending_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
private String ph_="";
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
utils.TemplateCall.appendWithPadding(classattrs,"row mb-2");
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
handleTemplateCall(phase,inForLoop,forelementid,"tcall18320133012","userSearchInputUser_String_SUserS_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{owner_,query_,pending_,ph_},"userSearchInputUser_String_SUserS_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#userSearchInputUser_String_SUserS_Placeholder",utils.TemplateCall.EmptyElementsCall),"userSearchInputUser_String_SUserS_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"userSearchInputUser_String_SUserS_Placeholder(owner, query, pending, ph) at usersearch.app:116/8");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if18320133010"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(query_,"");
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if18320133010"+forelementid,if0);
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group carddims overflow-200");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid0=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex0=0;
java.util.List<webdsl.generated.domain.User> forcol0=null;
if(RENDER_PHASE==phase||(forcol0=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for18320133010"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr0=webdsl.generated.domain.User._static_searchUser_(query_+"*",5);
java.util.ArrayList<webdsl.generated.domain.User> list1=new java.util.ArrayList<webdsl.generated.domain.User>(expr0);
prefetchFor5546821660(list1,true);
prefetchFor5546821660(list1,false);
forcol0=list1;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for18320133010"+forelementid,forcol0);
}
}
int i0=-1;
for(webdsl.generated.domain.User user_:forcol0){
i0++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(user_)){
org.webdsl.WebDSLEntity temp0=(org.webdsl.WebDSLEntity)(Object)user_;
forelementid=temp0.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp0.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall18320133014","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"userSearchUser_String_SUserS_Placeholder_AddUser1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new org.webdsl.lang.Environment(env).putWithcall("s",new utils.TemplateCall("userSearchUser_String_SUserS_Placeholder_s_ad0String_User_String_SUserS_Placeholder_User",getElementsContext(),new Object[]{owner_,query_,pending_,ph_,user_},attrs)),"wrapsubmitString",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"userSearchUser_String_SUserS_Placeholder_AddUser1\" +\ngetTemplate().getUniqueIdNoCache()) at unknown context");
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
utils.TemplateCall.appendWithPadding(classattrs,"bg-secondary p-2");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Members: ",out,threadLocalPageCached.isRawoutput());
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
utils.TemplateCall.appendWithPadding(classattrs,"list-group carddims overflow-200");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
String old_elementid1=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex1=0;
java.util.List<webdsl.generated.domain.User> forcol1=null;
if(RENDER_PHASE==phase||(forcol1=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for18320133011"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr1=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getUsers();
java.util.ArrayList<webdsl.generated.domain.User> list2=new java.util.ArrayList<webdsl.generated.domain.User>(expr1);
prefetchFor5546821661(list2,true);
prefetchFor5546821661(list2,false);
forcol1=list2;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for18320133011"+forelementid,forcol1);
}
}
int i1=-1;
for(webdsl.generated.domain.User user_:forcol1){
i1++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(user_)){
org.webdsl.WebDSLEntity temp1=(org.webdsl.WebDSLEntity)(Object)user_;
forelementid=temp1.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp1.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall18320133017","userCardUser_User_SUserS_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{user_,owner_,pending_,ph_},"userCardUser_User_SUserS_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#userCardUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyElementsCall),"userCardUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"userCardUser_User_SUserS_Placeholder(user, owner, pending, ph) at usersearch.app:146/12");
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
String old_elementid2=forelementid;
inForLoop=true;
forLoopCounter++;
int separatorindex2=0;
java.util.List<webdsl.generated.domain.User> forcol2=null;
if(RENDER_PHASE==phase||(forcol2=(java.util.List<webdsl.generated.domain.User>)getTemplatecalls().get("for18320133012"+forelementid))==null){
java.util.Collection<? extends webdsl.generated.domain.User> expr2=pending_;
java.util.ArrayList<webdsl.generated.domain.User> list3=new java.util.ArrayList<webdsl.generated.domain.User>(expr2);
prefetchFor5546821662(list3,true);
prefetchFor5546821662(list3,false);
forcol2=list3;
if(RENDER_PHASE!=phase){
getTemplatecalls().put("for18320133012"+forelementid,forcol2);
}
}
int i2=-1;
for(webdsl.generated.domain.User user_:forcol2){
i2++;
fallbackcounter+=1;
if(org.webdsl.WebDSLEntity.class.isInstance(user_)){
org.webdsl.WebDSLEntity temp2=(org.webdsl.WebDSLEntity)(Object)user_;
forelementid=temp2.getVersion()==0?Integer.toString(fallbackcounter):utils.UUIDUserType.persistUUIDString(temp2.getId());
}
else forelementid=Integer.toString(fallbackcounter);
threadLocalPageCached.enterTemplateContext(forelementid);
try{
handleTemplateCall(phase,inForLoop,forelementid,"tcall18320133019","userCardUser_User_SUserS_Placeholder",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{user_,owner_,pending_,ph_},"userCardUser_User_SUserS_Placeholder"),new org.webdsl.lang.Environment(env).putWithcall("elements#userCardUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyElementsCall),"userCardUser_User_SUserS_Placeholder",utils.TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"userCardUser_User_SUserS_Placeholder(user, owner, pending, ph) at usersearch.app:150/12");
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
