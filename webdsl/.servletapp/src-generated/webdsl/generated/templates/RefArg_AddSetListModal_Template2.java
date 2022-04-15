package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSetListModal_Template2 extends utils.RefArg{
public AddSetListModal_Template template;
public  RefArg_AddSetListModal_Template2(AddSetListModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setEligibleSongs_((java.util.List<webdsl.generated.domain.Song>)obj);
return this;
}
public Object get(){
return template.getEligibleSongs_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
}
