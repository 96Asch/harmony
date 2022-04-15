package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_Bool_{
public static Boolean gentemplatepredicate_songButtonBar0SUserS_Song_Placeholder_Bool_Bool_(java.util.Set<webdsl.generated.domain.User> editors_,webdsl.generated.domain.Song song_,String ph_,Boolean searchPublic_,Boolean multipleAllowed_){
return !org.webdsl.tools.Utils.equal(editors_,null)&&(!org.webdsl.tools.Utils.equal(editors_,null)&&editors_.contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal()));
}
}
