package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_slSearchInput0User_String_Placeholder_{
public static Boolean gentemplatepredicate_slSearchInput0User_String_Placeholder_(webdsl.generated.domain.User editor_,String query_,String ph_){
return org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),editor_);
}
}
