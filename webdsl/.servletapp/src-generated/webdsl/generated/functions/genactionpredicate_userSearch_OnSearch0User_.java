package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_userSearch_OnSearch0User_{
public static Boolean genactionpredicate_userSearch_OnSearch0User_(webdsl.generated.domain.User editor_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
