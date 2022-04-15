package webdsl.generated.actions;
public class AddBandModal_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final java.util.Set<webdsl.generated.domain.User> admins__arg,final java.util.Set<webdsl.generated.domain.User> members__arg,final webdsl.generated.domain.Band band__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.Set<webdsl.generated.domain.User> admins__=null;
admins__=admins__arg;
java.util.Set<webdsl.generated.domain.User> members__=null;
members__=members__arg;
webdsl.generated.domain.Band band__=null;
band__=band__arg;
band__.setOwner(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
admins__.add(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
members__.add(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
band__.save("Band");
}
}
);
}
}
