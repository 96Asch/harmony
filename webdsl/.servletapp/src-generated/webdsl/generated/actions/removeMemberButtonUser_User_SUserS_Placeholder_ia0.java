package webdsl.generated.actions;
public class removeMemberButtonUser_User_SUserS_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String ph__arg,final java.util.Set<webdsl.generated.domain.User> pending__arg,final webdsl.generated.domain.User editor__arg,final String ph_arg,final java.util.Set<webdsl.generated.domain.User> pending_arg,final webdsl.generated.domain.User user_arg,final webdsl.generated.domain.User editor_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String ph__=null;
ph__=ph__arg;
java.util.Set<webdsl.generated.domain.User> pending__=null;
pending__=pending__arg;
webdsl.generated.domain.User editor__=null;
editor__=editor__arg;
String ph_=null;
ph_=ph_arg;
java.util.Set<webdsl.generated.domain.User> pending_=null;
pending_=pending_arg;
webdsl.generated.domain.User user_=null;
user_=user_arg;
webdsl.generated.domain.User editor_=null;
editor_=editor_arg;
if(webdsl.generated.functions.genactionpredicate_removeMemberButton__0User_User_SUserS_Placeholder_.genactionpredicate_removeMemberButton__0User_User_SUserS_Placeholder_(editor_,user_,pending_,ph_)){
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s1=new java.io.StringWriter();
java.io.PrintWriter out1=new java.io.PrintWriter(s1);
utils.ThreadLocalOut.push(out1);
Object[] args1=new Object[]{editor__,"",pending__,ph__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("userSearchUser_String_SUserS_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args1,utils.TemplateCall.None,utils.URLFilter.filter(ph__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"userSearchUser_String_SUserS_Placeholder");
}
utils.ThreadLocalOut.popChecked(out1);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s1.toString())+"\"},");
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