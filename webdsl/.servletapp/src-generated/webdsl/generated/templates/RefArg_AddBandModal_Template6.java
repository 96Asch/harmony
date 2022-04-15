package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddBandModal_Template6 extends utils.RefArg{
public AddBandModal_Template template;
public  RefArg_AddBandModal_Template6(AddBandModal_Template templ){
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
