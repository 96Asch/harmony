package webdsl.generated.functions;
@SuppressWarnings("all")public class BandsPlaceholder_listCompr0User_{
public static java.util.List<webdsl.generated.domain.Band> BandsPlaceholder_listCompr0User_(webdsl.generated.domain.User u_){
java.util.List<webdsl.generated.domain.Band> res_=new java.util.ArrayList<webdsl.generated.domain.Band>();
res_=new java.util.ArrayList<webdsl.generated.domain.Band>();
java.util.List<webdsl.generated.domain.Band> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from Band").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.Band> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.Band> lst0=new java.util.ArrayList<webdsl.generated.domain.Band>(exp0);
java.util.ArrayList<webdsl.generated.domain.Band> filtered0=new java.util.ArrayList<webdsl.generated.domain.Band>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.Band band_:lst0){
i0++;
if(!org.webdsl.tools.Utils.equal(band_.getMembers(),null)&&band_.getMembers().contains(u_)){
filtered0.add(band_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.Band band_:lst0){
i1++;
res_.add(band_);
}
}
else {}
return res_;
}
}
