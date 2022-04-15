package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_searchLUserL_Template0 extends utils.RefArg{
public searchLUserL_Template template;
public  RefArg_searchLUserL_Template0(searchLUserL_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setQuery_((String)org.webdsl.tools.Utils.cast(obj,String.class));
return this;
}
public Object get(){
return template.getQuery_();
}
}
