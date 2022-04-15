package webdsl.generated.actions;
public class EditSongModalSong_OnSongSave0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song s_arg,final webdsl.generated.domain.Song song_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song s_=null;
s_=s_arg;
webdsl.generated.domain.Song song_=null;
song_=song_arg;
if(webdsl.generated.functions.genactionpredicate_EditSongModal__0Song_.genactionpredicate_EditSongModal__0Song_(song_)){
if(!(!org.webdsl.tools.Utils.equal(s_,null)&&!org.webdsl.tools.Utils.equal(s_.getRefTrack(),null))){
throw new utils.ValidationException(null,"You must upload a reference track");
}
if(!(!org.webdsl.tools.Utils.equal(s_,null)&&webdsl.generated.functions.hasExtensionString_LStringL_.hasExtensionString_LStringL_(s_.getRefTrack().getFileName(),webdsl.generated.functions.EditSongModalSong_typedlistCr0_.EditSongModalSong_typedlistCr0_()))){
throw new utils.ValidationException(null,"Reference Track must be in mp3 format");
}
s_.save("Song");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
