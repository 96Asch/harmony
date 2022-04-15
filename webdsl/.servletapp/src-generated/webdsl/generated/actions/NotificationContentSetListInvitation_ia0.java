package webdsl.generated.actions;
public class NotificationContentSetListInvitation_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetListInvitation si__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetListInvitation si__=null;
si__=si__arg;
if(si__.getIsAdmin()){
si__.getToJoin().addToAdmins(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
else {}
si__.getToJoin().addToMembers(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
si__.getToJoin().save("SetList");
si__.delete();
}
}
);
}
}
