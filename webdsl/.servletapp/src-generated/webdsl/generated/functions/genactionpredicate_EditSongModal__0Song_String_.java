package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSongModal__0Song_String_{
public static Boolean genactionpredicate_EditSongModal__0Song_String_(webdsl.generated.domain.Song genuniquevar0_,String genuniquevar1_){
return !org.webdsl.tools.Utils.equal(genuniquevar0_,null)&&org.webdsl.tools.Utils.equal(genuniquevar0_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
