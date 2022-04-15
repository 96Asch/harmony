package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_{
public static Boolean gentemplatepredicate_songSearchInput0SUserS_String_Placeholder_(java.util.Set<webdsl.generated.domain.User> editors_,String query_,String ph_){
return !org.webdsl.tools.Utils.equal(editors_,null)&&(!org.webdsl.tools.Utils.equal(editors_,null)&&editors_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
