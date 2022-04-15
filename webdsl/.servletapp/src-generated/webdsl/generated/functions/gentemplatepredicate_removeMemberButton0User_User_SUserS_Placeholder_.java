package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_removeMemberButton0User_User_SUserS_Placeholder_{
public static Boolean gentemplatepredicate_removeMemberButton0User_User_SUserS_Placeholder_(webdsl.generated.domain.User editor_,webdsl.generated.domain.User user_,java.util.Set<webdsl.generated.domain.User> pending_,String ph_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
