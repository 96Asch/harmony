package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_EditBandModalBand_Template3 extends utils.RefArg{
public EditBandModalBand_Template template;
public  RefArg_EditBandModalBand_Template3(EditBandModalBand_Template templ){
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
