package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SetListsPlaceholder_Template1 extends utils.RefArg{
public SetListsPlaceholder_Template template;
public  RefArg_SetListsPlaceholder_Template1(SetListsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSetLists_((java.util.List<webdsl.generated.domain.SetList>)obj);
return this;
}
public Object get(){
return template.getSetLists_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
}
