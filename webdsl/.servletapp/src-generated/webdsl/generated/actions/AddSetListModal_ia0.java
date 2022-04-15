package webdsl.generated.actions;
public class AddSetListModal_ia0 extends utils.TemplateAction{
private static String c$29(webdsl.generated.domain.SetList setlist___){
try{
Object v=setlist___.getMembers();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$30(webdsl.generated.domain.SetList setlist___){
try{
Object v=setlist___.getMembers().size();
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.SetList setlist__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.SetList setlist__=null;
setlist__=setlist__arg;
setlist__.setOwner(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
setlist__.addToAdmins(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
setlist__.replaceAllInMembers(((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).getUsers());
setlist__.addToMembers(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
setlist__.save("SetList");
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add(""+"Length: "+c$29(setlist__)+" "+c$30(setlist__));
}
}
);
}
}
