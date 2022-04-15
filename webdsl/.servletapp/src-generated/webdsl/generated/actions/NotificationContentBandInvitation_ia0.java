package webdsl.generated.actions;
public class NotificationContentBandInvitation_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.BandInvitation bi__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.BandInvitation bi__=null;
bi__=bi__arg;
if(bi__.getIsAdmin()){
bi__.getToJoin().addToAdmins(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
else {}
bi__.getToJoin().addToMembers(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
bi__.getToJoin().save("Band");
bi__.delete();
}
}
);
}
}
