package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_ConfirmRemoveModal0String_SetList_{
public static Boolean gentemplatepredicate_ConfirmRemoveModal0String_SetList_(String modalId_,webdsl.generated.domain.SetList setlist_){
return !org.webdsl.tools.Utils.equal(setlist_,null)&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),setlist_.getOwner());
}
}
