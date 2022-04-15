package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSetListModal_OnSave0SetList_Placeholder_SetList_{
public static Boolean genactionpredicate_EditSetListModal_OnSave0SetList_Placeholder_SetList_(webdsl.generated.domain.SetList genuniquevar0_,String genuniquevar1_,webdsl.generated.domain.SetList setList_){
return !org.webdsl.tools.Utils.equal(setList_,null)&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),setList_.getOwner())||!org.webdsl.tools.Utils.equal(setList_,null)&&(!org.webdsl.tools.Utils.equal(setList_.getAdmins(),null)&&(!org.webdsl.tools.Utils.equal(setList_.getAdmins(),null)&&setList_.getAdmins().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
