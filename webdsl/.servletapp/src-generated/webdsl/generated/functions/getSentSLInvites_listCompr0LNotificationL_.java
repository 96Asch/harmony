package webdsl.generated.functions;
@SuppressWarnings("all")public class getSentSLInvites_listCompr0LNotificationL_{
public static java.util.List<webdsl.generated.domain.SetListInvitation> getSentSLInvites_listCompr0LNotificationL_(java.util.List<webdsl.generated.domain.Notification> invites_){
java.util.List<webdsl.generated.domain.SetListInvitation> res_=new java.util.ArrayList<webdsl.generated.domain.SetListInvitation>();
res_=new java.util.ArrayList<webdsl.generated.domain.SetListInvitation>();
java.util.List<webdsl.generated.domain.Notification> thecollection_=invites_;
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.Notification> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.Notification> lst0=new java.util.ArrayList<webdsl.generated.domain.Notification>(exp0);
java.util.ArrayList<webdsl.generated.domain.Notification> filtered0=new java.util.ArrayList<webdsl.generated.domain.Notification>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.Notification invite_:lst0){
i0++;
if(org.webdsl.tools.Utils.instanceOf(invite_,"SetListInvitation")){
filtered0.add(invite_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.Notification invite_:lst0){
i1++;
res_.add(webdsl.generated.domain.SetListInvitation._static_cast_(invite_));
}
}
else {}
return res_;
}
}
