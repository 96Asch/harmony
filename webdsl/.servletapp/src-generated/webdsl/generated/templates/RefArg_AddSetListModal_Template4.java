package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_AddSetListModal_Template4 extends utils.RefArg{
public AddSetListModal_Template template;
public  RefArg_AddSetListModal_Template4(AddSetListModal_Template templ){
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
