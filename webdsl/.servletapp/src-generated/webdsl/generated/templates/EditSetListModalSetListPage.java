package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class EditSetListModalSetListPage extends utils.PageServlet{
public String getPageName(){
return "EditSetListModalSetList";
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
Object[] args=new Object[]{setlist_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new EditSetListModalSetList_Template();
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
setlist_=(webdsl.generated.domain.SetList)args[0];
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
return "EditSetListModalSetList";
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
private String setlist__id;
private webdsl.generated.domain.SetList setlist_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("setlist").append("\", \"value\":\"").append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(setlist_.getNaturalId().toString())).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("setlist").append("=").append(utils.HTMLFilter.filter(setlist_.getNaturalId().toString())).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("setlist").append("\" value=\"").append(utils.HTMLFilter.filter(setlist_.getNaturalId().toString())).append("\" />");
}
protected void loadArguments(){
if(setlist__id!=null){
setlist_=(webdsl.generated.domain.SetList)utils.HibernateUtil.getCurrentSession().load(webdsl.generated.domain.SetList.class,java.util.UUID.fromString(setlist__id));
}
}
protected void conversion(){
if(parammap.get("setlist")!=null){
setlist__id=parammap.get("setlist");
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
