package webdsl.generated.functions;
@SuppressWarnings("all")public class AddSetListModal_typedlistCr0_{
public static java.util.List<webdsl.generated.domain.User> AddSetListModal_typedlistCr0_(){
java.util.List<webdsl.generated.domain.User> l_=new java.util.ArrayList<webdsl.generated.domain.User>();
l_.add(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
return l_;
}
}
