package webdsl.generated.actions;
public class EditSongModalSong_ModalType_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song song__arg,final webdsl.generated.domain.ModalType type_arg,final webdsl.generated.domain.Song song_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song song__=null;
song__=song__arg;
webdsl.generated.domain.ModalType type_=null;
type_=type_arg;
webdsl.generated.domain.Song song_=null;
song_=song_arg;
if(webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_ModalType_.genactionpredicate_EditSongModal__0Song_ModalType_(song_,type_)){
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add(song__.getOwner().getUsername());
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
