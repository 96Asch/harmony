package webdsl.generated.actions;
public class userSearchString_Placeholder_AddAdmin0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User editor_arg,final webdsl.generated.domain.User user_arg,final utils.RefArg newQuery_,final String ph_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User editor_=null;
editor_=editor_arg;
webdsl.generated.domain.User user_=null;
user_=user_arg;
String ph_=null;
ph_=ph_arg;
if(webdsl.generated.functions.genactionpredicate_AddAdmin0User_User_.genactionpredicate_AddAdmin0User_User_(editor_,user_)){
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).addToAdmins(user_);
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s2=new java.io.StringWriter();
java.io.PrintWriter out2=new java.io.PrintWriter(s2);
utils.ThreadLocalOut.push(out2);
Object[] args2=new Object[]{(String)newQuery_.get(),ph_};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("userSearchString_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args2,utils.TemplateCall.None,utils.URLFilter.filter(ph_));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"userSearchString_Placeholder");
}
utils.ThreadLocalOut.popChecked(out2);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph_)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s2.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}