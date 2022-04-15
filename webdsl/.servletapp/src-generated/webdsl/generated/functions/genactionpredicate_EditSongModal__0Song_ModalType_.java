package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSongModal__0Song_ModalType_{
public static Boolean genactionpredicate_EditSongModal__0Song_ModalType_(webdsl.generated.domain.Song genuniquevar0_,webdsl.generated.domain.ModalType genuniquevar1_){
return org.webdsl.tools.Utils.equal(genuniquevar1_,(webdsl.generated.domain.ModalType)utils.ThreadLocalPage.getEnv().getGlobalVariable("edit"))&&(!org.webdsl.tools.Utils.equal(genuniquevar0_,null)&&org.webdsl.tools.Utils.equal(genuniquevar0_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()))||org.webdsl.tools.Utils.equal(genuniquevar1_,(webdsl.generated.domain.ModalType)utils.ThreadLocalPage.getEnv().getGlobalVariable("add"));
}
}
