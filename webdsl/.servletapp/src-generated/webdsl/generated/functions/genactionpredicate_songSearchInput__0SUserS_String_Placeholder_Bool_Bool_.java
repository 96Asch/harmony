package webdsl.generated.functions;
@SuppressWarnings("all")public class genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_Bool_{
public static Boolean genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_Bool_(java.util.Set<webdsl.generated.domain.User> genuniquevar20_,String genuniquevar21_,String genuniquevar22_,Boolean genuniquevar23_,Boolean genuniquevar24_){
return !org.webdsl.tools.Utils.equal(genuniquevar20_,null)&&(!org.webdsl.tools.Utils.equal(genuniquevar20_,null)&&genuniquevar20_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
