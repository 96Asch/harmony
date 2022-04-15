package webdsl.generated.templates;
@SuppressWarnings("all")public class RefArg_inputText_1_EditSongModalSong_ta4Songpc0 extends utils.RefArg{
public webdsl.generated.domain.Song song_;
public  RefArg_inputText_1_EditSongModalSong_ta4Songpc0(){}
public  RefArg_inputText_1_EditSongModalSong_ta4Songpc0(Object song_){
this.song_=(webdsl.generated.domain.Song)song_;
}
public webdsl.generated.domain.Song set(Object obj){
song_.setChordRaw((String)org.webdsl.tools.Utils.cast(obj,String.class));
return song_;
}
public Object get(){
return (String)song_.getChordRaw();
}
public void load(String uuid){
if(uuid.contains(":")){
song_=(webdsl.generated.domain.Song)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.Song");
song_=(webdsl.generated.domain.Song)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return song_.getId()+"!"+"RefArg_inputText_1_EditSongModalSong_ta4Songpc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "Text";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return song_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
song_.validateChordRaw_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
song_.validateChordRaw_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("Song").getPropertyByName("chordRaw");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(song_);
}
}