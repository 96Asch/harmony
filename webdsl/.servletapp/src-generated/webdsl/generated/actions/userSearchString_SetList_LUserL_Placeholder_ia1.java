package webdsl.generated.actions;
public class userSearchString_SetList_LUserL_Placeholder_ia1 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final java.util.List<webdsl.generated.domain.User> users__arg,final webdsl.generated.domain.SetList setlist__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.List<webdsl.generated.domain.User> users__=null;
users__=users__arg;
webdsl.generated.domain.SetList setlist__=null;
setlist__=setlist__arg;
setlist__.replaceAllInMembers(users__);
setlist__.save("SetList");
}
}
);
}
}
