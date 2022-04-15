package webdsl.generated.actions;
public class EditBandModalBand_ia0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Band band__arg,final webdsl.generated.domain.Band band_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Band band__=null;
band__=band__arg;
webdsl.generated.domain.Band band_=null;
band_=band_arg;
if(webdsl.generated.functions.genactionpredicate_EditBandModal__0Band_.genactionpredicate_EditBandModal__0Band_(band_)){
band__.save("Band");
}
else {
utils.ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("accessDenied"));
}
}
}
);
}
}
