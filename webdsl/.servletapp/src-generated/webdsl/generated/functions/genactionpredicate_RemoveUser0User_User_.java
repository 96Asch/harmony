package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_RemoveUser0User_User_{
public static Boolean genactionpredicate_RemoveUser0User_User_(webdsl.generated.domain.User editor_,webdsl.generated.domain.User user_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
