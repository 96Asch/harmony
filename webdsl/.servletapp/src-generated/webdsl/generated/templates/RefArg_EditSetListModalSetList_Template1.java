package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_EditSetListModalSetList_Template1 extends utils.RefArg{
public EditSetListModalSetList_Template template;
public  RefArg_EditSetListModalSetList_Template1(EditSetListModalSetList_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNonPendingAdmins_((java.util.Set<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getNonPendingAdmins_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
