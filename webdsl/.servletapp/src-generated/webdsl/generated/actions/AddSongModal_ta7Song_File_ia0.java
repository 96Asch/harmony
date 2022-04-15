package webdsl.generated.actions;
public class AddSongModal_ta7Song_File_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final utils.RefArg choFile__,final utils.RefArg song__,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
((webdsl.generated.domain.Song)song__.get()).setChordRaw(((utils.File)choFile__.get()).getContentAsString());
}
}
);
}
}
