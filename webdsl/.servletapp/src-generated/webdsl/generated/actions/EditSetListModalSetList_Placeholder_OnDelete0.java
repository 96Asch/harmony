package webdsl.generated.actions;
public class EditSetListModalSetList_Placeholder_OnDelete0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String p_arg,final webdsl.generated.domain.SetList sl_arg,final String cPh_arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String p_=null;
p_=p_arg;
webdsl.generated.domain.SetList sl_=null;
sl_=sl_arg;
String cPh_=null;
cPh_=cPh_arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactioncombined_OnDelete0SetList_Placeholder_Placeholder_SetList_.genactioncombined_OnDelete0SetList_Placeholder_Placeholder_SetList_(setlist_,cPh_,p_,sl_)){
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
