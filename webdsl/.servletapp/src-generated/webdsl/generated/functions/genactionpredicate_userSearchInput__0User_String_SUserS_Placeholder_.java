package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_userSearchInput__0User_String_SUserS_Placeholder_{
public static Boolean genactionpredicate_userSearchInput__0User_String_SUserS_Placeholder_(webdsl.generated.domain.User genuniquevar10_,String genuniquevar11_,java.util.Set<webdsl.generated.domain.User> genuniquevar12_,String genuniquevar13_){
return org.webdsl.tools.Utils.equal(genuniquevar10_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
}
}
