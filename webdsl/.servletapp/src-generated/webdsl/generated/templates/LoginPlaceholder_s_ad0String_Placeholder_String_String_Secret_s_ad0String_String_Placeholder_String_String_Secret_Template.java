package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret":keyOverwrite,LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret_Template.class);
return staticEnv;
}
protected void storeArguments(Object[] args){
LoginPlaceholder_ia05_=(String)args[0];
LoginPlaceholder_ia00_=(String)args[1];
ph_=(String)args[2];
uname_=(utils.RefArg)args[3];
email_=(utils.RefArg)args[4];
pass_=(utils.RefArg)args[5];
}
public String getUniqueName(){
return "LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0String_String_Placeholder_String_String_Secret";
}
public String getTemplateSignature(){
return "template LoginPlaceholder_s_ad0String_Placeholder_String_String_Secret_s_ad0(LoginPlaceholder_ia05 : String, LoginPlaceholder_ia00 : String, ph : Placeholder, uname : ref String, email : ref String, pass : ref Secret)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private String LoginPlaceholder_ia05_="";
private String LoginPlaceholder_ia00_="";
private String ph_="";
private utils.RefArg uname_=null;
private utils.RefArg email_=null;
private utils.RefArg pass_=null;
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
switch(phase){case DATABIND_PHASE:ident=LoginPlaceholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=webdsl.generated.actions.LoginPlaceholder_ia0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=LoginPlaceholder_ia05_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new webdsl.generated.actions.LoginPlaceholder_ia0().run(threadLocalPageCached,getEnv(),getElementsContext(),(String)pass_.get(),(String)email_.get(),(String)uname_.get(),ph_,ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+LoginPlaceholder_ia05_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryArguments("?")+"\",\""+LoginPlaceholder_ia05_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+",\""+threadLocalPageCached.placeholderId+"\"); return false;'");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-primary p-1 m-1");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign up",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
else {
out.print("<button name=\""+LoginPlaceholder_ia05_+"\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"btn btn-primary p-1 m-1");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(" webdsl-submit-select=\"1\"");
out.print(">");
if(RENDER_PHASE==phase){
utils.RenderUtils.printPageString("Sign up",out,threadLocalPageCached.isRawoutput());
}
out.print("</button>");
}
break;}}
}
