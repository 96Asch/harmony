package webdsl.generated.actions;
public class SearchableUserListLUserL_ta0LUserL_String_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
utils.ThreadLocalServlet.get().getOutgoingSuccessMessages().add("onInput");
}
}
);
}
}
