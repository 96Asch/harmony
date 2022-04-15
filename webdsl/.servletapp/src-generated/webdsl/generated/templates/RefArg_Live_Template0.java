package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_Live_Template0 extends utils.RefArg{
public Live_Template template;
public  RefArg_Live_Template0(Live_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setPageIndex_((Integer)org.webdsl.tools.Utils.cast(obj,Integer.class));
return this;
}
public Object get(){
return template.getPageIndex_();
}
}
