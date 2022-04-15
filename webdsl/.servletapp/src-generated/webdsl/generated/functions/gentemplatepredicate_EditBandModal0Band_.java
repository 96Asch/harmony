package webdsl.generated.functions;
@SuppressWarnings("all")public class gentemplatepredicate_EditBandModal0Band_{
public static Boolean gentemplatepredicate_EditBandModal0Band_(webdsl.generated.domain.Band band_){
return !org.webdsl.tools.Utils.equal(band_,null)&&(!org.webdsl.tools.Utils.equal(band_.getAdmins(),null)&&(!org.webdsl.tools.Utils.equal(band_.getAdmins(),null)&&band_.getAdmins().contains(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())));
}
}
