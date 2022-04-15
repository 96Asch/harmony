package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_userSearchLUserL_Template0 extends utils.RefArg{
public userSearchLUserL_Template template;
public  RefArg_userSearchLUserL_Template0(userSearchLUserL_Template templ){
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
