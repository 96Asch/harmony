package webdsl.generated.actions;
public class ConfirmRemoveSLModalString_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.Collection<? extends webdsl.generated.domain.SetList> exp0=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSetlists();
java.util.ArrayList<webdsl.generated.domain.SetList> lst0=new java.util.ArrayList<webdsl.generated.domain.SetList>(exp0);
int i2=-1;
for(webdsl.generated.domain.SetList sl_:lst0){
i2++;
java.util.List<webdsl.generated.domain.Notification> list1=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.Notification.class).list();
java.util.ArrayList<webdsl.generated.domain.Notification> filtered0=new java.util.ArrayList<webdsl.generated.domain.Notification>(list1.size());
int i0=-1;
for(webdsl.generated.domain.Notification n_:list1){
i0++;
if(org.webdsl.tools.Utils.instanceOf(n_,"SetListInvitation")&&org.webdsl.tools.Utils.equal(webdsl.generated.domain.SetListInvitation._static_cast_(n_).getToJoin(),sl_)){
filtered0.add(n_);
}
}
list1=filtered0;
int i1=-1;
for(webdsl.generated.domain.Notification n_:list1){
i1++;
n_.delete();
}
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromSetlists(sl_);
sl_.delete();
}
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Dashboard"));
}
}
);
}
}
