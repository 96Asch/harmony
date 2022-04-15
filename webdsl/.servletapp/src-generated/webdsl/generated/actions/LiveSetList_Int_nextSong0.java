package webdsl.generated.actions;
public class LiveSetList_Int_nextSong0 extends utils.TemplateAction{
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
org.webdsl.logging.Logger.info(pageIndex_);
pageIndex_=pageIndex_+1;
org.webdsl.logging.Logger.info(pageIndex_);
if(!(org.webdsl.tools.Utils.equal(pageIndex_,null)||org.webdsl.tools.Utils.equal(setlist_.getSongs().size(),null))&&pageIndex_>=setlist_.getSongs().size()){
pageIndex_=0;
org.webdsl.logging.Logger.info("higher");
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
