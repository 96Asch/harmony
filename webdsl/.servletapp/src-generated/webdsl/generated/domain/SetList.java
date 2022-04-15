package webdsl.generated.domain;
import webdsl.generated.search.SetListSearcher;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_SetList")@org.hibernate.search.annotations.Indexed @org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class SetList implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
public static java.util.List<webdsl.generated.domain.SetList> _static_searchSetList_(String searchQuery){
return _static_searchSetList_(searchQuery,1000,0);
}
public static java.util.List<webdsl.generated.domain.SetList> _static_searchSetList_(String searchQuery,int limit){
return _static_searchSetList_(searchQuery,limit,0);
}
public static java.util.List<webdsl.generated.domain.SetList> _static_searchSetList_(String searchQuery,int limit,int offset){
return new SetListSearcher().query(searchQuery).setOffset(offset).setLimit(limit).results();
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
public static SetList _static_createEmpty_(){
SetList ent=new SetList();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static SetList _static_cast_(Object o){
return (SetList)org.webdsl.tools.Utils.cast(o,SetList.class);
}
public  SetList(){}
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
thepage.invalidateAllPageCache("SetList"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"SetList"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("SetList")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?SetList.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):SetList.class.cast(o)).getId(),getId());
}
public SetList save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public SetList delete(){
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
return getId().compareTo(((SetList)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("SetList")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public SetList setCreated(java.util.Date newitem){
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
public SetList setModified(java.util.Date newitem){
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
public SetList setTitle(String newitem){
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
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"SetList_owner\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _owner=null;
public webdsl.generated.domain.User getOwner(){
return _owner;
}
public boolean isOwnerUninitialized(){
return _owner instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_owner).getHibernateLazyInitializer().isUninitialized();
}
public SetList setOwner(webdsl.generated.domain.User newitem){
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
@javax.persistence.Column(name="\"_description\"",length=1000000)@org.hibernate.annotations.AccessType(value="field")protected String _description="";
public String getDescription(){
return _description;
}
public boolean isDescriptionUninitialized(){
return false;
}
public SetList setDescription(String newitem){
if(!descriptionBeingSet){
descriptionBeingSet=true;
setChanged("description");
this.setDescriptionText_(newitem);
String olditem=_description;
_description=newitem;
descriptionBeingSet=false;
}
return this;
}
public void setDescriptionNoEventsOrValidation(String newitem){
setChanged("description");
String olditem=_description;
_description=newitem;
}
@Transient boolean descriptionBeingSet=false;
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="SetList_songs_Song")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"SetListsongsindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.Song> _songs=new webdsl.generated.domain.SetListSongsList(this);
public java.util.List<webdsl.generated.domain.Song> getSongs(){
return _songs;
}
public boolean isSongsUninitialized(){
return _songs instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_songs).wasInitialized();
}
public SetList setSongs(java.util.List<webdsl.generated.domain.Song> newitem){
setChanged("songs");
_songs=newitem;
return this;
}
@Transient boolean songsBeingSet=false;
public java.util.List<webdsl.generated.domain.Song> getSongsList(){
return new java.util.ArrayList(getSongs());
}
public void setSongsList(java.util.List<webdsl.generated.domain.Song> list1){
setChanged("songs");
setSongs(new webdsl.generated.domain.SetListSongsList(this,list1));
}
public int getSongsLength(){
return getSongs().size();
}
public void removeFromSongs(webdsl.generated.domain.Song item){
setChanged("songs");
getSongs().remove(item);
}
public void replaceAllInSongs(java.util.Collection<webdsl.generated.domain.Song> col){
removeAllFromSongs();
addAllToSongs(col);
}
public void removeAllFromSongs(){
org.hibernate.Hibernate.initialize(getSongs());
java.util.Iterator<webdsl.generated.domain.Song> itt=getSongs().iterator();
java.util.List<webdsl.generated.domain.Song> copy=new java.util.ArrayList(getSongs());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromSongs(itt.next());
}
}
public void addToSongs(webdsl.generated.domain.Song item){
setChanged("songs");
getSongs().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.List<webdsl.generated.domain.Song> addAllToSongs(java.util.Collection<webdsl.generated.domain.Song> col){
java.util.List<webdsl.generated.domain.Song> copy=new java.util.ArrayList<webdsl.generated.domain.Song>(col);
java.util.Iterator<webdsl.generated.domain.Song> it=copy.iterator();
while(it.hasNext()){
addToSongs(it.next());
}
return getSongs();
}
public void setInSongs(int index,webdsl.generated.domain.Song newitem){
getSongs().set(index,newitem);
}
public void insertInSongs(int index,webdsl.generated.domain.Song item){
getSongs().add(index,item);
}
public void removeAtSongs(int index){
getSongs().remove(index);
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="SetList_admins_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _admins=new webdsl.generated.domain.SetListAdminsSet(this);
public java.util.Set<webdsl.generated.domain.User> getAdmins(){
return _admins;
}
public boolean isAdminsUninitialized(){
return _admins instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_admins).wasInitialized();
}
public SetList setAdmins(java.util.Set<webdsl.generated.domain.User> newitem){
setChanged("admins");
_admins=newitem;
return this;
}
@Transient boolean adminsBeingSet=false;
public java.util.List<webdsl.generated.domain.User> getAdminsList(){
return new java.util.ArrayList(getAdmins());
}
public void setAdminsList(java.util.List<webdsl.generated.domain.User> list2){
setChanged("admins");
setAdmins(new webdsl.generated.domain.SetListAdminsSet(this,list2));
}
public int getAdminsLength(){
return getAdmins().size();
}
public void removeFromAdmins(webdsl.generated.domain.User item){
setChanged("admins");
getAdmins().remove(item);
}
public void replaceAllInAdmins(java.util.Collection<webdsl.generated.domain.User> col){
removeAllFromAdmins();
addAllToAdmins(col);
}
public void removeAllFromAdmins(){
org.hibernate.Hibernate.initialize(getAdmins());
java.util.Iterator<webdsl.generated.domain.User> itt=getAdmins().iterator();
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList(getAdmins());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromAdmins(itt.next());
}
}
public void addToAdmins(webdsl.generated.domain.User item){
setChanged("admins");
getAdmins().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.User> addAllToAdmins(java.util.Collection<webdsl.generated.domain.User> col){
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList<webdsl.generated.domain.User>(col);
java.util.Iterator<webdsl.generated.domain.User> it=copy.iterator();
while(it.hasNext()){
addToAdmins(it.next());
}
return getAdmins();
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="SetList_members_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _members=new webdsl.generated.domain.SetListMembersSet(this);
public java.util.Set<webdsl.generated.domain.User> getMembers(){
return _members;
}
public boolean isMembersUninitialized(){
return _members instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_members).wasInitialized();
}
public SetList setMembers(java.util.Set<webdsl.generated.domain.User> newitem){
setChanged("members");
_members=newitem;
return this;
}
@Transient boolean membersBeingSet=false;
public java.util.List<webdsl.generated.domain.User> getMembersList(){
return new java.util.ArrayList(getMembers());
}
public void setMembersList(java.util.List<webdsl.generated.domain.User> list3){
setChanged("members");
setMembers(new webdsl.generated.domain.SetListMembersSet(this,list3));
}
public int getMembersLength(){
return getMembers().size();
}
public void removeFromMembers(webdsl.generated.domain.User item){
setChanged("members");
getMembers().remove(item);
}
public void replaceAllInMembers(java.util.Collection<webdsl.generated.domain.User> col){
removeAllFromMembers();
addAllToMembers(col);
}
public void removeAllFromMembers(){
org.hibernate.Hibernate.initialize(getMembers());
java.util.Iterator<webdsl.generated.domain.User> itt=getMembers().iterator();
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList(getMembers());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromMembers(itt.next());
}
}
public void addToMembers(webdsl.generated.domain.User item){
setChanged("members");
getMembers().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.User> addAllToMembers(java.util.Collection<webdsl.generated.domain.User> col){
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList<webdsl.generated.domain.User>(col);
java.util.Iterator<webdsl.generated.domain.User> it=copy.iterator();
while(it.hasNext()){
addToMembers(it.next());
}
return getMembers();
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="SetList_pending_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _pending=new webdsl.generated.domain.SetListPendingSet(this);
public java.util.Set<webdsl.generated.domain.User> getPending(){
return _pending;
}
public boolean isPendingUninitialized(){
return _pending instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_pending).wasInitialized();
}
public SetList setPending(java.util.Set<webdsl.generated.domain.User> newitem){
setChanged("pending");
_pending=newitem;
return this;
}
@Transient boolean pendingBeingSet=false;
public java.util.List<webdsl.generated.domain.User> getPendingList(){
return new java.util.ArrayList(getPending());
}
public void setPendingList(java.util.List<webdsl.generated.domain.User> list4){
setChanged("pending");
setPending(new webdsl.generated.domain.SetListPendingSet(this,list4));
}
public int getPendingLength(){
return getPending().size();
}
public void removeFromPending(webdsl.generated.domain.User item){
setChanged("pending");
getPending().remove(item);
}
public void replaceAllInPending(java.util.Collection<webdsl.generated.domain.User> col){
removeAllFromPending();
addAllToPending(col);
}
public void removeAllFromPending(){
org.hibernate.Hibernate.initialize(getPending());
java.util.Iterator<webdsl.generated.domain.User> itt=getPending().iterator();
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList(getPending());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromPending(itt.next());
}
}
public void addToPending(webdsl.generated.domain.User item){
setChanged("pending");
getPending().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.User> addAllToPending(java.util.Collection<webdsl.generated.domain.User> col){
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList<webdsl.generated.domain.User>(col);
java.util.Iterator<webdsl.generated.domain.User> it=copy.iterator();
while(it.hasNext()){
addToPending(it.next());
}
return getPending();
}
@Temporal(TemporalType.DATE)@javax.persistence.Column(name="\"_deadline\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _deadline=null;
public java.util.Date getDeadline(){
return _deadline;
}
public boolean isDeadlineUninitialized(){
return false;
}
public SetList setDeadline(java.util.Date newitem){
if(!deadlineBeingSet){
deadlineBeingSet=true;
setChanged("deadline");
this.setDeadlineDate_(newitem);
java.util.Date olditem=_deadline;
_deadline=newitem;
deadlineBeingSet=false;
}
return this;
}
public void setDeadlineNoEventsOrValidation(java.util.Date newitem){
setChanged("deadline");
java.util.Date olditem=_deadline;
_deadline=newitem;
}
@Transient boolean deadlineBeingSet=false;
public String getName(){
if(getTitle()!=null){
return getTitle().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "SetList";
}
public java.util.List<webdsl.generated.domain.User> allowedPending_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedMembers_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedAdmins_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.Song> allowedSongs_(){
return (java.util.List<webdsl.generated.domain.Song>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedOwner_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validateDeadline_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateDeadline_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDeadline_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validatePending_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validatePending_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePending_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateMembers_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateMembers_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateMembers_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateAdmins_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateAdmins_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAdmins_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSongs_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSongs_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSongs_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDescription_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getDescription(),null)&&(!(org.webdsl.tools.Utils.equal(this.getDescription().length(),null)||org.webdsl.tools.Utils.equal(1000000,null))&&this.getDescription().length()>1000000)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+1000000+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateDescription_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDescription_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateOwner_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateOwner_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateOwner_internalValidationExceptionMultiple_(v_);
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
this.validateAdmins_internalValidationExceptionMultiple_(v_);
this.validateDeadline_internalValidationExceptionMultiple_(v_);
this.validateDescription_internalValidationExceptionMultiple_(v_);
this.validateMembers_internalValidationExceptionMultiple_(v_);
this.validateOwner_internalValidationExceptionMultiple_(v_);
this.validatePending_internalValidationExceptionMultiple_(v_);
this.validateSongs_internalValidationExceptionMultiple_(v_);
this.validateTitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SetList").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SetList").list();
}
public static java.util.List<webdsl.generated.domain.SetList> _static_findByTitle_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SetList as g where g._title = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.SetList> _static_findByTitleLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SetList as g where g._title like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.SetList> _static_findByDescription_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SetList as g where g._description = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.SetList> _static_findByDescriptionLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from SetList as g where g._description like :param3").setParameter("param3",s_).list();
}
public static webdsl.generated.domain.SetList _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.SetList._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"SetList",prop_));
}
public webdsl.generated.domain.SetList SetList$this_(){
this.SetList_();
return this;
}
public void SetList_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setTitleString_(String value_){}
public void setOwnerUser_(webdsl.generated.domain.User value_){}
public void setDescriptionText_(String value_){}
public webdsl.generated.domain.SetList replaceAllSongsLSongL_(java.util.List<webdsl.generated.domain.Song> value_){
this.replaceAllInSongs(value_);
return this;
}
public void removeFromSongsSong_(webdsl.generated.domain.Song value_){}
public void addToSongsSong_(webdsl.generated.domain.Song value_){}
public webdsl.generated.domain.SetList replaceAllAdminsSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInAdmins(value_);
return this;
}
public void removeFromAdminsUser_(webdsl.generated.domain.User value_){}
public void addToAdminsUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.SetList replaceAllMembersSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInMembers(value_);
return this;
}
public void removeFromMembersUser_(webdsl.generated.domain.User value_){}
public void addToMembersUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.SetList replaceAllPendingSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInPending(value_);
return this;
}
public void removeFromPendingUser_(webdsl.generated.domain.User value_){}
public void addToPendingUser_(webdsl.generated.domain.User value_){}
public void setDeadlineDate_(java.util.Date value_){}
}
