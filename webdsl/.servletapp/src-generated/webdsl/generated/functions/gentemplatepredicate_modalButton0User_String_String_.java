package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_modalButton0User_String_String_{
public static Boolean gentemplatepredicate_modalButton0User_String_String_(webdsl.generated.domain.User editor_,String text_,String modalId_){
return org.webdsl.tools.Utils.equal(editor_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
