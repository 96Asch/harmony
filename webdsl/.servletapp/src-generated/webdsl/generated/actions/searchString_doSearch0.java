package webdsl.generated.actions;
public class searchString_doSearch0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String newQuery_arg,final String query_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String newQuery_=null;
newQuery_=newQuery_arg;
String query_=null;
query_=query_arg;
if(webdsl.generated.functions.genactioncombined_doSearch0String_.genactioncombined_doSearch0String_(query_)){
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("search",utils.CollectionType.addAll(new java.util.ArrayList<String>(1),utils.URLFilter.filter(newQuery_)),"String"));
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
