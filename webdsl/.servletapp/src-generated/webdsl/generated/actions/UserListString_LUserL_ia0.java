package webdsl.generated.actions;
public class UserListString_LUserL_ia0 extends utils.TemplateAction{
private static String c$8(webdsl.generated.domain.User user___){
try{
Object v=user___.getUsername();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User user__arg,final java.util.List<webdsl.generated.domain.User> users__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User user__=null;
user__=user__arg;
java.util.List<webdsl.generated.domain.User> users__=null;
users__=users__arg;
if(org.webdsl.tools.Utils.equal(users__.indexOf(user__),-1)){
users__.add(user__);
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add(""+"User "+c$8(user__)+" added");
}
else {}
}
}
);
}
}
