package webdsl.generated.actions;
public class SetListsPlaceholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String ph__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String ph__=null;
ph__=ph__arg;
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).replaceAllInUsers(webdsl.generated.functions.SetListsPlaceholder_typedsetCr0_.SetListsPlaceholder_typedsetCr0_());
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).replaceAllInAdmins(webdsl.generated.functions.SetListsPlaceholder_typedsetCr1_.SetListsPlaceholder_typedsetCr1_());
((webdsl.generated.domain.TempFormData)utils.ThreadLocalPage.getEnv().getSessionVariable("tempFormData")).setOwner(((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal());
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s1=new java.io.StringWriter();
java.io.PrintWriter out1=new java.io.PrintWriter(s1);
utils.ThreadLocalOut.push(out1);
Object[] args1=org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("AddSetListModal").getPageClass().newInstance()).serveAsAjaxResponse(args1,utils.TemplateCall.None,utils.URLFilter.filter(ph__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"AddSetListModal");
}
utils.ThreadLocalOut.popChecked(out1);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s1.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
}
);
}
}
