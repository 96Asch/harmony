package webdsl.generated.actions;
public class userSearchString_Placeholder_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final utils.RefArg newQuery__,final String ph__arg,final utils.RefArg newQuery_,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String ph__=null;
ph__=ph__arg;
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s2=new java.io.StringWriter();
java.io.PrintWriter out2=new java.io.PrintWriter(s2);
utils.ThreadLocalOut.push(out2);
Object[] args2=new Object[]{(String)newQuery_.get(),ph__};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("userSearchString_Placeholder").getPageClass().newInstance()).serveAsAjaxResponse(args2,utils.TemplateCall.None,utils.URLFilter.filter(ph__));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"userSearchString_Placeholder");
}
utils.ThreadLocalOut.popChecked(out2);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph__)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s2.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
}
);
}
}
