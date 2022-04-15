package webdsl.generated.actions;
public class AddBandModal_ta1Band_LUserL_User_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String ph__arg,final utils.RefArg user__,final utils.RefArg band__,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String ph__=null;
ph__=ph__arg;
((webdsl.generated.domain.Band)band__.get()).addToMembers((webdsl.generated.domain.User)user__.get());
webdsl.generated.functions.replaceString_.replaceString_(ph__);
}
}
);
}
}
