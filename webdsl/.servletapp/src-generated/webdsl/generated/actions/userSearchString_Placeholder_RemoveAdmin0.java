package webdsl.generated.actions;
public class userSearchString_Placeholder_RemoveAdmin0 extends utils.TemplateAction{
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
if(webdsl.generated.functions.genactionpredicate_RemoveAdmin0User_User_.genactionpredicate_RemoveAdmin0User_User_(editor_,user_)){
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromAdmins(user_);
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s3=new java.io.StringWriter();
java.io.PrintWriter out3=new java.io.PrintWriter(s3);
utils.ThreadLocalOut.push(out3);
Object[] args3=new Object[]{(String)newQuery_.get(),ph_};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("userSearchString_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args3,utils.TemplateCall.None,utils.URLFilter.filter(ph_));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"userSearchString_Placeholder");
}
utils.ThreadLocalOut.popChecked(out3);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph_)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s3.toString())+"\"},");
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