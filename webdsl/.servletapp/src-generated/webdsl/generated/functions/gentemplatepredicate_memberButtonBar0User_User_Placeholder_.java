package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_memberButtonBar0User_User_Placeholder_{
public static Boolean gentemplatepredicate_memberButtonBar0User_User_Placeholder_(webdsl.generated.domain.User editor_,webdsl.generated.domain.User user_,String ph_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
