package webdsl.generated.actions;
public class AddSongModal_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Song song__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Song song__=null;
song__=song__arg;
if(!(!org.webdsl.tools.Utils.equal(song__,null)&&webdsl.generated.functions.hasExtensionString_LStringL_.hasExtensionString_LStringL_(song__.getRefTrack().getFileName(),webdsl.generated.functions.AddSongModal_typedlistCr0_.AddSongModal_typedlistCr0_()))){
throw new utils.ValidationException(null,"Reference Track must be in mp3 format");
}
song__.setOwner(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
song__.save("Song");
}
}
);
}
}
