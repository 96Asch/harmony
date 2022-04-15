package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSongModal_Template0 extends utils.RefArg{
public AddSongModal_Template template;
public  RefArg_AddSongModal_Template0(AddSongModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSong_(webdsl.generated.domain.Song._static_cast_(obj));
return this;
}
public Object get(){
return template.getSong_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
}
