package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_LoginPlaceholder_Template0 extends utils.RefArg{
public LoginPlaceholder_Template template;
public  RefArg_LoginPlaceholder_Template0(LoginPlaceholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setUname_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getUname_();
}
}
