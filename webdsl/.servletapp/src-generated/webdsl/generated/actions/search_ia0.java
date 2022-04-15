package webdsl.generated.actions;
public class search_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final utils.RefArg query__,final String results__arg,final utils.RefArg query_,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
String results__=null;
results__=results__arg;
query_.set((String)query_.get()+"*");
webdsl.generated.functions.replaceString_.replaceString_(results__);
}
}
);
}
}
