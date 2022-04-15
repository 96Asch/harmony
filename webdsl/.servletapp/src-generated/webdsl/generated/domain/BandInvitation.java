package webdsl.generated.domain;
import javax.persistence.*;import webdsl.generated.templates.*;public @javax.persistence.Entity @org.hibernate.annotations.FilterDefs({})@SuppressWarnings("all")class BandInvitation extends Notification implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static BandInvitation _static_createEmpty_(){
BandInvitation ent=new BandInvitation();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public static BandInvitation _static_cast_(Object o){
return (BandInvitation)org.webdsl.tools.Utils.cast(o,BandInvitation.class);
}
public  BandInvitation(){
instanceOfTypesBandInvitation.add("BandInvitation");
instanceOfTypesBandInvitation.add("Notification");
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("BandInvitation")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?BandInvitation.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):BandInvitation.class.cast(o)).getId(),getId());
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((BandInvitation)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
@Transient java.util.List<String> instanceOfTypesBandInvitation=new java.util.LinkedList<String>();
public boolean instanceOf(String s){
return instanceOfTypesBandInvitation.contains(s);
}
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"BandInvitation_toJoin\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected webdsl.generated.domain.Band _toJoin=null;
public webdsl.generated.domain.Band getToJoin(){
return _toJoin;
}
public boolean isToJoinUninitialized(){
return _toJoin instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_toJoin).getHibernateLazyInitializer().isUninitialized();
}
public BandInvitation setToJoin(webdsl.generated.domain.Band newitem){
if(!toJoinBeingSet){
toJoinBeingSet=true;
setChanged("toJoin");
this.setToJoinBand_(newitem);
webdsl.generated.domain.Band olditem=_toJoin;
_toJoin=newitem;
toJoinBeingSet=false;
}
return this;
}
public void setToJoinNoEventsOrValidation(webdsl.generated.domain.Band newitem){
setChanged("toJoin");
webdsl.generated.domain.Band olditem=_toJoin;
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
public BandInvitation setIsAdmin(Boolean newitem){
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
return "BandInvitation";
}
public java.util.List<webdsl.generated.domain.Band> allowedToJoin_(){
return (java.util.List<webdsl.generated.domain.Band>)(java.util.List<?>)webdsl.generated.domain.Band.$static$all_();
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
this.validateFrom_internalValidationExceptionMultiple_(v_);
this.validateIsAdmin_internalValidationExceptionMultiple_(v_);
this.validateMessage_internalValidationExceptionMultiple_(v_);
this.validateTo_internalValidationExceptionMultiple_(v_);
this.validateToJoin_internalValidationExceptionMultiple_(v_);
this.validateType_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from BandInvitation").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from BandInvitation").list();
}
public static webdsl.generated.domain.BandInvitation _static_load_(java.util.UUID prop_){
return webdsl.generated.domain.BandInvitation._static_cast_(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"BandInvitation",prop_));
}
public webdsl.generated.domain.BandInvitation BandInvitation$this_(){
this.BandInvitation_();
return this;
}
public void BandInvitation_(){}
public void setToJoinBand_(webdsl.generated.domain.Band value_){}
public void setIsAdminBool_(Boolean value_){}
}
