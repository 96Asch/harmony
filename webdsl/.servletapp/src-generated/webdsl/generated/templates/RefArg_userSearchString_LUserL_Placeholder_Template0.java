package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_userSearchString_LUserL_Placeholder_Template0 extends utils.RefArg{
public userSearchString_LUserL_Placeholder_Template template;
public  RefArg_userSearchString_LUserL_Placeholder_Template0(userSearchString_LUserL_Placeholder_Template templ){
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
