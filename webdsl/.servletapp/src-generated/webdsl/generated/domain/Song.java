package webdsl.generated.domain;
import webdsl.generated.search.SongSearcher;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Song")@org.hibernate.search.annotations.Indexed @org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Song implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
public static java.util.List<webdsl.generated.domain.Song> _static_searchSong_(String searchQuery){
return _static_searchSong_(searchQuery,1000,0);
}
public static java.util.List<webdsl.generated.domain.Song> _static_searchSong_(String searchQuery,int limit){
return _static_searchSong_(searchQuery,limit,0);
}
public static java.util.List<webdsl.generated.domain.Song> _static_searchSong_(String searchQuery,int limit,int offset){
return new SongSearcher().query(searchQuery).setOffset(offset).setLimit(limit).results();
}
public void validateDelete(){
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public void validateSave(){
webdsl.generated.domain.ValidationExceptionMultiple mex=this.validateSave_();
java.util.List<webdsl.generated.domain.ValidationException> ex=mex.getExceptions();
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
for(webdsl.generated.domain.ValidationException v:ex){
exceptions.add(new utils.ValidationException(null,v.getMessage()));
}
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public static Song _static_createEmpty_(){
Song ent=new Song();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static Song _static_cast_(Object o){
return (Song)org.webdsl.tools.Utils.cast(o,Song.class);
}
public  Song(){}
transient protected org.hibernate.bytecode.javassist.FieldHandler fieldHandler;
transient protected java.util.Set<String> uninitializedLazyProperties=null;
public org.hibernate.bytecode.javassist.FieldHandler getFieldHandler(){
return fieldHandler;
}
public boolean removeUninitializedLazyProperty(String name){
return uninitializedLazyProperties!=null&&uninitializedLazyProperties.remove(name);
}
public void setFieldHandler(org.hibernate.bytecode.javassist.FieldHandler fieldHandler){
this.fieldHandler=fieldHandler;
java.util.Set fieldHandlerUninit=((org.hibernate.intercept.javassist.FieldInterceptorImpl)fieldHandler).getUninitializedFields();
if(fieldHandlerUninit!=null){
this.uninitializedLazyProperties=new java.util.HashSet<String>(fieldHandlerUninit);
}
}
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=utils.UUIDFieldBridge.class)protected java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
public String getNaturalId(){
return _id.toString();
}
@Version @Column(name="version_opt_lock")protected Integer _version=0;
public Integer getVersion(){
return _version;
}
public org.webdsl.WebDSLEntity setVersion(Integer v){
this._version=v;
setChanged(v==1?"save()":"version");
return this;
}
@Transient boolean versionWasIncreased=false;
public void increaseVersion(){
if(!versionWasIncreased){
_version++;
versionWasIncreased=true;
setChanged("version");
}
}
@Transient protected boolean isChanged=false;
public boolean isChanged(){
return isChanged;
}
public void setChanged(String prop){
if(_version>0){
utils.AbstractPageServlet thepage=utils.ThreadLocalPage.get();
if(thepage!=null){
thepage.setHasWrites(true);
if(!thepage.invalidateAllPageCache){
thepage.invalidateAllPageCache("Song"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Song"+"."+prop);
utils.Warning.printSmallStackTrace(5);
}
else {
utils.HibernateUtil.getCurrentSession().setFlushMode(org.hibernate.FlushMode.AUTO);
}
}
if(!isChanged){
isChanged=true;
if(fieldHandler!=null){
((org.hibernate.intercept.FieldInterceptor)fieldHandler).dirty();
}
}
}
@Transient protected boolean isRequestVar=false;
public boolean isRequestVar(){
return isRequestVar;
}
public void setRequestVar(){
isRequestVar=true;
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Song")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Song.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Song.class.cast(o)).getId(),getId());
}
public Song save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Song delete(){
validateDelete();
setChanged("delete()");
utils.HibernateUtil.getCurrentSession().delete(this);
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((Song)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Song")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Song setCreated(java.util.Date newitem){
if(!createdBeingSet){
createdBeingSet=true;
setChanged("created");
this.setCreatedDateTime_(newitem);
java.util.Date olditem=_created;
_created=newitem;
createdBeingSet=false;
}
return this;
}
public void setCreatedNoEventsOrValidation(java.util.Date newitem){
setChanged("created");
java.util.Date olditem=_created;
_created=newitem;
}
@Transient boolean createdBeingSet=false;
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_modified\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _modified=null;
public java.util.Date getModified(){
return _modified;
}
public boolean isModifiedUninitialized(){
return false;
}
public Song setModified(java.util.Date newitem){
if(!modifiedBeingSet){
modifiedBeingSet=true;
setChanged("modified");
this.setModifiedDateTime_(newitem);
java.util.Date olditem=_modified;
_modified=newitem;
modifiedBeingSet=false;
}
return this;
}
public void setModifiedNoEventsOrValidation(java.util.Date newitem){
setChanged("modified");
java.util.Date olditem=_modified;
_modified=newitem;
}
@Transient boolean modifiedBeingSet=false;
@javax.persistence.Column(name="\"_title\"",length=255)@org.hibernate.annotations.AccessType(value="field")@org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer=@org.hibernate.search.annotations.Analyzer(definition="default"),name="title")})protected String _title="";
public String getTitle(){
return _title;
}
public boolean isTitleUninitialized(){
return false;
}
public Song setTitle(String newitem){
if(!titleBeingSet){
titleBeingSet=true;
setChanged("title");
this.setTitleString_(newitem);
String olditem=_title;
_title=newitem;
titleBeingSet=false;
}
return this;
}
public void setTitleNoEventsOrValidation(String newitem){
setChanged("title");
String olditem=_title;
_title=newitem;
}
@Transient boolean titleBeingSet=false;
@javax.persistence.Column(name="\"_subtitle\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _subtitle="";
public String getSubtitle(){
return _subtitle;
}
public boolean isSubtitleUninitialized(){
return false;
}
public Song setSubtitle(String newitem){
if(!subtitleBeingSet){
subtitleBeingSet=true;
setChanged("subtitle");
this.setSubtitleString_(newitem);
String olditem=_subtitle;
_subtitle=newitem;
subtitleBeingSet=false;
}
return this;
}
public void setSubtitleNoEventsOrValidation(String newitem){
setChanged("subtitle");
String olditem=_subtitle;
_subtitle=newitem;
}
@Transient boolean subtitleBeingSet=false;
@javax.persistence.Column(name="\"_bpm\"")@org.hibernate.annotations.AccessType(value="field")protected Integer _bpm=0;
public Integer getBpm(){
return _bpm;
}
public boolean isBpmUninitialized(){
return false;
}
public Song setBpm(Integer newitem){
if(!bpmBeingSet){
bpmBeingSet=true;
setChanged("bpm");
this.setBpmInt_(newitem);
Integer olditem=_bpm;
_bpm=newitem;
bpmBeingSet=false;
}
return this;
}
public void setBpmNoEventsOrValidation(Integer newitem){
setChanged("bpm");
Integer olditem=_bpm;
_bpm=newitem;
}
@Transient boolean bpmBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Song_key\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.SongKey _key=null;
public webdsl.generated.domain.SongKey getKey(){
return _key;
}
public boolean isKeyUninitialized(){
return _key instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_key).getHibernateLazyInitializer().isUninitialized();
}
public Song setKey(webdsl.generated.domain.SongKey newitem){
if(!keyBeingSet){
keyBeingSet=true;
setChanged("key");
this.setKeySongKey_(newitem);
webdsl.generated.domain.SongKey olditem=_key;
_key=newitem;
keyBeingSet=false;
}
return this;
}
public void setKeyNoEventsOrValidation(webdsl.generated.domain.SongKey newitem){
setChanged("key");
webdsl.generated.domain.SongKey olditem=_key;
_key=newitem;
}
@Transient boolean keyBeingSet=false;
@javax.persistence.Column(name="\"_timeSignature1\"")@org.hibernate.annotations.AccessType(value="field")protected Integer _timeSignature1=0;
public Integer getTimeSignature1(){
return _timeSignature1;
}
public boolean isTimeSignature1Uninitialized(){
return false;
}
public Song setTimeSignature1(Integer newitem){
if(!timeSignature1BeingSet){
timeSignature1BeingSet=true;
setChanged("timeSignature1");
this.setTimeSignature1Int_(newitem);
Integer olditem=_timeSignature1;
_timeSignature1=newitem;
timeSignature1BeingSet=false;
}
return this;
}
public void setTimeSignature1NoEventsOrValidation(Integer newitem){
setChanged("timeSignature1");
Integer olditem=_timeSignature1;
_timeSignature1=newitem;
}
@Transient boolean timeSignature1BeingSet=false;
@javax.persistence.Column(name="\"_timeSignature2\"")@org.hibernate.annotations.AccessType(value="field")protected Integer _timeSignature2=0;
public Integer getTimeSignature2(){
return _timeSignature2;
}
public boolean isTimeSignature2Uninitialized(){
return false;
}
public Song setTimeSignature2(Integer newitem){
if(!timeSignature2BeingSet){
timeSignature2BeingSet=true;
setChanged("timeSignature2");
this.setTimeSignature2Int_(newitem);
Integer olditem=_timeSignature2;
_timeSignature2=newitem;
timeSignature2BeingSet=false;
}
return this;
}
public void setTimeSignature2NoEventsOrValidation(Integer newitem){
setChanged("timeSignature2");
Integer olditem=_timeSignature2;
_timeSignature2=newitem;
}
@Transient boolean timeSignature2BeingSet=false;
@javax.persistence.Column(name="\"_genre\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _genre="";
public String getGenre(){
return _genre;
}
public boolean isGenreUninitialized(){
return false;
}
public Song setGenre(String newitem){
if(!genreBeingSet){
genreBeingSet=true;
setChanged("genre");
this.setGenreString_(newitem);
String olditem=_genre;
_genre=newitem;
genreBeingSet=false;
}
return this;
}
public void setGenreNoEventsOrValidation(String newitem){
setChanged("genre");
String olditem=_genre;
_genre=newitem;
}
@Transient boolean genreBeingSet=false;
@javax.persistence.Column(name="\"_chordRaw\"",length=1000000)@org.hibernate.annotations.AccessType(value="field")protected String _chordRaw="";
public String getChordRaw(){
return _chordRaw;
}
public boolean isChordRawUninitialized(){
return false;
}
public Song setChordRaw(String newitem){
if(!chordRawBeingSet){
chordRawBeingSet=true;
setChanged("chordRaw");
this.setChordRawText_(newitem);
String olditem=_chordRaw;
_chordRaw=newitem;
chordRawBeingSet=false;
}
return this;
}
public void setChordRawNoEventsOrValidation(String newitem){
setChanged("chordRaw");
String olditem=_chordRaw;
_chordRaw=newitem;
}
@Transient boolean chordRawBeingSet=false;
@org.hibernate.annotations.AccessType(value="field")@OneToOne(fetch=javax.persistence.FetchType.LAZY)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected utils.File _refTrack=null;
public utils.File getRefTrack(){
return _refTrack;
}
public boolean isRefTrackUninitialized(){
return false;
}
public Song setRefTrack(utils.File newitem){
if(!refTrackBeingSet){
refTrackBeingSet=true;
setChanged("refTrack");
this.setRefTrackFile_(newitem);
utils.File olditem=_refTrack;
_refTrack=newitem;
refTrackBeingSet=false;
}
return this;
}
public void setRefTrackNoEventsOrValidation(utils.File newitem){
setChanged("refTrack");
utils.File olditem=_refTrack;
_refTrack=newitem;
}
@Transient boolean refTrackBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Song_owner\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _owner=null;
public webdsl.generated.domain.User getOwner(){
return _owner;
}
public boolean isOwnerUninitialized(){
return _owner instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_owner).getHibernateLazyInitializer().isUninitialized();
}
public Song setOwner(webdsl.generated.domain.User newitem){
if(!ownerBeingSet){
ownerBeingSet=true;
setChanged("owner");
this.setOwnerUser_(newitem);
webdsl.generated.domain.User olditem=_owner;
_owner=newitem;
ownerBeingSet=false;
}
return this;
}
public void setOwnerNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("owner");
webdsl.generated.domain.User olditem=_owner;
_owner=newitem;
}
@Transient boolean ownerBeingSet=false;
@javax.persistence.Column(name="\"_public\"")@org.hibernate.annotations.AccessType(value="field")protected Boolean _public=false;
public Boolean getPublic(){
return _public;
}
public boolean isPublicUninitialized(){
return false;
}
public Song setPublic(Boolean newitem){
if(!publicBeingSet){
publicBeingSet=true;
setChanged("public");
this.setPublicBool_(newitem);
Boolean olditem=_public;
_public=newitem;
publicBeingSet=false;
}
return this;
}
public void setPublicNoEventsOrValidation(Boolean newitem){
setChanged("public");
Boolean olditem=_public;
_public=newitem;
}
@Transient boolean publicBeingSet=false;
public String getName(){
if(getTitle()!=null){
return getTitle().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "Song";
}
public java.util.List<webdsl.generated.domain.User> allowedOwner_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.SongKey> allowedKey_(){
return (java.util.List<webdsl.generated.domain.SongKey>)(java.util.List<?>)webdsl.generated.domain.SongKey.$static$all_();
}
public void validatePublic_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validatePublic_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePublic_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateOwner_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateOwner_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateOwner_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateRefTrack_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateRefTrack_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateRefTrack_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateChordRaw_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getChordRaw(),null)&&(!(org.webdsl.tools.Utils.equal(this.getChordRaw().length(),null)||org.webdsl.tools.Utils.equal(1000000,null))&&this.getChordRaw().length()>1000000)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+1000000+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateChordRaw_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateChordRaw_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateGenre_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getGenre(),null)&&(!(org.webdsl.tools.Utils.equal(this.getGenre().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getGenre().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateGenre_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateGenre_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateTimeSignature2_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateTimeSignature2_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTimeSignature2_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateTimeSignature1_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateTimeSignature1_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTimeSignature1_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateKey_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateKey_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateKey_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateBpm_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateBpm_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateBpm_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSubtitle_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getSubtitle(),null)&&(!(org.webdsl.tools.Utils.equal(this.getSubtitle().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getSubtitle().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSubtitle_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSubtitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateTitle_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getTitle(),null)&&(!(org.webdsl.tools.Utils.equal(this.getTitle().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getTitle().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateTitle_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateBpm_internalValidationExceptionMultiple_(v_);
this.validateChordRaw_internalValidationExceptionMultiple_(v_);
this.validateGenre_internalValidationExceptionMultiple_(v_);
this.validateKey_internalValidationExceptionMultiple_(v_);
this.validateOwner_internalValidationExceptionMultiple_(v_);
this.validatePublic_internalValidationExceptionMultiple_(v_);
this.validateRefTrack_internalValidationExceptionMultiple_(v_);
this.validateSubtitle_internalValidationExceptionMultiple_(v_);
this.validateTimeSignature1_internalValidationExceptionMultiple_(v_);
this.validateTimeSignature2_internalValidationExceptionMultiple_(v_);
this.validateTitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Song").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Song").list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByTitle_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._title = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByTitleLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._title like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findBySubtitle_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._subtitle = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findBySubtitleLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._subtitle like :param3").setParameter("param3",s_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByGenre_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._genre = :param4").setParameter("param4",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByGenreLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._genre like :param5").setParameter("param5",s_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByChordRaw_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._chordRaw = :param6").setParameter("param6",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Song> _static_findByChordRawLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Song as g where g._chordRaw like :param7").setParameter("param7",s_).list();
}
public static webdsl.generated.domain.Song _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.Song._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Song",prop_));
}
public webdsl.generated.domain.Song Song$this_(){
this.Song_();
return this;
}
public void Song_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setTitleString_(String value_){}
public void setSubtitleString_(String value_){}
public void setBpmInt_(Integer value_){}
public void setKeySongKey_(webdsl.generated.domain.SongKey value_){}
public void setTimeSignature1Int_(Integer value_){}
public void setTimeSignature2Int_(Integer value_){}
public void setGenreString_(String value_){}
public void setChordRawText_(String value_){}
public void setRefTrackFile_(utils.File value_){}
public void setOwnerUser_(webdsl.generated.domain.User value_){}
public void setPublicBool_(Boolean value_){}
}
