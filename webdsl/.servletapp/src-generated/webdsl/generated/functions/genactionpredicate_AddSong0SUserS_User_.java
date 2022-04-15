package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_AddSong0SUserS_User_{
public static Boolean genactionpredicate_AddSong0SUserS_User_(java.util.Set<webdsl.generated.domain.User> editors_,webdsl.generated.domain.User user_){
return !org.webdsl.tools.Utils.equal(editors_,null)&&(!org.webdsl.tools.Utils.equal(editors_,null)&&editors_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
