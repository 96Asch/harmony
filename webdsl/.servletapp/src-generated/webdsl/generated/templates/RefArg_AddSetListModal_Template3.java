package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSetListModal_Template3 extends utils.RefArg{
public AddSetListModal_Template template;
public  RefArg_AddSetListModal_Template3(AddSetListModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setUserList_((java.util.List<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getUserList_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
