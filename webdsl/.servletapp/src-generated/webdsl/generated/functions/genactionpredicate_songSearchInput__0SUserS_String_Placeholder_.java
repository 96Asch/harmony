package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_songSearchInput__0SUserS_String_Placeholder_{
public static Boolean genactionpredicate_songSearchInput__0SUserS_String_Placeholder_(java.util.Set<webdsl.generated.domain.User> genuniquevar18_,String genuniquevar19_,String genuniquevar20_){
return !org.webdsl.tools.Utils.equal(genuniquevar18_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar18_,null)&&genuniquevar18_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
