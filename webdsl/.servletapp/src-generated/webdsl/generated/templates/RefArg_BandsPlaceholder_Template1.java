package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_BandsPlaceholder_Template1 extends utils.RefArg{
public BandsPlaceholder_Template template;
public  RefArg_BandsPlaceholder_Template1(BandsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setBands_((java.util.List<webdsl.generated.domain.Band>)obj);
return this;
}
public Object get(){
return template.getBands_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Band.$static$all_();
}
}
