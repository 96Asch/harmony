package webdsl.generated.functions;
@SuppressWarnings("all")public class Dashboardd_listCompr0_{
public static java.util.List<webdsl.generated.domain.Notification> Dashboardd_listCompr0_(){
java.util.List<webdsl.generated.domain.Notification> res_=new java.util.ArrayList<webdsl.generated.domain.Notification>();
res_=new java.util.ArrayList<webdsl.generated.domain.Notification>();
java.util.List<webdsl.generated.domain.Notification> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from Notification").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.Notification> exp0=thecollection_;
java.util.ArrayList<webdsl.generated.domain.Notification> lst0=new java.util.ArrayList<webdsl.generated.domain.Notification>(exp0);
java.util.ArrayList<webdsl.generated.domain.Notification> filtered0=new java.util.ArrayList<webdsl.generated.domain.Notification>(lst0.size());
int i0=-1;
for(webdsl.generated.domain.Notification n_:lst0){
i0++;
if(org.webdsl.tools.Utils.equal(n_.getTo(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())){
filtered0.add(n_);
}
}
lst0=filtered0;
int i1=-1;
for(webdsl.generated.domain.Notification n_:lst0){
i1++;
res_.add(n_);
}
}
else {}
return res_;
}
}