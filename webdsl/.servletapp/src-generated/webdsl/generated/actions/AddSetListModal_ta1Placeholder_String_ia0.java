package webdsl.generated.actions;
public class AddSetListModal_ta1Placeholder_String_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String results__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String results__=null;
results__=results__arg;
webdsl.generated.functions.replaceString_.replaceString_(results__);
}
}
);
}
}
