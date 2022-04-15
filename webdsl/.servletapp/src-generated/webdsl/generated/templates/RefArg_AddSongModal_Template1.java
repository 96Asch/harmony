package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSongModal_Template1 extends utils.RefArg{
public AddSongModal_Template template;
public  RefArg_AddSongModal_Template1(AddSongModal_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setChoFile_((utils.File)org.webdsl.tools.Utils.cast(obj,utils.File.class));
return this;
}
public Object get(){
return template.getChoFile_();
}
}
