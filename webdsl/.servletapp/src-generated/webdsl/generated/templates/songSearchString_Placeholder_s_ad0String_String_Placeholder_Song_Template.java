package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class songSearchString_Placeholder_s_ad0String_String_Placeholder_Song_Template extends utils.TemplateServlet{
public void prefetchFor(int i,java.util.Collection<? extends org.webdsl.WebDSLEntity> elems){
if(utils.QueryOptimization.isOptimizationEnabled()){
if(i==4){
java.util.ArrayList<webdsl.generated.domain.Song> elems0=new java.util.ArrayList<webdsl.generated.domain.Song>();
for(org.webdsl.WebDSLEntity ent:elems){
if(ent.instanceOf("Song")){
elems0.add((webdsl.generated.domain.Song)ent);
}
}
}
}
}
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"songSearchString_Placeholder_s_ad0String_String_Placeholder_Song":keyOverwrite,songSearchString_Placeholder_s_ad0String_String_Placeholder_Song_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(songSearchString_Placeholder_s_ad0String_String_Placeholder_Song_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
songSearchString_Placeholder_AddSong10_=(String)args[0];
query_=(String)args[1];
ph_=(String)args[2];
song_=(webdsl.generated.domain.Song)args[3];
}
public String getUniqueName(){
return "songSearchString_Placeholder_s_ad0String_String_Placeholder_Song";
}
public String getTemplateSignature(){
return "template songSearchString_Placeholder_s_ad0(songSearchString_Placeholder_AddSong10 : String, query : String, ph : Placeholder, song : Song)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private static String c$41(webdsl.generated.domain.Song song__){
try{
Object v=song__.getTitle();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$42(webdsl.generated.domain.Song song__){
try{
Object v=song__.getSubtitle();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$43(webdsl.generated.domain.Song song__){
try{
Object v=song__.getTitle();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$44(webdsl.generated.domain.Song song__){
try{
Object v=song__.getSubtitle();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private String songSearchString_Placeholder_AddSong10_="";
private String query_="";
private String ph_="";
private webdsl.generated.domain.Song song_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=songSearchString_Placeholder_AddSong10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.songSearchString_Placeholder_AddSong0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=songSearchString_Placeholder_AddSong10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.songSearchString_Placeholder_AddSong0().run(threadLocalPageCached,getEnv(),getElementsContext(),((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),song_,ph_,ident);
}
break;case RENDER_PHASE:out.print("<button style=\"position: absolute; left: -9999px; width: 1px; height: 1px;\" ");
if(isAjaxSubmitRequired(false)){
out.print("onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+songSearchString_Placeholder_AddSong10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+songSearchString_Placeholder_AddSong10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString(""+c$41(song_)+" - "+c$42(song_),out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if8551018630"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs().contains(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8551018630"+forelementid,if0);
}
}
if(if0){
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
utils.TemplateCall.appendWithPadding(classattrs,"badge rounded-pill bg-info");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Added",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
out.print("</a>");
}
else {
out.print("onclick='javascript:serverInvoke(\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams())+"?__action__link__=1"+threadLocalPageCached.getExtraQueryArguments("&")+"\",\""+songSearchString_Placeholder_AddSong10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this.nextSibling, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'></button>");
out.print("<a submitid=\""+songSearchString_Placeholder_AddSong10_+"\" href=\"javascript:void(0)\" onclick=\"javascript:loadImageElem=this;$(this.previousSibling).click()\"");
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
if(!ignorecols.contains("submitlink")){
AttributeCollectionLookup.getAttributeCollection("submitlink",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString(""+c$43(song_)+" - "+c$44(song_),out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
Boolean if0=null;
if(RENDER_PHASE==phase||(if0=(Boolean)getTemplatecalls().get("if8551018630"+forelementid))==null){
if0=!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs().contains(song_);
if(RENDER_PHASE!=phase){
getTemplatecalls().put("if8551018630"+forelementid,if0);
}
}
if(if0){
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
utils.TemplateCall.appendWithPadding(classattrs,"badge rounded-pill bg-info");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Added",out,threadLocalPageCached.isRawoutput());
}
if(RENDER_PHASE==phase){
out.print("</"+"span"+">");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"div"+">");
}
out.print("</a>");
}
break;}}
}