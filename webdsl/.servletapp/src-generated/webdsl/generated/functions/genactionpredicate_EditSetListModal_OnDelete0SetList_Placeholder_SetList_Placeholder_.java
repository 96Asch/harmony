package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditSetListModal_OnDelete0SetList_Placeholder_SetList_Placeholder_{
public static Boolean genactionpredicate_EditSetListModal_OnDelete0SetList_Placeholder_SetList_Placeholder_(webdsl.generated.domain.SetList genuniquevar2_,String genuniquevar3_,webdsl.generated.domain.SetList setList_,String p_){
return !org.webdsl.tools.Utils.equal(setList_,null)&&org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),setList_.getOwner());
}
}
