package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_EditBandModalBand_Template4 extends utils.RefArg{
public EditBandModalBand_Template template;
public  RefArg_EditBandModalBand_Template4(EditBandModalBand_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSetlists_((java.util.List<webdsl.generated.domain.SetList>)obj);
return this;
}
public Object get(){
return template.getSetlists_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
}
