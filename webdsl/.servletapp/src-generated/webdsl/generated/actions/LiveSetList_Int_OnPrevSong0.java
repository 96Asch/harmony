package webdsl.generated.actions;
public class LiveSetList_Int_OnPrevSong0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final Integer pageIndex_arg,final Integer index_arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
Integer pageIndex_=null;
pageIndex_=pageIndex_arg;
Integer index_=null;
index_=index_arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactionpredicate_Live__0SetList_Int_.genactionpredicate_Live__0SetList_Int_(setlist_,index_)){
pageIndex_=pageIndex_-1;
if(!(org.webdsl.tools.Utils.equal(pageIndex_,null)||org.webdsl.tools.Utils.equal(0,null))&&pageIndex_<0){
pageIndex_=setlist_.getSongs().size()-1;
}
else {}
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Live",utils.CollectionType.addAll(new java.util.ArrayList<String>(2),utils.URLFilter.filter(setlist_.getNaturalId()),utils.URLFilter.filter(pageIndex_)),"SetList","Int"));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
