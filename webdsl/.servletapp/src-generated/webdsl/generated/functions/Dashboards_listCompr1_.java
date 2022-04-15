package webdsl.generated.functions;
@SuppressWarnings("all")public class Dashboards_listCompr1_{
public static java.util.List<webdsl.generated.domain.Song> Dashboards_listCompr1_(){
java.util.List<webdsl.generated.domain.Song> res_=new java.util.ArrayList<webdsl.generated.domain.Song>();
res_=new java.util.ArrayList<webdsl.generated.domain.Song>();
java.util.List<webdsl.generated.domain.Song> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from Song").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.Song> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.Song> lst0=new java.util.ArrayList<webdsl.generated.domain.Song>(exp0);
java.util.ArrayList<webdsl.generated.domain.Song> filtered0=new java.util.ArrayList<webdsl.generated.domain.Song>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.Song song_:lst0){
i0++;
if(org.webdsl.tools.Utils.equal(song_.getOwner(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())){
filtered0.add(song_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.Song song_:lst0){
i1++;
res_.add(song_);
}
}
else {}
return res_;
}
}
