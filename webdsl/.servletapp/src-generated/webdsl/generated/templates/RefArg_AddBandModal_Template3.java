package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddBandModal_Template3 extends utils.RefArg{
public AddBandModal_Template template;
public  RefArg_AddBandModal_Template3(AddBandModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setAdmins_((java.util.Set<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getAdmins_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
