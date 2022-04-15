package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_{
public static Boolean genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_(java.util.Set<webdsl.generated.domain.User> genuniquevar15_,webdsl.generated.domain.Song genuniquevar16_,String genuniquevar17_){
return !org.webdsl.tools.Utils.equal(genuniquevar15_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar15_,null)&&genuniquevar15_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
