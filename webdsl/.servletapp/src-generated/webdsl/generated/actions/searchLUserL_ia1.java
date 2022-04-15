package webdsl.generated.actions;
public class searchLUserL_ia1 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User u__arg,final java.util.List<webdsl.generated.domain.User> users__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User u__=null;
u__=u__arg;
java.util.List<webdsl.generated.domain.User> users__=null;
users__=users__arg;
users__.add(u__);
}
}
);
}
}
