package webdsl.generated.actions;
public class ConfirmRemoveModalString_OnClear0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.List<webdsl.generated.domain.Notification> list1=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.Notification.class).list();
java.util.ArrayList<webdsl.generated.domain.Notification> filtered0=new java.util.ArrayList<webdsl.generated.domain.Notification>(list1.size());
int i0=-1;
for(webdsl.generated.domain.Notification noti_:list1){
i0++;
if(org.webdsl.tools.Utils.equal(noti_.getReceiver(),((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal())){
filtered0.add(noti_);
}
}
list1=filtered0;
int i1=-1;
for(webdsl.generated.domain.Notification noti_:list1){
i1++;
noti_.delete();
}
}
}
);
}
}
