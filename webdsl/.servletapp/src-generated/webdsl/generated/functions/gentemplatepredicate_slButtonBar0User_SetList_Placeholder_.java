package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_slButtonBar0User_SetList_Placeholder_{
public static Boolean gentemplatepredicate_slButtonBar0User_SetList_Placeholder_(webdsl.generated.domain.User editor_,webdsl.generated.domain.SetList setlist_,String ph_){
return org.webdsl.tools.Utils.equal(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal(),editor_);
}
}
