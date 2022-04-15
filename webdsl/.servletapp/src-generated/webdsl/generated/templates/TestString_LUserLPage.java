package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class TestString_LUserLPage extends utils.PageServlet{
public String getPageName(){
return "testString_LUserL";
}
public String getHiddenParams(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenParams(hiddens);
return hiddens.toString();
}
public String getUrlQueryParams(){
java.lang.StringBuilder params=new java.lang.StringBuilder(512);
urlQueryParams(params);
return params.toString();
}
public String getHiddenPostParamsJson(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenPostParamsJson(hiddens);
return hiddens.toString();
}
public void initVarsAndArgs(){
utils.GlobalVariables.initGlobalVars(envGlobalAndSession,utils.HibernateUtil.getCurrentSession());
initialize();
conversion();
loadArguments();
Object[] args=new Object[]{query_,userList_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new testString_LUserL_Template();
}
protected void redirectHttpHttps(){}
protected void addPrincipalToRequestLog(org.webdsl.WebDSLEntity rle){
((webdsl.generated.domain.RequestLogEntry)rle).setPrincipalNoEventsOrValidation(((webdsl.generated.domain.SecurityContext)envGlobalAndSession.getSessionVariable("securityContext")).getPrincipal());
}
protected org.webdsl.WebDSLEntity getRequestLogEntry(){
return ((utils.DispatchServletHelper)utils.ThreadLocalServlet.get()).getRequestLogEntry();
}
protected void addLogSqlToSessionMessages(){
if(this.isLogSqlEnabled()){
if(logSqlCheckAccess()){
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation(utils.HibernateLog.printHibernateLog(this,"action"));
}
else {
((webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation("Access to SQL logs was denied.");
}
}
}
protected void initializeBasics(utils.AbstractPageServlet ps,Object[] args){
initTemplateClass();
this.envGlobalAndSession=ps.envGlobalAndSession;
this.request=ps.getRequest();
this.response=ps.getResponse();
this.parammap=java.util.Collections.<String,String>emptyMap();
this.parammapvalues=java.util.Collections.<String,java.util.List<String>>emptyMap();
this.fileUploads=java.util.Collections.<String,java.util.List<utils.File>>emptyMap();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
utils.ThreadLocalServlet.get().loadSessionManager(utils.HibernateUtil.getCurrentSession());
query_=(String)args[0];
userList_=(java.util.List<webdsl.generated.domain.User>)args[1];
initialize();
}
protected String[] getUsedSessionEntityJoins(){
return null;
}
protected void renderDebugJsVar(java.io.PrintWriter sout){
sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
}
protected boolean isTemplate(){
return true;
}
public String getUniqueName(){
return "testString_LUserL";
}
protected void increaseStatReadOnly(){
renderReadOnly.incrementAndGet();
}
protected void increaseStatReadOnlyFromCache(){
renderReadOnlyFromCache.incrementAndGet();
}
protected void increaseStatUpdate(){
renderWithUpdates.incrementAndGet();
}
protected void increaseStatActionFail(){
actionFailed.incrementAndGet();
}
protected void increaseStatActionReadOnly(){
actionSuccessReadOnly.incrementAndGet();
}
protected void increaseStatActionUpdate(){
actionSuccessWithUpdates.incrementAndGet();
}
public static AtomicInteger renderReadOnly=new AtomicInteger();
public static AtomicInteger renderReadOnlyFromCache=new AtomicInteger();
public static AtomicInteger renderWithUpdates=new AtomicInteger();
public static AtomicInteger actionFailed=new AtomicInteger();
public static AtomicInteger actionSuccessReadOnly=new AtomicInteger();
public static AtomicInteger actionSuccessWithUpdates=new AtomicInteger();
private String query_;
private java.util.List<java.util.UUID> userList__ids;
private java.util.List<webdsl.generated.domain.User> userList_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("query").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(query_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("userList").append("\", \"value\":\"").append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(org.webdsl.tools.Utils.encodeIdList(userList_))).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("query").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(query_.toString()))).append("&");
combinedparams.append("userList").append("=").append(utils.HTMLFilter.filter(org.webdsl.tools.Utils.encodeIdList(userList_))).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("query").append("\" value=\"").append(utils.HTMLFilter.filter(query_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("userList").append("\" value=\"").append(utils.HTMLFilter.filter(org.webdsl.tools.Utils.encodeIdList(userList_))).append("\" />");
}
protected void loadArguments(){
if(query_==null){
query_="";
}
if(userList__ids==null){}
else {
if(userList_==null){
userList_=new java.util.ArrayList<webdsl.generated.domain.User>();
for(java.util.UUID anid:userList__ids){
userList_.add((webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().load(webdsl.generated.domain.User.class,anid));
}
}
}
}
protected void conversion(){
if(parammap.get("query")!=null){
query_=parammap.get("query");
}
if(parammap.get("userList")!=null){
try{
String[] ids=parammap.get("userList").split(",");
userList__ids=new java.util.ArrayList<java.util.UUID>();
for(String anid:ids){
userList__ids.add(java.util.UUID.fromString(anid));
}
}
catch(NumberFormatException nfe){
org.webdsl.logging.Logger.error(nfe.getMessage());
}
}
}
protected void initialize(){
webdsl.generated.domain.SessionManager sesm$securityContext=(webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager();
if(sesm$securityContext.getSecurityContext()==null){
webdsl.generated.domain.SecurityContext ent=webdsl.generated.domain.SecurityContext._static_createEmpty_();
ent.SecurityContext_();
sesm$securityContext.setSecurityContextNoEventsOrValidation(ent);
utils.HibernateUtil.getCurrentSession().save(sesm$securityContext.getSecurityContext());
}
envGlobalAndSession.putSessionVariable("securityContext",sesm$securityContext.getSecurityContext());
webdsl.generated.domain.SessionManager sesm$tempFormData=(webdsl.generated.domain.SessionManager)utils.ThreadLocalServlet.get().getSessionManager();
if(sesm$tempFormData.getTempFormData()==null){
webdsl.generated.domain.TempFormData ent=webdsl.generated.domain.TempFormData._static_createEmpty_();
ent.TempFormData_();
sesm$tempFormData.setTempFormDataNoEventsOrValidation(ent);
utils.HibernateUtil.getCurrentSession().save(sesm$tempFormData.getTempFormData());
}
envGlobalAndSession.putSessionVariable("tempFormData",sesm$tempFormData.getTempFormData());
}
}
