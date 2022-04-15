package webdsl.generated.functions;
@SuppressWarnings("all")public class genpagepredicate_Live0SetList_{
public static Boolean genpagepredicate_Live0SetList_(webdsl.generated.domain.SetList setlist_){
return !org.webdsl.tools.Utils.equal(setlist_,null)&&!org.webdsl.tools.Utils.equal(setlist_.getMembers().indexOf(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()),-1);
}
}
