package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_userSearchInput__0User_String_Placeholder_{
public static Boolean genactionpredicate_userSearchInput__0User_String_Placeholder_(webdsl.generated.domain.User genuniquevar29_,String genuniquevar30_,String genuniquevar31_){
return org.webdsl.tools.Utils.equal(genuniquevar29_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
