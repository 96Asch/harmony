package webdsl.generated.actions;
public class LiveSetList_ia1 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactionpredicate_Live__0SetList_.genactionpredicate_Live__0SetList_(setlist_)){
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Dashboard"));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
