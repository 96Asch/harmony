package webdsl.generated.actions;
public class ConfirmRemoveModalString_Song_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song song_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song song_=null;
song_=song_arg;
song_.delete();
}
}
);
}
}
