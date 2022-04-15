package webdsl.generated.actions;
public class songSearchInputSUserS_String_Placeholder_Bool_OnSearch0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final utils.RefArg newQuery_,final Boolean searchPublic_arg,final String ph_arg,final String query_arg,final java.util.Set<webdsl.generated.domain.User> editors_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
Boolean searchPublic_=null;
searchPublic_=searchPublic_arg;
String ph_=null;
ph_=ph_arg;
String query_=null;
query_=query_arg;
java.util.Set<webdsl.generated.domain.User> editors_=null;
editors_=editors_arg;
if(webdsl.generated.functions.genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_.genactionpredicate_songSearchInput__0SUserS_String_Placeholder_Bool_(editors_,query_,ph_,searchPublic_)){
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s0=new java.io.StringWriter();
java.io.PrintWriter out0=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out0);
Object[] args0=new Object[]{(String)newQuery_.get(),ph_,searchPublic_};
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
