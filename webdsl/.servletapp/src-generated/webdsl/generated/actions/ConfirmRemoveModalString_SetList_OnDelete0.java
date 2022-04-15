package webdsl.generated.actions;
public class ConfirmRemoveModalString_SetList_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList setlist_arg,final String modalId_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
String modalId_=null;
modalId_=modalId_arg;
if(webdsl.generated.functions.genactionpredicate_ConfirmRemoveModal__0String_SetList_.genactionpredicate_ConfirmRemoveModal__0String_SetList_(modalId_,setlist_)){
setlist_.delete();
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
