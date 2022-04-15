package webdsl.generated.functions;
@SuppressWarnings("all")public class AddSetListModal_listCompr0_{
public static java.util.List<webdsl.generated.domain.User> AddSetListModal_listCompr0_(){
java.util.List<webdsl.generated.domain.User> res_=new java.util.ArrayList<webdsl.generated.domain.User>();
res_=new java.util.ArrayList<webdsl.generated.domain.User>();
java.util.List<webdsl.generated.domain.User> thecollection_=utils.HibernateUtil.getCurrentSession().createQuery("from User").list();
if(!org.webdsl.tools.Utils.equal(thecollection_,null)){
java.util.Collection<? extends webdsl.generated.domain.User> exp0=thecollection_;
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
res_.add(user_);
}
}
else {}
return res_;
}
}
