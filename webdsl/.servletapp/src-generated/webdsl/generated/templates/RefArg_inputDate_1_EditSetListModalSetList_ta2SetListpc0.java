package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputDate_1_EditSetListModalSetList_ta2SetListpc0 extends utils.RefArg{
public webdsl.generated.domain.SetList setlist_;
public  RefArg_inputDate_1_EditSetListModalSetList_ta2SetListpc0(){}
public  RefArg_inputDate_1_EditSetListModalSetList_ta2SetListpc0(Object setlist_){
this.setlist_=(webdsl.generated.domain.SetList)setlist_;
}
public webdsl.generated.domain.SetList set(Object obj){
setlist_.setDeadline((java.util.Date)org.webdsl.tools.Utils.cast(obj,java.util.Date.class));
return setlist_;
}
public Object get(){
return (java.util.Date)setlist_.getDeadline();
}
public void load(String uuid){
if(uuid.contains(":")){
setlist_=(webdsl.generated.domain.SetList)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.SetList");
setlist_=(webdsl.generated.domain.SetList)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return setlist_.getId()+"!"+"RefArg_inputDate_1_EditSetListModalSetList_ta2SetListpc0";
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
return setlist_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
setlist_.validateDeadline_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
setlist_.validateDeadline_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("SetList").getPropertyByName("deadline");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(setlist_);
}
}
