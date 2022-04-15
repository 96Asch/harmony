package webdsl.generated.functions;
@SuppressWarnings("all")public class genpagepredicate_Live0SetList_Int_{
public static Boolean genpagepredicate_Live0SetList_Int_(webdsl.generated.domain.SetList setlist_,Integer index_){
return !org.webdsl.tools.Utils.equal(setlist_,null)&&(!org.webdsl.tools.Utils.equal(setlist_.getMembers(),null)&&(!org.webdsl.tools.Utils.equal(setlist_.getMembers(),null)&&setlist_.getMembers().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
