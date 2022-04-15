package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddBandModal_Template4 extends utils.RefArg{
public AddBandModal_Template template;
public  RefArg_AddBandModal_Template4(AddBandModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setEligibleSetlists_((java.util.List<webdsl.generated.domain.SetList>)obj);
return this;
}
public Object get(){
return template.getEligibleSetlists_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
}
