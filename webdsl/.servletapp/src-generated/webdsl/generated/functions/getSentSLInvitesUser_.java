package webdsl.generated.functions;
@SuppressWarnings("all")public class getSentSLInvitesUser_{
public static java.util.List<webdsl.generated.domain.SetListInvitation> getSentSLInvitesUser_(webdsl.generated.domain.User user_){
String username_=((webdsl.generated.domain.SecurityContext)utils.ThreadLocalPage.getEnv().getSessionVariable("securityContext")).getPrincipal().getUsername();
java.util.List<webdsl.generated.domain.Notification> invites_=utils.HibernateUtil.getCurrentSession().createQuery("from Notification as n where n._sender._username = :param0").setParameter("param0",username_).list();
java.util.List<webdsl.generated.domain.SetListInvitation> setlistInvites_=webdsl.generated.functions.getSentSLInvites_listCompr0LNotificationL_.getSentSLInvites_listCompr0LNotificationL_(invites_);
return setlistInvites_;
}
}
