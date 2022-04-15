package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSetListModal_OnDelete0SetList_SetList_{
public static Boolean genactionpredicate_EditSetListModal_OnDelete0SetList_SetList_(webdsl.generated.domain.SetList genuniquevar1_,webdsl.generated.domain.SetList setList_){
return !org.webdsl.tools.Utils.equal(setList_,null)&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),setList_.getOwner());
}
}
