package webdsl.generated.actions;
public class LiveSetList_toSong0 extends utils.TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final utils.AbstractPageServlet threadLocalPageCached,final org.webdsl.lang.Environment env,final String elementsContext,final Integer pageIndex_arg,final String ph_arg,final webdsl.generated.domain.SetList setlist_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new utils.TemplateActionBody(){
public void run(){
Integer pageIndex_=null;
pageIndex_=pageIndex_arg;
String ph_=null;
ph_=ph_arg;
webdsl.generated.domain.SetList setlist_=null;
setlist_=setlist_arg;
if(webdsl.generated.functions.genactionpredicate_Live__0SetList_.genactionpredicate_Live__0SetList_(setlist_)){
org.webdsl.logging.Logger.info(pageIndex_);
pageIndex_=pageIndex_+1;
org.webdsl.logging.Logger.info(pageIndex_);
if(!(org.webdsl.tools.Utils.equal(pageIndex_,null)||org.webdsl.tools.Utils.equal(setlist_.getSongs().size(),null))&&pageIndex_>=setlist_.getSongs().size()){
pageIndex_=0;
org.webdsl.logging.Logger.info("higher");
}
else {}
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
java.io.StringWriter s0=new java.io.StringWriter();
java.io.PrintWriter out0=new java.io.PrintWriter(s0);
utils.ThreadLocalOut.push(out0);
Object[] args0=new Object[]{(webdsl.generated.domain.Song)setlist_.getSongs().get(pageIndex_)};
try{
((utils.PageServlet)utils.DispatchServletHelper.pages.get("SongViewerSong").getPageClass().newInstance()).serveAsAjaxResponse(args0,utils.TemplateCall.None,utils.URLFilter.filter(ph_));
}
catch(Exception iae){
org.webdsl.logging.Logger.error("Problem in template servlet template lookup for Ajax: "+iae.getMessage()+" template :"+"SongViewerSong");
}
utils.ThreadLocalOut.popChecked(out0);
utils.ThreadLocalOut.peek().print("{ \"action\": \""+"replace"+"\", \"id\": \""+utils.URLFilter.filter(ph_)+"\", \"value\" : \""+org.apache.commons.lang3.StringEscapeUtils.escapeJava(s0.toString())+"\"},");
utils.ThreadLocalPage.get().actionHasAjaxPageUpdates=true;
if(!utils.ThreadLocalPage.get().isAjaxActionExecuted()){
utils.Warning.warn("Ajax operation does not work in a regular submit, add [ajax] to the submit link.");
}
utils.ThreadLocalOut.peek().print("{ \"action\": \"runscript\", \"value\": \""+"initRendering()".replace("\\","\\\\").replace("\"","\\\"")+"\" },\n");
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
