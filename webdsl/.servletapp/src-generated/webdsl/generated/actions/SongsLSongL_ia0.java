package webdsl.generated.actions;
public class SongsLSongL_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song song__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song song__=null;
song__=song__arg;
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add(song__.getTitle());
}
}
);
}
}
