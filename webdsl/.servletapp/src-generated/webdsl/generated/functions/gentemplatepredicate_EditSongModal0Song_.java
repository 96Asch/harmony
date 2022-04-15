package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_EditSongModal0Song_{
public static Boolean gentemplatepredicate_EditSongModal0Song_(webdsl.generated.domain.Song song_){
return !org.webdsl.tools.Utils.equal(song_,null)&&org.webdsl.tools.Utils.equal(song_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
