package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_outputDate_1_NotificationContentBandInvitationpc0 extends utils.RefArg{
public webdsl.generated.domain.BandInvitation bi_;
public  RefArg_outputDate_1_NotificationContentBandInvitationpc0(){}
public  RefArg_outputDate_1_NotificationContentBandInvitationpc0(Object bi_){
this.bi_=(webdsl.generated.domain.BandInvitation)bi_;
}
public webdsl.generated.domain.BandInvitation set(Object obj){
bi_.setDateSent((java.util.Date)org.webdsl.tools.Utils.cast(obj,java.util.Date.class));
return bi_;
}
public Object get(){
return (java.util.Date)bi_.getDateSent();
}
public void load(String uuid){
if(uuid.contains(":")){
bi_=(webdsl.generated.domain.BandInvitation)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.BandInvitation");
bi_=(webdsl.generated.domain.BandInvitation)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return bi_.getId()+"!"+"RefArg_outputDate_1_NotificationContentBandInvitationpc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "Date";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return bi_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
bi_.validateDateSent_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
bi_.validateDateSent_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("BandInvitation").getPropertyByName("dateSent");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(bi_);
}
}
