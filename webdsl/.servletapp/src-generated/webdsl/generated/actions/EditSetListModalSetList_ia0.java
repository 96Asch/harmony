package webdsl.generated.actions;
public class EditSetListModalSetList_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList setlist__arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList setlist__=null;
setlist__=setlist__arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactioncombined_EditSetListModalSetList_ia00SetList_SetList_.genactioncombined_EditSetListModalSetList_ia00SetList_SetList_(setlist_,setlist__)){
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Live",utils.CollectionType.addAll(new java.util.ArrayList<String>(2),utils.URLFilter.filter(setlist__.getNaturalId()),utils.URLFilter.filter(0)),"SetList","Int"));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
