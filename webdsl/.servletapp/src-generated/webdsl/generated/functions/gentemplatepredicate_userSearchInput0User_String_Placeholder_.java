package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_userSearchInput0User_String_Placeholder_{
public static Boolean gentemplatepredicate_userSearchInput0User_String_Placeholder_(webdsl.generated.domain.User editor_,String query_,String ph_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
