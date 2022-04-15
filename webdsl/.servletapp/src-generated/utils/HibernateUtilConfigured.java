package utils;
import java.util.Properties;
import org.hibernate.*;import org.hibernate.type.*;import org.hibernate.cfg.*;import org.webdsl.*;import org.hibernate.event.*;import org.hibernate.event.def.*;import java.util.*;import java.io.*;import org.hibernate.dialect.Dialect;
import webdsl.generated.domain.*;@SuppressWarnings("unused")public class HibernateUtilConfigured extends utils.HibernateUtil{
private static final SessionFactory configuredSessionFactory;
private static Configuration annotationConfiguration;
static {
try{
utils.QueryOptimization.optimizationMode=0;
annotationConfiguration=new Configuration();
annotationConfiguration.addPackage("utils");
annotationConfiguration.addAnnotatedClass(utils.ApplicationContextProperty.class);
annotationConfiguration.addAnnotatedClass(utils.File.class);
annotationConfiguration.addPackage("webdsl.generated.domain");
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.dummy_webdsl_entity.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.Notification.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.NotificationType.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.QueuedEmail.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.RequestLogEntry.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SecurityContext.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionManager.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SessionMessage.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SetList.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SetListInvitation.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.Song.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.SongKey.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.TempFormData.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.User.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationException.class);
annotationConfiguration.addAnnotatedClass(webdsl.generated.domain.ValidationExceptionMultiple.class);
annotationConfiguration.setListener("load",new NarrowProxyByReusingImplementationLoadEventListener());
annotationConfiguration.setListener("save-update",new SetVersionSaveOrUpdateEventListener());
annotationConfiguration.setListener("flush-entity",new SetValidationEventListener());
annotationConfiguration.setListener("auto-flush",new FastAutoFlushEventListener());
annotationConfiguration.setInterceptor(new WebDSLInterceptor());
annotationConfiguration.buildMappings();
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.ValidationExceptionMultiple._exceptions").setTypeName("webdsl.generated.domain.ValidationExceptionMultipleExceptionsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SetList._songs").setTypeName("webdsl.generated.domain.SetListSongsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SetList._admins").setTypeName("webdsl.generated.domain.SetListAdminsOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SetList._members").setTypeName("webdsl.generated.domain.SetListMembersOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SetList._pending").setTypeName("webdsl.generated.domain.SetListPendingOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.TempFormData._users").setTypeName("webdsl.generated.domain.TempFormDataUsersOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.TempFormData._admins").setTypeName("webdsl.generated.domain.TempFormDataAdminsOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.TempFormData._songs").setTypeName("webdsl.generated.domain.TempFormDataSongsOwnedListType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.TempFormData._pending").setTypeName("webdsl.generated.domain.TempFormDataPendingOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.TempFormData._setlists").setTypeName("webdsl.generated.domain.TempFormDataSetlistsOwnedSetType");
annotationConfiguration.getCollectionMapping("webdsl.generated.domain.SessionManager._messages").setTypeName("webdsl.generated.domain.SessionManagerMessagesOwnedListType");
configuredSessionFactory=annotationConfiguration.buildSessionFactory();
org.webdsl.tools.Utils.handleSchemaCreateUpdate(configuredSessionFactory,annotationConfiguration);
}
catch(Throwable ex){
throw new ExceptionInInitializerError(ex);
}
}
protected static SessionFactory getConfiguredSessionFactory(){
return configuredSessionFactory;
}
public static Configuration getAnnotationConfiguration(){
return annotationConfiguration;
}
}
