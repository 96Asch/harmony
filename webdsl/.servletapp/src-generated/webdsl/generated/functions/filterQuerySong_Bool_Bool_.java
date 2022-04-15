package webdsl.generated.functions;
@SuppressWarnings("all")public class filterQuerySong_Bool_Bool_{
public static Boolean filterQuerySong_Bool_Bool_(webdsl.generated.domain.Song song_,Boolean searchPublic_,Boolean multipleAllowed_){
Boolean ownerIsPrincipal_=org.webdsl.tools.Utils.equal(song_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
Boolean publicCanBeSearched_=searchPublic_&&song_.getPublic();
Boolean shouldBeUnique_=multipleAllowed_||!(!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs().contains(song_));
return (ownerIsPrincipal_||publicCanBeSearched_)&&shouldBeUnique_;
}
}
