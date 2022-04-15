package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SongsPlaceholder_Template0 extends utils.RefArg{
public SongsPlaceholder_Template template;
public  RefArg_SongsPlaceholder_Template0(SongsPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setUsername_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getUsername_();
}
}
