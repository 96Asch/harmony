package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_songSearchString_Placeholder_Template0 extends utils.RefArg{
public songSearchString_Placeholder_Template template;
public  RefArg_songSearchString_Placeholder_Template0(songSearchString_Placeholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setNewQuery_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getNewQuery_();
}
}
