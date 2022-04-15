package webdsl.generated.functions;
@SuppressWarnings("all")public class SetListsPlaceholder_listCompr0User_{
public static java.util.List<webdsl.generated.domain.SetList> SetListsPlaceholder_listCompr0User_(webdsl.generated.domain.User u_){
java.util.List<webdsl.generated.domain.SetList> res_=new java.util.ArrayList<webdsl.generated.domain.SetList>();
res_=new java.util.ArrayList<webdsl.generated.domain.SetList>();
java.util.List<webdsl.generated.domain.SetList> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from SetList").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.SetList> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.SetList> lst0=new java.util.ArrayList<webdsl.generated.domain.SetList>(exp0);
java.util.ArrayList<webdsl.generated.domain.SetList> filtered0=new java.util.ArrayList<webdsl.generated.domain.SetList>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.SetList setlist_:lst0){
i0++;
if(!org.webdsl.tools.Utils.equal(setlist_.getMembers(),null)&&setlist_.getMembers().contains(u_)){
filtered0.add(setlist_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.SetList setlist_:lst0){
i1++;
res_.add(setlist_);
}
}
else {}
return res_;
}
}
