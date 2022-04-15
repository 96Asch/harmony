package webdsl.generated.actions;
public class EditSongModalSong_OnSongDelete0 extends utils.TemplateAction{
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
s_.delete();
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
