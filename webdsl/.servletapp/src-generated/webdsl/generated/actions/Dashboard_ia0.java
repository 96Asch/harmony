package webdsl.generated.actions;
public class Dashboard_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
if(webdsl.generated.functions.genactionpredicate_Dashboard__0_.genactionpredicate_Dashboard__0_()){
webdsl.generated.functions.logout_.logout_();
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl(""));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
