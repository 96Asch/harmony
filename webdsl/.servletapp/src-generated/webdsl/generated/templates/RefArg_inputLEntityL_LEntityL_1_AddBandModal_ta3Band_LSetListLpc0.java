package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LSetListLpc0 extends utils.RefArg{
public webdsl.generated.domain.Band band_;
public  RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LSetListLpc0(){}
public  RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LSetListLpc0(Object band_){
this.band_=(webdsl.generated.domain.Band)band_;
}
public webdsl.generated.domain.Band set(Object obj){
band_.replaceAllInSetLists((java.util.List<webdsl.generated.domain.SetList>)obj);
return band_;
}
public Object get(){
return (java.util.List<webdsl.generated.domain.SetList>)band_.getSetLists();
}
public void load(String uuid){
if(uuid.contains(":")){
band_=(webdsl.generated.domain.Band)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.Band");
band_=(webdsl.generated.domain.Band)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return band_.getId()+"!"+"RefArg_inputLEntityL_LEntityL_1_AddBandModal_ta3Band_LSetListLpc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "not an entity type";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return band_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
band_.validateSetLists_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
band_.validateSetLists_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("Band").getPropertyByName("setLists");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(band_);
}
}
