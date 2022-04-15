package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSongModal__0Song_{
public static Boolean genactionpredicate_EditSongModal__0Song_(webdsl.generated.domain.Song genuniquevar12_){
return !org.webdsl.tools.Utils.equal(genuniquevar12_,null)&&org.webdsl.tools.Utils.equal(genuniquevar12_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
