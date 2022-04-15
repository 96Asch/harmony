package webdsl.generated.actions;
public class songButtonBarSUserS_Song_Placeholder_Bool_RemoveSong0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final java.util.Set<webdsl.generated.domain.User> e_arg,final webdsl.generated.domain.Song s_arg,final Boolean searchPublic_arg,final String ph_arg,final webdsl.generated.domain.Song song_arg,final java.util.Set<webdsl.generated.domain.User> editors_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
java.util.Set<webdsl.generated.domain.User> e_=null;
e_=e_arg;
webdsl.generated.domain.Song s_=null;
s_=s_arg;
Boolean searchPublic_=null;
searchPublic_=searchPublic_arg;
String ph_=null;
ph_=ph_arg;
webdsl.generated.domain.Song song_=null;
song_=song_arg;
java.util.Set<webdsl.generated.domain.User> editors_=null;
editors_=editors_arg;
if(webdsl.generated.functions.genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_.genactionpredicate_songButtonBar__0SUserS_Song_Placeholder_Bool_(editors_,song_,ph_,searchPublic_)){
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).removeFromSongs(s_);
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s0=new java.io.StringWriter();
java.io.PrintWriter out0=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out0);
Object[] args0=new Object[]{"",ph_,searchPublic_};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("songSearchString_Placeholder_Bool").getPageClass().newInstance()).serveAsAjaxResponse(args0,utils.TemplateCall.None,utils.URLFilter.filter(ph_));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"songSearchString_Placeholder_Bool");
}
utils.ThreadLocalOut.popChecked(out0);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph_)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s0.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
