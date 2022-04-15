package webdsl.generated.actions;
public class EditSetListModalSetList_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList sl_arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList sl_=null;
sl_=sl_arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactionpredicate_EditSetListModal_OnDelete0SetList_SetList_.genactionpredicate_EditSetListModal_OnDelete0SetList_SetList_(setlist_,sl_)){
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
sl_.delete();
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
