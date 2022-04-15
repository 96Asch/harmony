package webdsl.generated.actions;
public class removeMemberButtonUser_User_SUserS_Placeholder_RemoveUser0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User e_arg,final webdsl.generated.domain.User u_arg,final String ph_arg,final java.util.Set<webdsl.generated.domain.User> pending_arg,final webdsl.generated.domain.User user_arg,final webdsl.generated.domain.User editor_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User e_=null;
e_=e_arg;
webdsl.generated.domain.User u_=null;
u_=u_arg;
String ph_=null;
ph_=ph_arg;
java.util.Set<webdsl.generated.domain.User> pending_=null;
pending_=pending_arg;
webdsl.generated.domain.User user_=null;
user_=user_arg;
webdsl.generated.domain.User editor_=null;
editor_=editor_arg;
if(webdsl.generated.functions.genactionpredicate_removeMemberButton__0User_User_SUserS_Placeholder_.genactionpredicate_removeMemberButton__0User_User_SUserS_Placeholder_(editor_,user_,pending_,ph_)){
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromAdmins(u_);
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromUsers(u_);
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s0=new java.io.StringWriter();
java.io.PrintWriter out0=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out0);
Object[] args0=new Object[]{editor_,"",pending_,ph_};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("userSearchUser_String_SUserS_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args0,utils.TemplateCall.None,utils.URLFilter.filter(ph_));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"userSearchUser_String_SUserS_Placeholder");
}
utils.ThreadLocalOut.popChecked(out0);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph_)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s0.toString())+"\"},");
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
