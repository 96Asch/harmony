package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class SongSearchString_Placeholder_Bool_BoolPage extends utils.PageServlet{
public String getPageName(){
return "songSearchString_Placeholder_Bool_Bool";
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
Object[] args=new Object[]{query_,ph_,searchPublic_,multipleAllowed_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new songSearchString_Placeholder_Bool_Bool_Template();
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
ph_=(String)args[1];
searchPublic_=(Boolean)args[2];
multipleAllowed_=(Boolean)args[3];
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
return "songSearchString_Placeholder_Bool_Bool";
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
private String ph_;
private Boolean searchPublic_;
private Boolean multipleAllowed_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("query").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(query_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("ph").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("searchPublic").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(searchPublic_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("multipleAllowed").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(multipleAllowed_.toString())).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("query").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(query_.toString()))).append("&");
combinedparams.append("ph").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph_.toString()))).append("&");
combinedparams.append("searchPublic").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(searchPublic_.toString()))).append("&");
combinedparams.append("multipleAllowed").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(multipleAllowed_.toString()))).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("query").append("\" value=\"").append(utils.HTMLFilter.filter(query_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph").append("\" value=\"").append(utils.HTMLFilter.filter(ph_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("searchPublic").append("\" value=\"").append(utils.HTMLFilter.filter(searchPublic_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("multipleAllowed").append("\" value=\"").append(utils.HTMLFilter.filter(multipleAllowed_.toString())).append("\" />");
}
protected void loadArguments(){
if(query_==null){
query_="";
}
if(ph_==null){
ph_="";
}
if(searchPublic_==null){
searchPublic_=false;
}
if(multipleAllowed_==null){
multipleAllowed_=false;
}
}
protected void conversion(){
if(parammap.get("query")!=null){
query_=parammap.get("query");
}
if(parammap.get("ph")!=null){
ph_=parammap.get("ph");
}
if(parammap.get("searchPublic")!=null){
searchPublic_=Boolean.valueOf(parammap.get("searchPublic"));
}
if(parammap.get("multipleAllowed")!=null){
multipleAllowed_=Boolean.valueOf(parammap.get("multipleAllowed"));
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
