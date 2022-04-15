package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @Entity @javax.persistence.Table(name="_TempFormData")@SuppressWarnings("all")class TempFormData implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled{
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
public static TempFormData _static_createEmpty_(){
TempFormData ent=new TempFormData();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static TempFormData _static_cast_(Object o){
return (TempFormData)org.webdsl.tools.Utils.cast(o,TempFormData.class);
}
public  TempFormData(){}
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
public String getNaturalId(){
return _id.toString();
}
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=utils.UUIDFieldBridge.class)protected java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
@Version @Column(name="version_opt_lock")protected Integer _version=1;
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
utils.ThreadLocalServlet.get().setSessionHasChanges();
if(!thepage.invalidateUserSpecificPageCache&&!thepage.invalidateAllPageCache){
thepage.invalidateUserSpecificPageCache("TempFormData"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"TempFormData"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("TempFormData")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?TempFormData.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):TempFormData.class.cast(o)).getId(),getId());
}
public TempFormData save(String webdslTypeName){
return this;
}
public TempFormData delete(){
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((TempFormData)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("TempFormData")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public TempFormData setCreated(java.util.Date newitem){
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
public TempFormData setModified(java.util.Date newitem){
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="TempFormData_users_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _users=new webdsl.generated.domain.TempFormDataUsersSet(this);
public java.util.Set<webdsl.generated.domain.User> getUsers(){
return _users;
}
public boolean isUsersUninitialized(){
return _users instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_users).wasInitialized();
}
public TempFormData setUsers(java.util.Set<webdsl.generated.domain.User> newitem){
setChanged("users");
_users=newitem;
return this;
}
@Transient boolean usersBeingSet=false;
public java.util.List<webdsl.generated.domain.User> getUsersList(){
return new java.util.ArrayList(getUsers());
}
public void setUsersList(java.util.List<webdsl.generated.domain.User> list1){
setChanged("users");
setUsers(new webdsl.generated.domain.TempFormDataUsersSet(this,list1));
}
public int getUsersLength(){
return getUsers().size();
}
public void removeFromUsers(webdsl.generated.domain.User item){
setChanged("users");
getUsers().remove(item);
}
public void replaceAllInUsers(java.util.Collection<webdsl.generated.domain.User> col){
removeAllFromUsers();
addAllToUsers(col);
}
public void removeAllFromUsers(){
org.hibernate.Hibernate.initialize(getUsers());
java.util.Iterator<webdsl.generated.domain.User> itt=getUsers().iterator();
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList(getUsers());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromUsers(itt.next());
}
}
public void addToUsers(webdsl.generated.domain.User item){
setChanged("users");
getUsers().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.User> addAllToUsers(java.util.Collection<webdsl.generated.domain.User> col){
java.util.List<webdsl.generated.domain.User> copy=new java.util.ArrayList<webdsl.generated.domain.User>(col);
java.util.Iterator<webdsl.generated.domain.User> it=copy.iterator();
while(it.hasNext()){
addToUsers(it.next());
}
return getUsers();
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="TempFormData_admins_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _admins=new webdsl.generated.domain.TempFormDataAdminsSet(this);
public java.util.Set<webdsl.generated.domain.User> getAdmins(){
return _admins;
}
public boolean isAdminsUninitialized(){
return _admins instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_admins).wasInitialized();
}
public TempFormData setAdmins(java.util.Set<webdsl.generated.domain.User> newitem){
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
setAdmins(new webdsl.generated.domain.TempFormDataAdminsSet(this,list2));
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="TempFormData_songs_Song")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.IndexColumn(name="\"TempFormDatasongsindex\"",base=0)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.List<webdsl.generated.domain.Song> _songs=new webdsl.generated.domain.TempFormDataSongsList(this);
public java.util.List<webdsl.generated.domain.Song> getSongs(){
return _songs;
}
public boolean isSongsUninitialized(){
return _songs instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_songs).wasInitialized();
}
public TempFormData setSongs(java.util.List<webdsl.generated.domain.Song> newitem){
setChanged("songs");
_songs=newitem;
return this;
}
@Transient boolean songsBeingSet=false;
public java.util.List<webdsl.generated.domain.Song> getSongsList(){
return new java.util.ArrayList(getSongs());
}
public void setSongsList(java.util.List<webdsl.generated.domain.Song> list3){
setChanged("songs");
setSongs(new webdsl.generated.domain.TempFormDataSongsList(this,list3));
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="TempFormData_pending_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _pending=new webdsl.generated.domain.TempFormDataPendingSet(this);
public java.util.Set<webdsl.generated.domain.User> getPending(){
return _pending;
}
public boolean isPendingUninitialized(){
return _pending instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_pending).wasInitialized();
}
public TempFormData setPending(java.util.Set<webdsl.generated.domain.User> newitem){
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
setPending(new webdsl.generated.domain.TempFormDataPendingSet(this,list4));
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="TempFormData_setlists_SetList")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.SetList> _setlists=new webdsl.generated.domain.TempFormDataSetlistsSet(this);
public java.util.Set<webdsl.generated.domain.SetList> getSetlists(){
return _setlists;
}
public boolean isSetlistsUninitialized(){
return _setlists instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_setlists).wasInitialized();
}
public TempFormData setSetlists(java.util.Set<webdsl.generated.domain.SetList> newitem){
setChanged("setlists");
_setlists=newitem;
return this;
}
@Transient boolean setlistsBeingSet=false;
public java.util.List<webdsl.generated.domain.SetList> getSetlistsList(){
return new java.util.ArrayList(getSetlists());
}
public void setSetlistsList(java.util.List<webdsl.generated.domain.SetList> list5){
setChanged("setlists");
setSetlists(new webdsl.generated.domain.TempFormDataSetlistsSet(this,list5));
}
public int getSetlistsLength(){
return getSetlists().size();
}
public void removeFromSetlists(webdsl.generated.domain.SetList item){
setChanged("setlists");
getSetlists().remove(item);
}
public void replaceAllInSetlists(java.util.Collection<webdsl.generated.domain.SetList> col){
removeAllFromSetlists();
addAllToSetlists(col);
}
public void removeAllFromSetlists(){
org.hibernate.Hibernate.initialize(getSetlists());
java.util.Iterator<webdsl.generated.domain.SetList> itt=getSetlists().iterator();
java.util.List<webdsl.generated.domain.SetList> copy=new java.util.ArrayList(getSetlists());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromSetlists(itt.next());
}
}
public void addToSetlists(webdsl.generated.domain.SetList item){
setChanged("setlists");
getSetlists().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.SetList> addAllToSetlists(java.util.Collection<webdsl.generated.domain.SetList> col){
java.util.List<webdsl.generated.domain.SetList> copy=new java.util.ArrayList<webdsl.generated.domain.SetList>(col);
java.util.Iterator<webdsl.generated.domain.SetList> it=copy.iterator();
while(it.hasNext()){
addToSetlists(it.next());
}
return getSetlists();
}
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "TempFormData";
}
public java.util.List<webdsl.generated.domain.SetList> allowedSetlists_(){
return (java.util.List<webdsl.generated.domain.SetList>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedPending_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.Song> allowedSongs_(){
return (java.util.List<webdsl.generated.domain.Song>)(java.util.List<?>)webdsl.generated.domain.Song.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedAdmins_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedUsers_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validateSetlists_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSetlists_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSetlists_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validatePending_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validatePending_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePending_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSongs_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSongs_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSongs_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateAdmins_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateAdmins_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAdmins_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateUsers_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateUsers_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateUsers_internalValidationExceptionMultiple_(v_);
return v_;
}
public void clear_(){
this.removeAllFromUsers();
this.removeAllFromAdmins();
this.removeAllFromSongs();
this.removeAllFromPending();
this.removeAllFromSetlists();
org.webdsl.logging.Logger.info("cleared temp");
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from TempFormData").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from TempFormData").list();
}
public webdsl.generated.domain.TempFormData TempFormData$this_(){
this.TempFormData_();
return this;
}
public void TempFormData_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public webdsl.generated.domain.TempFormData replaceAllUsersSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInUsers(value_);
return this;
}
public void removeFromUsersUser_(webdsl.generated.domain.User value_){}
public void addToUsersUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.TempFormData replaceAllAdminsSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInAdmins(value_);
return this;
}
public void removeFromAdminsUser_(webdsl.generated.domain.User value_){}
public void addToAdminsUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.TempFormData replaceAllSongsLSongL_(java.util.List<webdsl.generated.domain.Song> value_){
this.replaceAllInSongs(value_);
return this;
}
public void removeFromSongsSong_(webdsl.generated.domain.Song value_){}
public void addToSongsSong_(webdsl.generated.domain.Song value_){}
public webdsl.generated.domain.TempFormData replaceAllPendingSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInPending(value_);
return this;
}
public void removeFromPendingUser_(webdsl.generated.domain.User value_){}
public void addToPendingUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.TempFormData replaceAllSetlistsSSetListS_(java.util.Set<webdsl.generated.domain.SetList> value_){
this.replaceAllInSetlists(value_);
return this;
}
public void removeFromSetlistsSetList_(webdsl.generated.domain.SetList value_){}
public void addToSetlistsSetList_(webdsl.generated.domain.SetList value_){}
}
