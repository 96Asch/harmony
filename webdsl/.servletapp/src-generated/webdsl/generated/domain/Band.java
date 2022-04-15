package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Band")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Band implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static Band _static_createEmpty_(){
Band ent=new Band();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static Band _static_cast_(Object o){
return (Band)org.webdsl.tools.Utils.cast(o,Band.class);
}
public  Band(){}
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
thepage.invalidateAllPageCache("Band"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Band"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Band")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Band.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Band.class.cast(o)).getId(),getId());
}
public Band save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Band delete(){
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
return getId().compareTo(((Band)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Band")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Band setCreated(java.util.Date newitem){
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
public Band setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_name\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _name="";
public String getName(){
return _name;
}
public boolean isNameUninitialized(){
return false;
}
public Band setName(String newitem){
if(!nameBeingSet){
nameBeingSet=true;
setChanged("name");
this.setNameString_(newitem);
String olditem=_name;
_name=newitem;
nameBeingSet=false;
}
return this;
}
public void setNameNoEventsOrValidation(String newitem){
setChanged("name");
String olditem=_name;
_name=newitem;
}
@Transient boolean nameBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Band_owner\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _owner=null;
public webdsl.generated.domain.User getOwner(){
return _owner;
}
public boolean isOwnerUninitialized(){
return _owner instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_owner).getHibernateLazyInitializer().isUninitialized();
}
public Band setOwner(webdsl.generated.domain.User newitem){
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="Band_setLists_SetList")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.SetList> _setLists=new webdsl.generated.domain.BandSetListsSet(this);
public java.util.Set<webdsl.generated.domain.SetList> getSetLists(){
return _setLists;
}
public boolean isSetListsUninitialized(){
return _setLists instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_setLists).wasInitialized();
}
public Band setSetLists(java.util.Set<webdsl.generated.domain.SetList> newitem){
setChanged("setLists");
_setLists=newitem;
return this;
}
@Transient boolean setListsBeingSet=false;
public java.util.List<webdsl.generated.domain.SetList> getSetListsList(){
return new java.util.ArrayList(getSetLists());
}
public void setSetListsList(java.util.List<webdsl.generated.domain.SetList> list1){
setChanged("setLists");
setSetLists(new webdsl.generated.domain.BandSetListsSet(this,list1));
}
public int getSetListsLength(){
return getSetLists().size();
}
public void removeFromSetLists(webdsl.generated.domain.SetList item){
setChanged("setLists");
getSetLists().remove(item);
}
public void replaceAllInSetLists(java.util.Collection<webdsl.generated.domain.SetList> col){
removeAllFromSetLists();
addAllToSetLists(col);
}
public void removeAllFromSetLists(){
org.hibernate.Hibernate.initialize(getSetLists());
java.util.Iterator<webdsl.generated.domain.SetList> itt=getSetLists().iterator();
java.util.List<webdsl.generated.domain.SetList> copy=new java.util.ArrayList(getSetLists());
while(itt.hasNext()){
itt.next();
itt.remove();
}
itt=copy.iterator();
while(itt.hasNext()){
removeFromSetLists(itt.next());
}
}
public void addToSetLists(webdsl.generated.domain.SetList item){
setChanged("setLists");
getSetLists().add(item);
if(_version>0){
item._version=Math.max(1,item._version);
}
}
public java.util.Set<webdsl.generated.domain.SetList> addAllToSetLists(java.util.Collection<webdsl.generated.domain.SetList> col){
java.util.List<webdsl.generated.domain.SetList> copy=new java.util.ArrayList<webdsl.generated.domain.SetList>(col);
java.util.Iterator<webdsl.generated.domain.SetList> it=copy.iterator();
while(it.hasNext()){
addToSetLists(it.next());
}
return getSetLists();
}
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="Band_admins_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _admins=new webdsl.generated.domain.BandAdminsSet(this);
public java.util.Set<webdsl.generated.domain.User> getAdmins(){
return _admins;
}
public boolean isAdminsUninitialized(){
return _admins instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_admins).wasInitialized();
}
public Band setAdmins(java.util.Set<webdsl.generated.domain.User> newitem){
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
setAdmins(new webdsl.generated.domain.BandAdminsSet(this,list2));
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
@ManyToMany(fetch=javax.persistence.FetchType.LAZY)@JoinTable(name="Band_members_User")@org.hibernate.annotations.Persister(impl=utils.BasicCollectionPersister.class)@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})protected java.util.Set<webdsl.generated.domain.User> _members=new webdsl.generated.domain.BandMembersSet(this);
public java.util.Set<webdsl.generated.domain.User> getMembers(){
return _members;
}
public boolean isMembersUninitialized(){
return _members instanceof org.hibernate.collection.PersistentCollection&&!((org.hibernate.collection.PersistentCollection)_members).wasInitialized();
}
public Band setMembers(java.util.Set<webdsl.generated.domain.User> newitem){
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
setMembers(new webdsl.generated.domain.BandMembersSet(this,list3));
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
@javax.persistence.Column(name="\"_description\"",length=1000000)@org.hibernate.annotations.AccessType(value="field")protected String _description="";
public String getDescription(){
return _description;
}
public boolean isDescriptionUninitialized(){
return false;
}
public Band setDescription(String newitem){
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
public String get_WebDslEntityType(){
return "Band";
}
public java.util.List<webdsl.generated.domain.User> allowedMembers_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedAdmins_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.SetList> allowedSetLists_(){
return (java.util.List<webdsl.generated.domain.SetList>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedOwner_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
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
public void validateSetLists_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSetLists_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSetLists_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateOwner_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateOwner_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateOwner_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateName_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getName(),null)&&(!(org.webdsl.tools.Utils.equal(this.getName().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getName().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateName_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAdmins_internalValidationExceptionMultiple_(v_);
this.validateDescription_internalValidationExceptionMultiple_(v_);
this.validateMembers_internalValidationExceptionMultiple_(v_);
this.validateName_internalValidationExceptionMultiple_(v_);
this.validateOwner_internalValidationExceptionMultiple_(v_);
this.validateSetLists_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Band").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Band").list();
}
public static java.util.List<webdsl.generated.domain.Band> _static_findByName_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Band as g where g._name = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Band> _static_findByNameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Band as g where g._name like :param1").setParameter("param1",s_).list();
}
public static java.util.List<webdsl.generated.domain.Band> _static_findByDescription_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Band as g where g._description = :param2").setParameter("param2",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Band> _static_findByDescriptionLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Band as g where g._description like :param3").setParameter("param3",s_).list();
}
public static webdsl.generated.domain.Band _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.Band._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Band",prop_));
}
public webdsl.generated.domain.Band Band$this_(){
this.Band_();
return this;
}
public void Band_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setNameString_(String value_){}
public void setOwnerUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.Band replaceAllSetListsSSetListS_(java.util.Set<webdsl.generated.domain.SetList> value_){
this.replaceAllInSetLists(value_);
return this;
}
public void removeFromSetListsSetList_(webdsl.generated.domain.SetList value_){}
public void addToSetListsSetList_(webdsl.generated.domain.SetList value_){}
public webdsl.generated.domain.Band replaceAllAdminsSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInAdmins(value_);
return this;
}
public void removeFromAdminsUser_(webdsl.generated.domain.User value_){}
public void addToAdminsUser_(webdsl.generated.domain.User value_){}
public webdsl.generated.domain.Band replaceAllMembersSUserS_(java.util.Set<webdsl.generated.domain.User> value_){
this.replaceAllInMembers(value_);
return this;
}
public void removeFromMembersUser_(webdsl.generated.domain.User value_){}
public void addToMembersUser_(webdsl.generated.domain.User value_){}
public void setDescriptionText_(String value_){}
}
