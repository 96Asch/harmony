package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddBandModal_Template2 extends utils.RefArg{
public AddBandModal_Template template;
public  RefArg_AddBandModal_Template2(AddBandModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setMembers_((java.util.Set<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getMembers_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
