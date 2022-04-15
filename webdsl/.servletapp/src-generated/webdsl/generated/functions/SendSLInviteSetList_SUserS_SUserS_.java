package webdsl.generated.functions;
@SuppressWarnings("all")public class SendSLInviteSetList_SUserS_SUserS_{
public static void SendSLInviteSetList_SUserS_SUserS_(webdsl.generated.domain.SetList sl_,java.util.Set<webdsl.generated.domain.User> pendingMembers_,java.util.Set<webdsl.generated.domain.User> pendingAdmins_){
java.util.Collection<? extends webdsl.generated.domain.User> exp0=pendingMembers_;
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
sl_.addToPending(user_);
webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_cast_(webdsl.generated.domain.SetListInvitation._static_createEmpty_().Notification$this_()).SetListInvitation$this_().setSender(sl_.getOwner())).setReceiver(user_)).setType((webdsl.generated.domain.NotificationType)utils.ThreadLocalPage.getEnv().getGlobalVariable("invitation"))).setMessage(sl_.getDescription())).setDateSent(utils.DateType.today())).setToJoin(sl_).setIsAdmin(!org.webdsl.tools.Utils.equal(pendingAdmins_,null)&&pendingAdmins_.contains(user_)).save("SetListInvitation");
}
}
}
