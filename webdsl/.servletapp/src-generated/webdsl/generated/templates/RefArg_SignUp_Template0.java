package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_SignUp_Template0 extends utils.RefArg{
public SignUp_Template template;
public  RefArg_SignUp_Template0(SignUp_Template templ){
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