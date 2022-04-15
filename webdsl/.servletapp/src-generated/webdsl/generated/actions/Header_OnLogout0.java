package webdsl.generated.actions;
public class Header_OnLogout0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.functions.logout_.logout_();
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
}
}
);
}
}
