package webdsl.generated.actions;
public class EditSongModalSong_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song song__arg,final webdsl.generated.domain.Song song_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song song__=null;
song__=song__arg;
webdsl.generated.domain.Song song_=null;
song_=song_arg;
if(webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_.genactionpredicate_EditSongModal__0Song_(song_)){
if(!(!org.webdsl.tools.Utils.equal(song__,null)&&!org.webdsl.tools.Utils.equal(song__.getRefTrack(),null))){
throw new utils.ValidationException(null,"You must upload a reference track");
}
if(!(!org.webdsl.tools.Utils.equal(song__,null)&&webdsl.generated.functions.hasExtensionString_LStringL_.hasExtensionString_LStringL_(song__.getRefTrack().getFileName(),webdsl.generated.functions.EditSongModalSong_typedlistCr0_.EditSongModalSong_typedlistCr0_()))){
throw new utils.ValidationException(null,"Reference Track must be in mp3 format");
}
song__.save("Song");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
