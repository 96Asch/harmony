package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SongsPlaceholder_Template1 extends utils.RefArg{
public SongsPlaceholder_Template template;
public  RefArg_SongsPlaceholder_Template1(SongsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSongs_((java.util.List<webdsl.generated.domain.Song>)obj);
return this;
}
public Object get(){
return template.getSongs_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
}
