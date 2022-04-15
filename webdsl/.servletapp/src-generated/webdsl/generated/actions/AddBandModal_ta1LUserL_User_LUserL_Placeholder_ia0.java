package webdsl.generated.actions;
public class AddBandModal_ta1LUserL_User_LUserL_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String ph__arg,final utils.RefArg members__,final utils.RefArg user__,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String ph__=null;
ph__=ph__arg;
org.webdsl.logging.Logger.info((webdsl.generated.domain.User)user__.get());
if(org.webdsl.tools.Utils.equal(((java.util.List<webdsl.generated.domain.User>)members__.get()).indexOf((webdsl.generated.domain.User)user__.get()),-1)){
((java.util.List<webdsl.generated.domain.User>)members__.get()).add((webdsl.generated.domain.User)user__.get());
webdsl.generated.functions.replaceString_.replaceString_(ph__);
}
else {}
}
}
);
}
}
