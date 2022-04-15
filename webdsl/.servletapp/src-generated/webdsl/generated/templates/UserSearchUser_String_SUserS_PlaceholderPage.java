package webdsl.generated.templates;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressWarnings("all")public class UserSearchUser_String_SUserS_PlaceholderPage extends utils.PageServlet{
public String getPageName(){
return "userSearchUser_String_SUserS_Placeholder";
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
Object[] args=new Object[]{owner_,query_,pending_,ph_};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new userSearchUser_String_SUserS_Placeholder_Template();
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
owner_=(webdsl.generated.domain.User)args[0];
query_=(String)args[1];
pending_=(java.util.Set<webdsl.generated.domain.User>)args[2];
ph_=(String)args[3];
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
return "userSearchUser_String_SUserS_Placeholder";
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
private String owner__id;
private webdsl.generated.domain.User owner_;
private String query_;
private java.util.Set<java.util.UUID> pending__ids;
private java.util.Set<webdsl.generated.domain.User> pending_;
private String ph_;
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){
combinedparams.append("{\"name\":\"").append("owner").append("\", \"value\":\"").append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(owner_.getNaturalId().toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("query").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(query_.toString())).append("\"},");
combinedparams.append("{\"name\":\"").append("pending").append("\", \"value\":\"").append(org.apache.commons.lang3.StringEscapeUtils.escapeEcmaScript(org.webdsl.tools.Utils.encodeIdList(pending_))).append("\"},");
combinedparams.append("{\"name\":\"").append("ph").append("\", \"value\":\"").append(utils.HTMLFilter.filterEcmaWithinHTML(ph_.toString())).append("\"},");
}
public void urlQueryParams(java.lang.StringBuilder combinedparams){
combinedparams.append("owner").append("=").append(utils.HTMLFilter.filter(owner_.getNaturalId().toString())).append("&");
combinedparams.append("query").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(query_.toString()))).append("&");
combinedparams.append("pending").append("=").append(utils.HTMLFilter.filter(org.webdsl.tools.Utils.encodeIdList(pending_))).append("&");
combinedparams.append("ph").append("=").append(utils.HTMLFilter.filter(utils.URLFilter.filter(ph_.toString()))).append("&");
}
public void hiddenParams(java.lang.StringBuilder combinedparams){
combinedparams.append("<input type=\"hidden\" name=\"").append("owner").append("\" value=\"").append(utils.HTMLFilter.filter(owner_.getNaturalId().toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("query").append("\" value=\"").append(utils.HTMLFilter.filter(query_.toString())).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("pending").append("\" value=\"").append(utils.HTMLFilter.filter(org.webdsl.tools.Utils.encodeIdList(pending_))).append("\" />");
combinedparams.append("<input type=\"hidden\" name=\"").append("ph").append("\" value=\"").append(utils.HTMLFilter.filter(ph_.toString())).append("\" />");
}
protected void loadArguments(){
if(owner__id!=null){
java.util.List<webdsl.generated.domain.User> results=utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.User.class).add(org.hibernate.criterion.Restrictions.naturalId().set("_username",owner__id)).list();
if(results.size()==0){
throw new utils.EntityNotFoundException(owner__id);
}
else if(results.size()>1){
org.webdsl.logging.Logger.error("Multiple entities with this identity found: "+owner__id);
throw new RuntimeException("Multiple entities with this identity found: "+owner__id);
}
else {
owner_=results.get(0);
}
}
if(query_==null){
query_="";
}
if(pending__ids==null){}
else {
if(pending_==null){
pending_=new java.util.LinkedHashSet<webdsl.generated.domain.User>();
for(java.util.UUID anid:pending__ids){
pending_.add((webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().load(webdsl.generated.domain.User.class,anid));
}
}
}
if(ph_==null){
ph_="";
}
}
protected void conversion(){
if(parammap.get("owner")!=null){
owner__id=parammap.get("owner");
}
if(parammap.get("query")!=null){
query_=parammap.get("query");
}
if(parammap.get("pending")!=null){
try{
String[] ids=parammap.get("pending").split(",");
pending__ids=new java.util.LinkedHashSet<java.util.UUID>();
for(String anid:ids){
pending__ids.add(java.util.UUID.fromString(anid));
}
}
catch(NumberFormatException nfe){
org.webdsl.logging.Logger.error(nfe.getMessage());
}
}
if(parammap.get("ph")!=null){
ph_=parammap.get("ph");
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
