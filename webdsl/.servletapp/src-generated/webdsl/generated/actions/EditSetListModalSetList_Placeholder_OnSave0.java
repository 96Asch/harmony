package webdsl.generated.actions;
public class EditSetListModalSetList_Placeholder_OnSave0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList sl_arg,final java.util.Set<webdsl.generated.domain.User> pendingMembers_arg,final java.util.Set<webdsl.generated.domain.User> nonPendingAdmins_arg,final java.util.Set<webdsl.generated.domain.User> nonPendingMembers_arg,final String cPh_arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList sl_=null;
sl_=sl_arg;
java.util.Set<webdsl.generated.domain.User> pendingMembers_=null;
pendingMembers_=pendingMembers_arg;
java.util.Set<webdsl.generated.domain.User> nonPendingAdmins_=null;
nonPendingAdmins_=nonPendingAdmins_arg;
java.util.Set<webdsl.generated.domain.User> nonPendingMembers_=null;
nonPendingMembers_=nonPendingMembers_arg;
String cPh_=null;
cPh_=cPh_arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactionpredicate_EditSetListModal_OnSave0SetList_Placeholder_SetList_.genactionpredicate_EditSetListModal_OnSave0SetList_Placeholder_SetList_(setlist_,cPh_,sl_)){
sl_.removeAllFromSongs();
sl_.addAllToSongs(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getSongs());
nonPendingAdmins_=webdsl.generated.functions.getNonPendingAdminsSetList_.getNonPendingAdminsSetList_(setlist_);
nonPendingMembers_=webdsl.generated.functions.getNonPendingMembersSetList_.getNonPendingMembersSetList_(setlist_);
pendingMembers_=webdsl.generated.functions.getPendingMembersSetList_.getPendingMembersSetList_(setlist_);
sl_.removeAllFromAdmins();
sl_.addAllToAdmins(nonPendingAdmins_);
sl_.removeAllFromMembers();
sl_.addAllToMembers(nonPendingMembers_);
webdsl.generated.functions.SendSLInviteSetList_SUserS_SUserS_.SendSLInviteSetList_SUserS_SUserS_(sl_,pendingMembers_,((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getAdmins());
sl_.save("SetList");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
