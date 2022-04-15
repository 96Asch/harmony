package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_RegisterPlaceholder_Template2 extends utils.RefArg{
public RegisterPlaceholder_Template template;
public  RefArg_RegisterPlaceholder_Template2(RegisterPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setPass_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getPass_();
}
}
