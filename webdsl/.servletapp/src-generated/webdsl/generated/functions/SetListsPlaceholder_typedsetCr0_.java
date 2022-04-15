package webdsl.generated.functions;
@SuppressWarnings("all")public class SetListsPlaceholder_typedsetCr0_{
public static java.util.Set<webdsl.generated.domain.User> SetListsPlaceholder_typedsetCr0_(){
java.util.Set<webdsl.generated.domain.User> l_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
l_.add(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
return l_;
}
}
