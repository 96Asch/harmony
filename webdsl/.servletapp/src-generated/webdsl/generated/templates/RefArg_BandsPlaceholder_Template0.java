package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_BandsPlaceholder_Template0 extends utils.RefArg{
public BandsPlaceholder_Template template;
public  RefArg_BandsPlaceholder_Template0(BandsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setU_(webdsl.generated.domain.User._static_cast_(obj));
return this;
}
public Object get(){
return template.getU_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
