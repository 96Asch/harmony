package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0 extends utils.RefArg{
public webdsl.generated.domain.User u_;
public  RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0(){}
public  RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0(Object u_){
this.u_=(webdsl.generated.domain.User)u_;
}
public webdsl.generated.domain.User set(Object obj){
u_.setUsername((String)org.webdsl.tools.Utils.cast(obj,String.class));
return u_;
}
public Object get(){
return (String)u_.getUsername();
}
public void load(String uuid){
if(uuid.contains(":")){
u_=(webdsl.generated.domain.User)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.User");
u_=(webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return u_.getId()+"!"+"RefArg_inputString_1_RegisterPlaceholder_ta0Placeholder_Userpc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "String";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return u_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
u_.validateUsername_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
u_.validateUsername_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("User").getPropertyByName("username");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(u_);
}
}
