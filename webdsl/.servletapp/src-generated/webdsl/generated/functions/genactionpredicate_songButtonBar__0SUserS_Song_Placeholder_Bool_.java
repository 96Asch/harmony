package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_{
public static Boolean genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_(java.util.Set<webdsl.generated.domain.User> genuniquevar2_,webdsl.generated.domain.Song genuniquevar3_,String genuniquevar4_,Boolean genuniquevar5_){
return !org.webdsl.tools.Utils.equal(genuniquevar2_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar2_,null)&&genuniquevar2_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
