package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @org.hibernate.annotations.FilterDefs({})@SuppressWarnings("all")class SetListInvitation extends Notification implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static SetListInvitation _static_createEmpty_(){
SetListInvitation ent=new SetListInvitation();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static SetListInvitation _static_cast_(Object o){
return (SetListInvitation)org.webdsl.tools.Utils.cast(o,SetListInvitation.class);
}
public  SetListInvitation(){
instanceOfTypesSetListInvitation.add("SetListInvitation");
instanceOfTypesSetListInvitation.add("Notification");
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("SetListInvitation")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?SetListInvitation.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):SetListInvitation.class.cast(o)).getId(),getId());
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((SetListInvitation)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
@Transient java.util.List<String> instanceOfTypesSetListInvitation=new java.util.LinkedList<String>();
public boolean instanceOf(String s){
return instanceOfTypesSetListInvitation.contains(s);
}
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"SetListInvitation_toJoin\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.SetList _toJoin=null;
public webdsl.generated.domain.SetList getToJoin(){
return _toJoin;
}
public boolean isToJoinUninitialized(){
return _toJoin instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_toJoin).getHibernateLazyInitializer().isUninitialized();
}
public SetListInvitation setToJoin(webdsl.generated.domain.SetList newitem){
if(!toJoinBeingSet){
toJoinBeingSet=true;
setChanged("toJoin");
this.setToJoinSetList_(newitem);
webdsl.generated.domain.SetList olditem=_toJoin;
_toJoin=newitem;
toJoinBeingSet=false;
}
return this;
}
public void setToJoinNoEventsOrValidation(webdsl.generated.domain.SetList newitem){
setChanged("toJoin");
webdsl.generated.domain.SetList olditem=_toJoin;
_toJoin=newitem;
}
@Transient boolean toJoinBeingSet=false;
@javax.persistence.Column(name="\"_isAdmin\"")@org.hibernate.annotations.AccessType(value="field")protected Boolean _isAdmin=false;
public Boolean getIsAdmin(){
return _isAdmin;
}
public boolean isIsAdminUninitialized(){
return false;
}
public SetListInvitation setIsAdmin(Boolean newitem){
if(!isAdminBeingSet){
isAdminBeingSet=true;
setChanged("isAdmin");
this.setIsAdminBool_(newitem);
Boolean olditem=_isAdmin;
_isAdmin=newitem;
isAdminBeingSet=false;
}
return this;
}
public void setIsAdminNoEventsOrValidation(Boolean newitem){
setChanged("isAdmin");
Boolean olditem=_isAdmin;
_isAdmin=newitem;
}
@Transient boolean isAdminBeingSet=false;
public String get_WebDslEntityType(){
return "SetListInvitation";
}
public java.util.List<webdsl.generated.domain.SetList> allowedToJoin_(){
return (java.util.List<webdsl.generated.domain.SetList>)(java.util.List<?>)webdsl.generated.domain.SetList.$static$all_();
}
public void validateIsAdmin_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateIsAdmin_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateIsAdmin_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateToJoin_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateToJoin_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateToJoin_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDateSent_internalValidationExceptionMultiple_(v_);
this.validateIsAdmin_internalValidationExceptionMultiple_(v_);
this.validateMessage_internalValidationExceptionMultiple_(v_);
this.validateReceiver_internalValidationExceptionMultiple_(v_);
this.validateSender_internalValidationExceptionMultiple_(v_);
this.validateToJoin_internalValidationExceptionMultiple_(v_);
this.validateType_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SetListInvitation").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from SetListInvitation").list();
}
public static webdsl.generated.domain.SetListInvitation _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.SetListInvitation._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"SetListInvitation",prop_));
}
public webdsl.generated.domain.SetListInvitation SetListInvitation$this_(){
this.SetListInvitation_();
return this;
}
public void SetListInvitation_(){}
public void setToJoinSetList_(webdsl.generated.domain.SetList value_){}
public void setIsAdminBool_(Boolean value_){}
}
