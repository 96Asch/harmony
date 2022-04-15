package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSetListModal_Template0 extends utils.RefArg{
public AddSetListModal_Template template;
public  RefArg_AddSetListModal_Template0(AddSetListModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSetlist_(webdsl.generated.domain.SetList._static_cast_(obj));
return this;
}
public Object get(){
return template.getSetlist_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
}
