package webdsl.generated.actions;
public class AddBandModal_ia1 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final webdsl.generated.domain.Band band__arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
webdsl.generated.domain.Band band__=null;
band__=band__arg;
if(!(!org.webdsl.tools.Utils.equal(band__,null)&&(!org.webdsl.tools.Utils.equal(band__.getMembers(),null)&&(!(org.webdsl.tools.Utils.equal(band__.getMembers().size(),null)||org.webdsl.tools.Utils.equal(0,null))&&band__.getMembers().size()>0)))){
throw new utils.ValidationException(null,"members > 0");
}
band__.save("Band");
}
}
);
}
}
