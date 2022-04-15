package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SongFieldsSong_Template0 extends utils.RefArg{
public SongFieldsSong_Template template;
public  RefArg_SongFieldsSong_Template0(SongFieldsSong_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setTime1_((Integer)org.webdsl.tools.Utils.cast(obj,Integer.class));
return this;
}
public Object get(){
return template.getTime1_();
}
}
