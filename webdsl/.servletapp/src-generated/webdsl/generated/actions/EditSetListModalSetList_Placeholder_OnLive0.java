package webdsl.generated.actions;
public class EditSetListModalSetList_Placeholder_OnLive0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Live",utils.CollectionType.addAll(new java.util.ArrayList<String>(2),utils.URLFilter.filter(setlist_.getNaturalId()),utils.URLFilter.filter(0)),"SetList","Int"));
}
}
);
}
}
