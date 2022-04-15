package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_{
public static Boolean genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_(java.util.Set<webdsl.generated.domain.User> genuniquevar6_,String genuniquevar7_,String genuniquevar8_,Boolean genuniquevar9_){
return !org.webdsl.tools.Utils.equal(genuniquevar6_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar6_,null)&&genuniquevar6_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
