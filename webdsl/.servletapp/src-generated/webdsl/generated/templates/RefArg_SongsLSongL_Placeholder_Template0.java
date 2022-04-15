package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SongsLSongL_Placeholder_Template0 extends utils.RefArg{
public SongsLSongL_Placeholder_Template template;
public  RefArg_SongsLSongL_Placeholder_Template0(SongsLSongL_Placeholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewSong_(webdsl.generated.domain.Song._static_cast_(obj));
return this;
}
public Object get(){
return template.getNewSong_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
}
