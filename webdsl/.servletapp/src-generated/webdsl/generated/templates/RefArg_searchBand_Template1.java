package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_searchBand_Template1 extends utils.RefArg{
public searchBand_Template template;
public  RefArg_searchBand_Template1(searchBand_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setUsers_((java.util.List<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getUsers_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
