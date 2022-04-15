package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_testString_LUserL_Template0 extends utils.RefArg{
public testString_LUserL_Template template;
public  RefArg_testString_LUserL_Template0(testString_LUserL_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setSearchList_((java.util.List<webdsl.generated.domain.User>)obj);
return this;
}
public Object get(){
return template.getSearchList_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
}
