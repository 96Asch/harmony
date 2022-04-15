package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_ConfirmRemoveModal__0String_SetList_{
public static Boolean genactionpredicate_ConfirmRemoveModal__0String_SetList_(String genuniquevar15_,webdsl.generated.domain.SetList genuniquevar16_){
return !org.webdsl.tools.Utils.equal(genuniquevar16_,null)&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),genuniquevar16_.getOwner());
}
}
