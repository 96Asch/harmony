package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_Live__0SetList_Int_{
public static Boolean genactionpredicate_Live__0SetList_Int_(webdsl.generated.domain.SetList genuniquevar6_,Integer genuniquevar7_){
return !org.webdsl.tools.Utils.equal(genuniquevar6_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar6_.getMembers(),null)&&(!org.webdsl.tools.Utils.equal(genuniquevar6_.getMembers(),null)&&genuniquevar6_.getMembers().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
