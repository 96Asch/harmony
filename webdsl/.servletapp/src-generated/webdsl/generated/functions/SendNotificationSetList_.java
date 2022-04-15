package webdsl.generated.functions;
@SuppressWarnings("all")public class SendNotificationSetList_{
public static void SendNotificationSetList_(webdsl.generated.domain.SetList sl_){
java.util.Collection<? extends webdsl.generated.domain.User> exp0=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getUsers();
java.util.ArrayList<webdsl.generated.domain.User> lst0=new java.util.ArrayList<webdsl.generated.domain.User>(exp0);
java.util.ArrayList<webdsl.generated.domain.User> filtered0=new java.util.ArrayList<webdsl.generated.domain.User>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.User user_:lst0){
i0++;
if(!org.webdsl.tools.Utils.equal(user_,((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())){
filtered0.add(user_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.User user_:lst0){
i1++;
if(!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins().contains(user_)){
webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_createEmpty_().Notification$this_()).SetListInvitation$this_().setFrom(sl_.getOwner())).setTo(user_)).setType((webdsl.generated.domain.NotificationType)utils.ThreadLocalPage.getEnv().getGlobalVariable("invitation"))).setMessage("You have been invited to join a setlist")).setDateSent(utils.DateType.today())).setToJoin(sl_).setIsAdmin(true).save("SetListInvitation");
}
else {
webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_createEmpty_().Notification$this_()).SetListInvitation$this_().setFrom(sl_.getOwner())).setTo(user_)).setType((webdsl.generated.domain.NotificationType)utils.ThreadLocalPage.getEnv().getGlobalVariable("invitation"))).setMessage("You have been invited to join a setlist")).setDateSent(utils.DateType.today())).setToJoin(sl_).setIsAdmin(false).save("SetListInvitation");
}
}
}
}
