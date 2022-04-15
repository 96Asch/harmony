package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_EditBandModalBand_Template2 extends utils.RefArg{
public EditBandModalBand_Template template;
public  RefArg_EditBandModalBand_Template2(EditBandModalBand_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setValid_((Boolean)org.webdsl.tools.Utils.cast(obj,Boolean.class));
return this;
}
public Object get(){
return template.getValid_();
}
}
