package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SetListsPlaceholder_Template2 extends utils.RefArg{
public SetListsPlaceholder_Template template;
public  RefArg_SetListsPlaceholder_Template2(SetListsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewSetList_(webdsl.generated.domain.SetList._static_cast_(obj));
return this;
}
public Object get(){
return template.getNewSetList_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
}
