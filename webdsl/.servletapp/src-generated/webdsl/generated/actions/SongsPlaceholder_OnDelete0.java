package webdsl.generated.actions;
public class SongsPlaceholder_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).replaceAllInAdmins(webdsl.generated.functions.SongsPlaceholder_typedsetCr0_.SongsPlaceholder_typedsetCr0_());
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("RemoveSongs"));
}
}
);
}
}
