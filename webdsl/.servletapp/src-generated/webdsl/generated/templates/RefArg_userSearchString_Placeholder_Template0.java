package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_userSearchString_Placeholder_Template0 extends utils.RefArg{
public userSearchString_Placeholder_Template template;
public  RefArg_userSearchString_Placeholder_Template0(userSearchString_Placeholder_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setInvites_((java.util.List<webdsl.generated.domain.SetListInvitation>)obj);
return this;
}
public Object get(){
return template.getInvites_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.SetListInvitation.$static$all_();
}
}
