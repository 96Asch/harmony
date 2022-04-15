package webdsl.generated.actions;
public class ConfirmRemoveSongModalString_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.Collection<? extends webdsl.generated.domain.Song> exp0=((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs();
java.util.ArrayList<webdsl.generated.domain.Song> lst0=new java.util.ArrayList<webdsl.generated.domain.Song>(exp0);
int i2=-1;
for(webdsl.generated.domain.Song song_:lst0){
i2++;
java.util.List<webdsl.generated.domain.SetList> list1=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.SetList.class).list();
java.util.ArrayList<webdsl.generated.domain.SetList> filtered0=new java.util.ArrayList<webdsl.generated.domain.SetList>(list1.size());
int i0=-1;
for(webdsl.generated.domain.SetList sl_:list1){
i0++;
if(!org.webdsl.tools.Utils.equal(sl_.getSongs(),null)&&sl_.getSongs().contains(song_)){
filtered0.add(sl_);
}
}
list1=filtered0;
int i1=-1;
for(webdsl.generated.domain.SetList sl_:list1){
i1++;
while(!org.webdsl.tools.Utils.equal(sl_.getSongs(),null)&&sl_.getSongs().contains(song_)){
{
sl_.removeFromSongs(song_);
}
}
}
while(!org.webdsl.tools.Utils.equal(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs(),null)&&((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs().contains(song_)){
{
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromSongs(song_);
}
}
song_.delete();
}
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("Dashboard"));
}
}
);
}
}
