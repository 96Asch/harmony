package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_RegisterPlaceholder_Template1 extends utils.RefArg{
public RegisterPlaceholder_Template template;
public  RefArg_RegisterPlaceholder_Template1(RegisterPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setEmail_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getEmail_();
}
}
