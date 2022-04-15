package utils;
import org.webdsl.lang.*;import java.util.*;public class EntityReflectionHelper{
public static void init(){
java.util.List<ReflectionEntity> reflectionentities=utils.DispatchServletHelper.reflectionentities;
ReflectionEntity ent;
ent=new ReflectionEntity("dummy_webdsl_entity",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("Notification",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,webdsl.generated.domain.User>("sender",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.Notification arg){
return arg.allowedSender_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,webdsl.generated.domain.User>("receiver",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.Notification arg){
return arg.allowedReceiver_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,webdsl.generated.domain.NotificationType>("type",false,null){
public java.util.List<webdsl.generated.domain.NotificationType> getAllowed(webdsl.generated.domain.Notification arg){
return arg.allowedType_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,String>("message",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Notification,java.util.Date>("dateSent",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("NotificationType",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.NotificationType,String>("name",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("QueuedEmail",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("body",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("to",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("cc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("bcc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("replyTo",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("from",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("subject",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("unsubscribeAddress",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("lastTry",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("RequestLogEntry",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,webdsl.generated.domain.User>("principal",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.RequestLogEntry arg){
return arg.allowedPrincipal_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("requestedURL",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("start",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("end",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("clientIP",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("clientPort",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("method",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("referer",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("userAgent",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SecurityContext",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,webdsl.generated.domain.User>("principal",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SecurityContext arg){
return arg.allowedPrincipal_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SecurityContext,Boolean>("loggedIn",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionManager",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.SessionMessage>("messages",false,null){
public java.util.List<webdsl.generated.domain.SessionMessage> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedMessages_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("lastUse",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("logsqlMessage",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("stayLoggedIn",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("sessionHasChanges",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("domain",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.UUID>("cookieValue",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.TempFormData>("tempFormData",false,null){
public java.util.List<webdsl.generated.domain.TempFormData> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedTempFormData_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.SecurityContext>("securityContext",false,null){
public java.util.List<webdsl.generated.domain.SecurityContext> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedSecurityContext_();
}
}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionMessage",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SetList",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,String>("title",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,webdsl.generated.domain.User>("owner",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SetList arg){
return arg.allowedOwner_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,String>("description",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,webdsl.generated.domain.Song>("songs",false,null){
public java.util.List<webdsl.generated.domain.Song> getAllowed(webdsl.generated.domain.SetList arg){
return arg.allowedSongs_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,webdsl.generated.domain.User>("admins",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SetList arg){
return arg.allowedAdmins_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,webdsl.generated.domain.User>("members",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SetList arg){
return arg.allowedMembers_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,webdsl.generated.domain.User>("pending",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.SetList arg){
return arg.allowedPending_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetList,java.util.Date>("deadline",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SetListInvitation","Notification",false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetListInvitation,webdsl.generated.domain.SetList>("toJoin",false,null){
public java.util.List<webdsl.generated.domain.SetList> getAllowed(webdsl.generated.domain.SetListInvitation arg){
return arg.allowedToJoin_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SetListInvitation,Boolean>("isAdmin",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("Song",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,String>("title",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,String>("subtitle",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,Integer>("bpm",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,webdsl.generated.domain.SongKey>("key",false,null){
public java.util.List<webdsl.generated.domain.SongKey> getAllowed(webdsl.generated.domain.Song arg){
return arg.allowedKey_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,Integer>("timeSignature1",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,Integer>("timeSignature2",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,String>("genre",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,String>("chordRaw",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,utils.File>("refTrack",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,webdsl.generated.domain.User>("owner",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.Song arg){
return arg.allowedOwner_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Song,Boolean>("public",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SongKey",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SongKey,String>("name",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("TempFormData",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,webdsl.generated.domain.User>("users",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.TempFormData arg){
return arg.allowedUsers_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,webdsl.generated.domain.User>("admins",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.TempFormData arg){
return arg.allowedAdmins_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,webdsl.generated.domain.Song>("songs",false,null){
public java.util.List<webdsl.generated.domain.Song> getAllowed(webdsl.generated.domain.TempFormData arg){
return arg.allowedSongs_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,webdsl.generated.domain.User>("pending",false,null){
public java.util.List<webdsl.generated.domain.User> getAllowed(webdsl.generated.domain.TempFormData arg){
return arg.allowedPending_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.TempFormData,webdsl.generated.domain.SetList>("setlists",false,null){
public java.util.List<webdsl.generated.domain.SetList> getAllowed(webdsl.generated.domain.TempFormData arg){
return arg.allowedSetlists_();
}
}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("User",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("username",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("email",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,Integer>("avatarIndex",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.User,String>("password",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationException",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("message",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationExceptionMultiple",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,webdsl.generated.domain.ValidationException>("exceptions",false,null){
public java.util.List<webdsl.generated.domain.ValidationException> getAllowed(webdsl.generated.domain.ValidationExceptionMultiple arg){
return arg.allowedExceptions_();
}
}
);
ReflectionEntity.add(ent);
org.webdsl.logging.Logger.info("number of entities: "+reflectionentities.size());
}
}
