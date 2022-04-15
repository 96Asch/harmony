package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_Live__0SetList_{
public static Boolean genactionpredicate_Live__0SetList_(webdsl.generated.domain.SetList genuniquevar0_){
return !org.webdsl.tools.Utils.equal(genuniquevar0_,null)&&!org.webdsl.tools.Utils.equal(genuniquevar0_.getMembers().indexOf(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()),-1);
}
}
