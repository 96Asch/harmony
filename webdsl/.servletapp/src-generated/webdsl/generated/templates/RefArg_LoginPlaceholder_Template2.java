package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_LoginPlaceholder_Template2 extends utils.RefArg{
public LoginPlaceholder_Template template;
public  RefArg_LoginPlaceholder_Template2(LoginPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setRemember_((Boolean)org.webdsl.tools.Utils.cast(obj,Boolean.class));
return this;
}
public Object get(){
return template.getRemember_();
}
}
