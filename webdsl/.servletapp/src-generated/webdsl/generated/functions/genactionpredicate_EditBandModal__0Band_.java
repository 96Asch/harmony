package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_EditBandModal__0Band_{
public static Boolean genactionpredicate_EditBandModal__0Band_(webdsl.generated.domain.Band genuniquevar4_){
return !org.webdsl.tools.Utils.equal(genuniquevar4_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar4_.getAdmins(),null)&&(!org.webdsl.tools.Utils.equal(genuniquevar4_.getAdmins(),null)&&genuniquevar4_.getAdmins().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
