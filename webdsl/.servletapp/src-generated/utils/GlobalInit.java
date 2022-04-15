package utils;
public @SuppressWarnings({"unused","unchecked"})class GlobalInit{
private static webdsl.generated.domain.SongKey C=null;
private static webdsl.generated.domain.SongKey CS=null;
private static webdsl.generated.domain.SongKey D=null;
private static webdsl.generated.domain.SongKey DF=null;
private static webdsl.generated.domain.SongKey DS=null;
private static webdsl.generated.domain.SongKey E=null;
private static webdsl.generated.domain.SongKey EF=null;
private static webdsl.generated.domain.SongKey F=null;
private static webdsl.generated.domain.SongKey FS=null;
private static webdsl.generated.domain.SongKey G=null;
private static webdsl.generated.domain.SongKey GF=null;
private static webdsl.generated.domain.SongKey GS=null;
private static webdsl.generated.domain.SongKey A=null;
private static webdsl.generated.domain.SongKey AF=null;
private static webdsl.generated.domain.SongKey AS=null;
private static webdsl.generated.domain.SongKey B=null;
private static webdsl.generated.domain.SongKey BF=null;
private static webdsl.generated.domain.NotificationType warning=null;
private static webdsl.generated.domain.NotificationType invitation=null;
private static webdsl.generated.domain.NotificationType error=null;
private static org.hibernate.Session hibSession;
static boolean applicationContextPropertyExists(String name,java.util.List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
static java.io.PrintWriter out;
private static org.webdsl.lang.Environment env;
public static boolean initChecked=false;
public static void forceLoad(){
initChecked=false;
load();
}
public static void load(){
if(!initChecked){
hibSession=utils.HibernateUtil.getCurrentSession();
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
utils.AbstractPageServlet ps=utils.ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty where name = '__global__init__'");
java.util.List<ApplicationContextProperty> res=q.list();
if(res.isEmpty()){
initialize();
initActions();
ApplicationContextProperty flag=new ApplicationContextProperty();
flag.setName("__global__init__");
utils.HibernateUtil.getCurrentSession().save(flag);
}
utils.HibernateUtil.getCurrentSession().flush();
utils.ThreadLocalOut.popChecked(out);
out=null;
hibSession=null;
initChecked=true;
}
}
protected static void initialize(){
C=utils.GlobalVariables.getC(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("C",C);
CS=utils.GlobalVariables.getCS(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("CS",CS);
D=utils.GlobalVariables.getD(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("D",D);
DF=utils.GlobalVariables.getDF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("DF",DF);
DS=utils.GlobalVariables.getDS(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("DS",DS);
E=utils.GlobalVariables.getE(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("E",E);
EF=utils.GlobalVariables.getEF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("EF",EF);
F=utils.GlobalVariables.getF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("F",F);
FS=utils.GlobalVariables.getFS(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("FS",FS);
G=utils.GlobalVariables.getG(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("G",G);
GF=utils.GlobalVariables.getGF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("GF",GF);
GS=utils.GlobalVariables.getGS(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("GS",GS);
A=utils.GlobalVariables.getA(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("A",A);
AF=utils.GlobalVariables.getAF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("AF",AF);
AS=utils.GlobalVariables.getAS(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("AS",AS);
B=utils.GlobalVariables.getB(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("B",B);
BF=utils.GlobalVariables.getBF(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("BF",BF);
warning=utils.GlobalVariables.getWarning(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("warning",warning);
invitation=utils.GlobalVariables.getInvitation(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("invitation",invitation);
error=utils.GlobalVariables.getError(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("error",error);
}
public static void initActions(){}
}
