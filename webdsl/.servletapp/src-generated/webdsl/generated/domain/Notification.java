package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Notification")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Notification implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static Notification _static_createEmpty_(){
Notification ent=new Notification();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static Notification _static_cast_(Object o){
return (Notification)org.webdsl.tools.Utils.cast(o,Notification.class);
}
public  Notification(){}
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
thepage.invalidateAllPageCache("Notification"+"."+prop);
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Notification"+"."+prop);
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Notification")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Notification.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Notification.class.cast(o)).getId(),getId());
}
public Notification save(String webdslTypeName){
setVersion(1);
if(utils.ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Notification delete(){
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
return getId().compareTo(((Notification)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Notification")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Notification setCreated(java.util.Date newitem){
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
public Notification setModified(java.util.Date newitem){
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
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Notification_sender\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _sender=null;
public webdsl.generated.domain.User getSender(){
return _sender;
}
public boolean isSenderUninitialized(){
return _sender instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_sender).getHibernateLazyInitializer().isUninitialized();
}
public Notification setSender(webdsl.generated.domain.User newitem){
if(!senderBeingSet){
senderBeingSet=true;
setChanged("sender");
this.setSenderUser_(newitem);
webdsl.generated.domain.User olditem=_sender;
_sender=newitem;
senderBeingSet=false;
}
return this;
}
public void setSenderNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("sender");
webdsl.generated.domain.User olditem=_sender;
_sender=newitem;
}
@Transient boolean senderBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Notification_receiver\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.User _receiver=null;
public webdsl.generated.domain.User getReceiver(){
return _receiver;
}
public boolean isReceiverUninitialized(){
return _receiver instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_receiver).getHibernateLazyInitializer().isUninitialized();
}
public Notification setReceiver(webdsl.generated.domain.User newitem){
if(!receiverBeingSet){
receiverBeingSet=true;
setChanged("receiver");
this.setReceiverUser_(newitem);
webdsl.generated.domain.User olditem=_receiver;
_receiver=newitem;
receiverBeingSet=false;
}
return this;
}
public void setReceiverNoEventsOrValidation(webdsl.generated.domain.User newitem){
setChanged("receiver");
webdsl.generated.domain.User olditem=_receiver;
_receiver=newitem;
}
@Transient boolean receiverBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Notification_type\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.NotificationType _type=null;
public webdsl.generated.domain.NotificationType getType(){
return _type;
}
public boolean isTypeUninitialized(){
return _type instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_type).getHibernateLazyInitializer().isUninitialized();
}
public Notification setType(webdsl.generated.domain.NotificationType newitem){
if(!typeBeingSet){
typeBeingSet=true;
setChanged("type");
this.setTypeNotificationType_(newitem);
webdsl.generated.domain.NotificationType olditem=_type;
_type=newitem;
typeBeingSet=false;
}
return this;
}
public void setTypeNoEventsOrValidation(webdsl.generated.domain.NotificationType newitem){
setChanged("type");
webdsl.generated.domain.NotificationType olditem=_type;
_type=newitem;
}
@Transient boolean typeBeingSet=false;
@javax.persistence.Column(name="\"_message\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected String _message="";
public String getMessage(){
return _message;
}
public boolean isMessageUninitialized(){
return false;
}
public Notification setMessage(String newitem){
if(!messageBeingSet){
messageBeingSet=true;
setChanged("message");
this.setMessageString_(newitem);
String olditem=_message;
_message=newitem;
messageBeingSet=false;
}
return this;
}
public void setMessageNoEventsOrValidation(String newitem){
setChanged("message");
String olditem=_message;
_message=newitem;
}
@Transient boolean messageBeingSet=false;
@Temporal(TemporalType.DATE)@javax.persistence.Column(name="\"_dateSent\"")@org.hibernate.annotations.AccessType(value="field")protected java.util.Date _dateSent=null;
public java.util.Date getDateSent(){
return _dateSent;
}
public boolean isDateSentUninitialized(){
return false;
}
public Notification setDateSent(java.util.Date newitem){
if(!dateSentBeingSet){
dateSentBeingSet=true;
setChanged("dateSent");
this.setDateSentDate_(newitem);
java.util.Date olditem=_dateSent;
_dateSent=newitem;
dateSentBeingSet=false;
}
return this;
}
public void setDateSentNoEventsOrValidation(java.util.Date newitem){
setChanged("dateSent");
java.util.Date olditem=_dateSent;
_dateSent=newitem;
}
@Transient boolean dateSentBeingSet=false;
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "Notification";
}
public java.util.List<webdsl.generated.domain.NotificationType> allowedType_(){
return (java.util.List<webdsl.generated.domain.NotificationType>)(java.util.List<?>)webdsl.generated.domain.NotificationType.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedReceiver_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public java.util.List<webdsl.generated.domain.User> allowedSender_(){
return (java.util.List<webdsl.generated.domain.User>)(java.util.List<?>)webdsl.generated.domain.User.$static$all_();
}
public void validateDateSent_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateDateSent_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDateSent_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateMessage_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getMessage(),null)&&(!(org.webdsl.tools.Utils.equal(this.getMessage().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getMessage().length()>255)){
v_.addToExceptions(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_().setMessage("Value exceeds maximum length ("+255+")"));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateMessage_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateMessage_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateType_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateType_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateType_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateReceiver_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateReceiver_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateReceiver_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSender_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateSender_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSender_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDateSent_internalValidationExceptionMultiple_(v_);
this.validateMessage_internalValidationExceptionMultiple_(v_);
this.validateReceiver_internalValidationExceptionMultiple_(v_);
this.validateSender_internalValidationExceptionMultiple_(v_);
this.validateType_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Notification").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Notification").list();
}
public static java.util.List<webdsl.generated.domain.Notification> _static_findByMessage_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Notification as g where g._message = :param0").setParameter("param0",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Notification> _static_findByMessageLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Notification as g where g._message like :param1").setParameter("param1",s_).list();
}
public static webdsl.generated.domain.Notification _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.Notification._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Notification",prop_));
}
public webdsl.generated.domain.Notification Notification$this_(){
this.Notification_();
return this;
}
public void Notification_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setSenderUser_(webdsl.generated.domain.User value_){}
public void setReceiverUser_(webdsl.generated.domain.User value_){}
public void setTypeNotificationType_(webdsl.generated.domain.NotificationType value_){}
public void setMessageString_(String value_){}
public void setDateSentDate_(java.util.Date value_){}
}
