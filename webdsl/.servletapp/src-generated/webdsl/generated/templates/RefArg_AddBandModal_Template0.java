package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddBandModal_Template0 extends utils.RefArg{
public AddBandModal_Template template;
public  RefArg_AddBandModal_Template0(AddBandModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setBand_(webdsl.generated.domain.Band._static_cast_(obj));
return this;
}
public Object get(){
return template.getBand_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Band.$static$all_();
}
}
