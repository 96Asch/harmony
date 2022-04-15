package webdsl.generated.domain;
import webdsl.generated.search.UserSearcher;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_User")@org.hibernate.search.annotations.Indexed @org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class User implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery){
return _static_searchUser_(searchQuery,1000,0);
}
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery,int limit){
return _static_searchUser_(searchQuery,limit,0);
}
public static java.util.List<webdsl.generated.domain.User> _static_searchUser_(String searchQuery,int limit,int offset){
return new UserSearcher().query(searchQuery).setOffset(offset).setLimit(limit).results();
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
public static User _static_createEmpty_(){
User ent=new User();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static User _static_cast_(Object o){
return (User)org.webdsl.tools.Utils.cast(o,User.class);
}
public static webdsl.generated.domain.User _static_getUnique_(String ident){
webdsl.generated.domain.User result=(webdsl.generated.domain.User)utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.User.class).add(org.hibernate.criterion.Restrictions.eq("_"+"username",ident)).uniqueResult();
if(result!=null){
return result;
}
else {
webdsl.generated.domain.User newObject=webdsl.generated.domain.User._static_createEmpty_();
newObject.setUsernameNoEventsOrValidation(ident);
utils.HibernateUtil.getCurrentSession().save(newObject);
utils.HibernateUtil.getCurrentSession().flush();
return newObject;
}
}
public static boolean _static_isUnique_(webdsl.generated.domain.User object){
java.util.List<webdsl.generated.domain.User> results=(java.util.List<webdsl.generated.domain.User>)utils.HibernateUtil.getCurrentSession().createCriteria(webdsl.generated.domain.User.class).add(org.hibernate.criterion.Restrictions.eq("_"+"username",object.getUsername())).list();
if(results.size()>1||results.size()==1&&!results.get(0).getId().equals(object.getId())){
return false;
}
else {
return true;
}
}
public static boolean _static_isUniqueId_(String ident){
webdsl.generated.domain.User temp=webdsl.generated.domain.User._static_createEmpty_();
temp.setUsernameNoEventsOrValidation(ident);
return _static_isUnique_(temp);
}
public static boolean _static_isUniqueId_(String ident,webdsl.generated.domain.User object){
webdsl.generated.domain.User tempobject=new webdsl.generated.domain.User();
tempobject.setId(object.getId());
tempobject.setUsernameNoEventsOrValidation(ident);
return _static_isUnique_(tempobject);
}
public  User(){}
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
thepage.invalidateAllPageCache("User"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"User"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("User")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?User.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):User.class.cast(o)).getId(),getId());
}
public User save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public User delete(){
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
return getId().compareTo(((User)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("User")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public User setCreated(java.util.Date newitem){
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
public User setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_username\"",length=255)@org.hibernate.annotations.AccessType(value="field")@org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer=@org.hibernate.search.annotations.Analyzer(definition="default"),name="username")})protected String _username="";
public String getUsername(){
return _username;
}
public boolean isUsernameUninitialized(){
return false;
}
public User setUsername(String newitem){
if(!usernameBeingSet){
usernameBeingSet=true;
setChanged("username");
this.setUsernameString_(newitem);
String olditem=_username;
_username=newitem;
usernameBeingSet=false;
}
return this;
}
public void setUsernameNoEventsOrValidation(String newitem){
setChanged("username");
String olditem=_username;
_username=newitem;
}
@Transient boolean usernameBeingSet=false;
public String getNaturalId(){
return _username.toString();
}
@javax.persistence.Column(name="\"_email\"",length=255)@org.hibernate.annotations.AccessType(value="field")@org.hibernate.search.annotations.Fields({@org.hibernate.search.annotations.Field(analyzer=@org.hibernate.search.annotations.Analyzer(definition="default"),name="email")})protected String _email="";
public String getEmail(){
return _email;
}
public boolean isEmailUninitialized(){
return false;
}
public User setEmail(String newitem){
if(!emailBeingSet){
emailBeingSet=true;
setChanged("email");
this.setEmailEmail_(newitem);
String olditem=_email;
_email=newitem;
emailBeingSet=false;
}
return this;
}
public void setEmailNoEventsOrValidation(String newitem){
setChanged("email");
String olditem=_email;
_email=newitem;
}
@Transient boolean emailBeingSet=false;
@javax.persistence.Column(name="\"_avatarIndex\"")@org.hibernate.annotations.AccessType(value="field")protected Integer _avatarIndex=0;
public Integer getAvatarIndex(){
return _avatarIndex;
}
public boolean isAvatarIndexUninitialized(){
return false;
}
public User setAvatarIndex(Integer newitem){
if(!avatarIndexBeingSet){
avatarIndexBeingSet=true;
setChanged("avatarIndex");
this.setAvatarIndexInt_(newitem);
Integer olditem=_avatarIndex;
_avatarIndex=newitem;
avatarIndexBeingSet=false;
}
return this;
}
public void setAvatarIndexNoEventsOrValidation(Integer newitem){
setChanged("avatarIndex");
Integer olditem=_avatarIndex;
_avatarIndex=newitem;
}
@Transient boolean avatarIndexBeingSet=false;
@javax.persistence.Column(name="\"_password\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _password="";
public String getPassword(){
return _password;
}
public boolean isPasswordUninitialized(){
return false;
}
public User setPassword(String newitem){
if(!passwordBeingSet){
passwordBeingSet=true;
setChanged("password");
this.setPasswordSecret_(newitem);
String olditem=_password;
_password=newitem;
passwordBeingSet=false;
}
return this;
}
public void setPasswordNoEventsOrValidation(String newitem){
setChanged("password");
String olditem=_password;
_password=newitem;
}
@Transient boolean passwordBeingSet=false;
public String getName(){
if(getUsername()!=null){
return getUsername().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "User";
}
public void validatePassword_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!(!(org.webdsl.tools.Utils.equal(this.getPassword().length(),null)||org.webdsl.tools.Utils.equal(8,null))&&this.getPassword().length()>=8)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Password needs to be at least 8 characters"));
}
else {}
if(!org.webdsl.tools.Utils.equal(this.getPassword(),null)&&(!(org.webdsl.tools.Utils.equal(this.getPassword().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getPassword().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validatePassword_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePassword_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateAvatarIndex_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateAvatarIndex_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAvatarIndex_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateEmail_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getEmail(),null)&&(!(org.webdsl.tools.Utils.equal(this.getEmail().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getEmail().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateEmail_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateEmail_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateUsername_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getUsername(),null)&&(!(org.webdsl.tools.Utils.equal(this.getUsername().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getUsername().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
if(!(!org.webdsl.tools.Utils.equal(this,null)&&(!(org.webdsl.tools.Utils.equal(this.getUsername().length(),null)||org.webdsl.tools.Utils.equal(0,null))&&this.getUsername().length()>0))){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Username is required"));
}
else {}
if(!(!org.webdsl.tools.Utils.equal(this,null)&&webdsl.generated.domain.User._static_isUniqueId_(this.getUsername(),this))){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Username is already in use"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateUsername_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateUsername_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateAvatarIndex_internalValidationExceptionMultiple_(v_);
this.validateEmail_internalValidationExceptionMultiple_(v_);
this.validatePassword_internalValidationExceptionMultiple_(v_);
this.validateUsername_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from User").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from User").list();
}
public static webdsl.generated.domain.User _static_find_(String theid_){
java.util.List<webdsl.generated.domain.User> list_=utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._username = :param0").setParameter("param0",theid_).list();
if(!(org.webdsl.tools.Utils.equal(list_.size(),null)||org.webdsl.tools.Utils.equal(0,null))&&list_.size()>0){
return (webdsl.generated.domain.User)list_.get(0);
}
else {
return null;
}
}
public static java.util.List<webdsl.generated.domain.User> _static_findByUsername_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._username = :param1").setParameter("param1",prop_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByUsernameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._username like :param2").setParameter("param2",s_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByEmail_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._email = :param3").setParameter("param3",prop_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByEmailLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._email like :param4").setParameter("param4",s_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByPassword_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._password = :param5").setParameter("param5",prop_).list();
}
public static java.util.List<webdsl.generated.domain.User> _static_findByPasswordLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from User as g where g._password like :param6").setParameter("param6",s_).list();
}
public static webdsl.generated.domain.User _static_load_(String prop_){
return webdsl.generated.domain.User._static_find_(prop_);
}
public webdsl.generated.domain.User User$this_(){
this.User_();
return this;
}
public void User_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setUsernameString_(String value_){}
public void setEmailEmail_(String value_){}
public void setAvatarIndexInt_(Integer value_){}
public void setPasswordSecret_(String value_){}
}
