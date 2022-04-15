package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSetListModal_Save0SetList_SetList_{
public static Boolean genactionpredicate_EditSetListModal_Save0SetList_SetList_(webdsl.generated.domain.SetList genuniquevar0_,webdsl.generated.domain.SetList setList_){
return !org.webdsl.tools.Utils.equal(setList_,null)&&(!org.webdsl.tools.Utils.equal(setList_.getAdmins(),null)&&(!org.webdsl.tools.Utils.equal(setList_.getAdmins(),null)&&setList_.getAdmins().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
