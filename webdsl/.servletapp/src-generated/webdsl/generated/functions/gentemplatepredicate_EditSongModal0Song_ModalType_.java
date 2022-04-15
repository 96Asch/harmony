package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_EditSongModal0Song_ModalType_{
public static Boolean gentemplatepredicate_EditSongModal0Song_ModalType_(webdsl.generated.domain.Song song_,webdsl.generated.domain.ModalType type_){
return org.webdsl.tools.Utils.equal(type_,(webdsl.generated.domain.ModalType)utils.ThreadLocalPage.getEnv().getGlobalVariable("edit"))&&(!org.webdsl.tools.Utils.equal(song_,null)&&org.webdsl.tools.Utils.equal(song_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()))||org.webdsl.tools.Utils.equal(type_,(webdsl.generated.domain.ModalType)utils.ThreadLocalPage.getEnv().getGlobalVariable("add"));
}
}
