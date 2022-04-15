package webdsl.generated.functions;
@SuppressWarnings("all")public class getNonPendingAdmins_listCompr0SetList_{
public static java.util.List<webdsl.generated.domain.User> getNonPendingAdmins_listCompr0SetList_(webdsl.generated.domain.SetList setlist_){
java.util.List<webdsl.generated.domain.User> res_=new java.util.ArrayList<webdsl.generated.domain.User>();
res_=new java.util.ArrayList<webdsl.generated.domain.User>();
java.util.Set<webdsl.generated.domain.User> thecollection_=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.User> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.User> lst0=new java.util.ArrayList<webdsl.generated.domain.User>(exp0);
java.util.ArrayList<webdsl.generated.domain.User> filtered0=new java.util.ArrayList<webdsl.generated.domain.User>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.User user_:lst0){
i0++;
if(!org.webdsl.tools.Utils.equal(setlist_.getMembers(),null)&&setlist_.getMembers().contains(user_)){
filtered0.add(user_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.User user_:lst0){
i1++;
res_.add(user_);
}
}
else {}
return res_;
}
}
