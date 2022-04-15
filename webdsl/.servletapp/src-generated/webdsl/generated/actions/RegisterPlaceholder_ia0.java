package webdsl.generated.actions;
public class RegisterPlaceholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String pass__arg,final String email__arg,final String uname__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String pass__=null;
pass__=pass__arg;
String email__=null;
email__=email__arg;
String uname__=null;
uname__=uname__arg;
webdsl.generated.domain.User._static_createEmpty_().User$this_().setUsername(uname__).setEmail(email__).setPassword(org.webdsl.tools.Utils.secretDigest(pass__)).save("User");
}
}
);
}
}
