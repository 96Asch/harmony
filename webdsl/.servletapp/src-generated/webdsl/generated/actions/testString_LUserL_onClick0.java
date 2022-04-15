package webdsl.generated.actions;
public class testString_LUserL_onClick0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User user_arg,final java.util.List<webdsl.generated.domain.User> userList_arg,final String query_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User user_=null;
user_=user_arg;
java.util.List<webdsl.generated.domain.User> userList_=null;
userList_=userList_arg;
String query_=null;
query_=query_arg;
if(webdsl.generated.functions.genactioncombined_onClick0String_LUserL_User_.genactioncombined_onClick0String_LUserL_User_(query_,userList_,user_)){
userList_.add(user_);
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
