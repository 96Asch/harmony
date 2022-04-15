package webdsl.generated.actions;
public class LoginPlaceholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final Boolean remember__arg,final String pass__arg,final String uname__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
Boolean remember__=null;
remember__=remember__arg;
String pass__=null;
pass__=pass__arg;
String uname__=null;
uname__=uname__arg;
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setStayLoggedIn(remember__);
if(!webdsl.generated.functions.authenticateString_Secret_.authenticateString_Secret_(uname__,pass__)){
throw new utils.ValidationException(null,"The login credentials are not valid.");
}
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Dashboard"));
}
}
);
}
}
