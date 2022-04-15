package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SongFieldsSong_Template1 extends utils.RefArg{
public SongFieldsSong_Template template;
public  RefArg_SongFieldsSong_Template1(SongFieldsSong_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setTime2_((Integer)org.webdsl.tools.Utils.cast(obj,Integer.class));
return this;
}
public Object get(){
return template.getTime2_();
}
}
