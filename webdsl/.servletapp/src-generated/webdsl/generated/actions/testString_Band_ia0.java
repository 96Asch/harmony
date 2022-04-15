package webdsl.generated.actions;
public class testString_Band_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.User u__arg,final String id$test__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.User u__=null;
u__=u__arg;
String id$test__=null;
id$test__=id$test__arg;
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
utils.ThreadLocalOut.peek().print("{ \"action\": \"runscript\", \"value\": \""+("$('"+id$test__+"').click(function(e) { console.log('Clicked name'); $('#userSearchInput').val('"+u__.getUsername()+"')});").replace("\\","\\\\").replace("\"","\\\"")+"\" },\n");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
}
}
);
}
}
