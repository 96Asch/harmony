package utils;
@SuppressWarnings({"unused","unchecked"})public class GlobalVariables{
private static org.hibernate.Session hibSession;
private static org.webdsl.lang.Environment env;
private static java.io.PrintWriter out=null;
private static java.util.UUID CId=null;
public static webdsl.generated.domain.SongKey getC(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey C=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,CId);
return C;
}
private static java.util.UUID CSId=null;
public static webdsl.generated.domain.SongKey getCS(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey CS=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,CSId);
return CS;
}
private static java.util.UUID DId=null;
public static webdsl.generated.domain.SongKey getD(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey D=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,DId);
return D;
}
private static java.util.UUID DFId=null;
public static webdsl.generated.domain.SongKey getDF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey DF=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,DFId);
return DF;
}
private static java.util.UUID DSId=null;
public static webdsl.generated.domain.SongKey getDS(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey DS=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,DSId);
return DS;
}
private static java.util.UUID EId=null;
public static webdsl.generated.domain.SongKey getE(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey E=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,EId);
return E;
}
private static java.util.UUID EFId=null;
public static webdsl.generated.domain.SongKey getEF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey EF=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,EFId);
return EF;
}
private static java.util.UUID FId=null;
public static webdsl.generated.domain.SongKey getF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey F=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,FId);
return F;
}
private static java.util.UUID FSId=null;
public static webdsl.generated.domain.SongKey getFS(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey FS=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,FSId);
return FS;
}
private static java.util.UUID GId=null;
public static webdsl.generated.domain.SongKey getG(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey G=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,GId);
return G;
}
private static java.util.UUID GFId=null;
public static webdsl.generated.domain.SongKey getGF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey GF=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,GFId);
return GF;
}
private static java.util.UUID GSId=null;
public static webdsl.generated.domain.SongKey getGS(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey GS=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,GSId);
return GS;
}
private static java.util.UUID AId=null;
public static webdsl.generated.domain.SongKey getA(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey A=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,AId);
return A;
}
private static java.util.UUID AFId=null;
public static webdsl.generated.domain.SongKey getAF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey AF=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,AFId);
return AF;
}
private static java.util.UUID ASId=null;
public static webdsl.generated.domain.SongKey getAS(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey AS=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,ASId);
return AS;
}
private static java.util.UUID BId=null;
public static webdsl.generated.domain.SongKey getB(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey B=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,BId);
return B;
}
private static java.util.UUID BFId=null;
public static webdsl.generated.domain.SongKey getBF(org.hibernate.Session hibSession){
webdsl.generated.domain.SongKey BF=(webdsl.generated.domain.SongKey)hibSession.load(webdsl.generated.domain.SongKey.class,BFId);
return BF;
}
private static java.util.UUID warningId=null;
public static webdsl.generated.domain.NotificationType getWarning(org.hibernate.Session hibSession){
webdsl.generated.domain.NotificationType warning=(webdsl.generated.domain.NotificationType)hibSession.load(webdsl.generated.domain.NotificationType.class,warningId);
return warning;
}
private static java.util.UUID invitationId=null;
public static webdsl.generated.domain.NotificationType getInvitation(org.hibernate.Session hibSession){
webdsl.generated.domain.NotificationType invitation=(webdsl.generated.domain.NotificationType)hibSession.load(webdsl.generated.domain.NotificationType.class,invitationId);
return invitation;
}
private static java.util.UUID errorId=null;
public static webdsl.generated.domain.NotificationType getError(org.hibernate.Session hibSession){
webdsl.generated.domain.NotificationType error=(webdsl.generated.domain.NotificationType)hibSession.load(webdsl.generated.domain.NotificationType.class,errorId);
return error;
}
private static webdsl.generated.domain.SongKey C=null;
private static void globalDeclarationC(){
try{
C=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("C");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationCPersist(){
utils.HibernateUtil.getCurrentSession().save(C);
ApplicationContextProperty id0=new ApplicationContextProperty();
id0.setName("C");
id0.setDatabaseId(C.getId());
utils.HibernateUtil.getCurrentSession().save(id0);
utils.GlobalVariables.CId=id0.getDatabaseId();
C.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
C=null;
}
private static webdsl.generated.domain.SongKey CS=null;
private static void globalDeclarationCS(){
try{
CS=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("C#");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationCSPersist(){
utils.HibernateUtil.getCurrentSession().save(CS);
ApplicationContextProperty id1=new ApplicationContextProperty();
id1.setName("CS");
id1.setDatabaseId(CS.getId());
utils.HibernateUtil.getCurrentSession().save(id1);
utils.GlobalVariables.CSId=id1.getDatabaseId();
CS.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
CS=null;
}
private static webdsl.generated.domain.SongKey D=null;
private static void globalDeclarationD(){
try{
D=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("D");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationDPersist(){
utils.HibernateUtil.getCurrentSession().save(D);
ApplicationContextProperty id2=new ApplicationContextProperty();
id2.setName("D");
id2.setDatabaseId(D.getId());
utils.HibernateUtil.getCurrentSession().save(id2);
utils.GlobalVariables.DId=id2.getDatabaseId();
D.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
D=null;
}
private static webdsl.generated.domain.SongKey DF=null;
private static void globalDeclarationDF(){
try{
DF=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("Db");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationDFPersist(){
utils.HibernateUtil.getCurrentSession().save(DF);
ApplicationContextProperty id3=new ApplicationContextProperty();
id3.setName("DF");
id3.setDatabaseId(DF.getId());
utils.HibernateUtil.getCurrentSession().save(id3);
utils.GlobalVariables.DFId=id3.getDatabaseId();
DF.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
DF=null;
}
private static webdsl.generated.domain.SongKey DS=null;
private static void globalDeclarationDS(){
try{
DS=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("D#");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationDSPersist(){
utils.HibernateUtil.getCurrentSession().save(DS);
ApplicationContextProperty id4=new ApplicationContextProperty();
id4.setName("DS");
id4.setDatabaseId(DS.getId());
utils.HibernateUtil.getCurrentSession().save(id4);
utils.GlobalVariables.DSId=id4.getDatabaseId();
DS.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
DS=null;
}
private static webdsl.generated.domain.SongKey E=null;
private static void globalDeclarationE(){
try{
E=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("E");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationEPersist(){
utils.HibernateUtil.getCurrentSession().save(E);
ApplicationContextProperty id5=new ApplicationContextProperty();
id5.setName("E");
id5.setDatabaseId(E.getId());
utils.HibernateUtil.getCurrentSession().save(id5);
utils.GlobalVariables.EId=id5.getDatabaseId();
E.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
E=null;
}
private static webdsl.generated.domain.SongKey EF=null;
private static void globalDeclarationEF(){
try{
EF=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("Eb");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationEFPersist(){
utils.HibernateUtil.getCurrentSession().save(EF);
ApplicationContextProperty id6=new ApplicationContextProperty();
id6.setName("EF");
id6.setDatabaseId(EF.getId());
utils.HibernateUtil.getCurrentSession().save(id6);
utils.GlobalVariables.EFId=id6.getDatabaseId();
EF.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
EF=null;
}
private static webdsl.generated.domain.SongKey F=null;
private static void globalDeclarationF(){
try{
F=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("F");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationFPersist(){
utils.HibernateUtil.getCurrentSession().save(F);
ApplicationContextProperty id7=new ApplicationContextProperty();
id7.setName("F");
id7.setDatabaseId(F.getId());
utils.HibernateUtil.getCurrentSession().save(id7);
utils.GlobalVariables.FId=id7.getDatabaseId();
F.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
F=null;
}
private static webdsl.generated.domain.SongKey FS=null;
private static void globalDeclarationFS(){
try{
FS=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("F#");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationFSPersist(){
utils.HibernateUtil.getCurrentSession().save(FS);
ApplicationContextProperty id8=new ApplicationContextProperty();
id8.setName("FS");
id8.setDatabaseId(FS.getId());
utils.HibernateUtil.getCurrentSession().save(id8);
utils.GlobalVariables.FSId=id8.getDatabaseId();
FS.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
FS=null;
}
private static webdsl.generated.domain.SongKey G=null;
private static void globalDeclarationG(){
try{
G=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("G");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationGPersist(){
utils.HibernateUtil.getCurrentSession().save(G);
ApplicationContextProperty id9=new ApplicationContextProperty();
id9.setName("G");
id9.setDatabaseId(G.getId());
utils.HibernateUtil.getCurrentSession().save(id9);
utils.GlobalVariables.GId=id9.getDatabaseId();
G.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
G=null;
}
private static webdsl.generated.domain.SongKey GF=null;
private static void globalDeclarationGF(){
try{
GF=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("Gb");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationGFPersist(){
utils.HibernateUtil.getCurrentSession().save(GF);
ApplicationContextProperty id10=new ApplicationContextProperty();
id10.setName("GF");
id10.setDatabaseId(GF.getId());
utils.HibernateUtil.getCurrentSession().save(id10);
utils.GlobalVariables.GFId=id10.getDatabaseId();
GF.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
GF=null;
}
private static webdsl.generated.domain.SongKey GS=null;
private static void globalDeclarationGS(){
try{
GS=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("G#");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationGSPersist(){
utils.HibernateUtil.getCurrentSession().save(GS);
ApplicationContextProperty id11=new ApplicationContextProperty();
id11.setName("GS");
id11.setDatabaseId(GS.getId());
utils.HibernateUtil.getCurrentSession().save(id11);
utils.GlobalVariables.GSId=id11.getDatabaseId();
GS.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
GS=null;
}
private static webdsl.generated.domain.SongKey A=null;
private static void globalDeclarationA(){
try{
A=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("A");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationAPersist(){
utils.HibernateUtil.getCurrentSession().save(A);
ApplicationContextProperty id12=new ApplicationContextProperty();
id12.setName("A");
id12.setDatabaseId(A.getId());
utils.HibernateUtil.getCurrentSession().save(id12);
utils.GlobalVariables.AId=id12.getDatabaseId();
A.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
A=null;
}
private static webdsl.generated.domain.SongKey AF=null;
private static void globalDeclarationAF(){
try{
AF=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("Ab");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationAFPersist(){
utils.HibernateUtil.getCurrentSession().save(AF);
ApplicationContextProperty id13=new ApplicationContextProperty();
id13.setName("AF");
id13.setDatabaseId(AF.getId());
utils.HibernateUtil.getCurrentSession().save(id13);
utils.GlobalVariables.AFId=id13.getDatabaseId();
AF.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
AF=null;
}
private static webdsl.generated.domain.SongKey AS=null;
private static void globalDeclarationAS(){
try{
AS=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("A#");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationASPersist(){
utils.HibernateUtil.getCurrentSession().save(AS);
ApplicationContextProperty id14=new ApplicationContextProperty();
id14.setName("AS");
id14.setDatabaseId(AS.getId());
utils.HibernateUtil.getCurrentSession().save(id14);
utils.GlobalVariables.ASId=id14.getDatabaseId();
AS.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
AS=null;
}
private static webdsl.generated.domain.SongKey B=null;
private static void globalDeclarationB(){
try{
B=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("B");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationBPersist(){
utils.HibernateUtil.getCurrentSession().save(B);
ApplicationContextProperty id15=new ApplicationContextProperty();
id15.setName("B");
id15.setDatabaseId(B.getId());
utils.HibernateUtil.getCurrentSession().save(id15);
utils.GlobalVariables.BId=id15.getDatabaseId();
B.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
B=null;
}
private static webdsl.generated.domain.SongKey BF=null;
private static void globalDeclarationBF(){
try{
BF=webdsl.generated.domain.SongKey._static_createEmpty_().SongKey$this_().setName("Bb");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationBFPersist(){
utils.HibernateUtil.getCurrentSession().save(BF);
ApplicationContextProperty id16=new ApplicationContextProperty();
id16.setName("BF");
id16.setDatabaseId(BF.getId());
utils.HibernateUtil.getCurrentSession().save(id16);
utils.GlobalVariables.BFId=id16.getDatabaseId();
BF.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
BF=null;
}
private static webdsl.generated.domain.NotificationType warning=null;
private static void globalDeclarationWarning(){
try{
warning=webdsl.generated.domain.NotificationType._static_createEmpty_().NotificationType$this_().setName("Warning");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationWarningPersist(){
utils.HibernateUtil.getCurrentSession().save(warning);
ApplicationContextProperty id17=new ApplicationContextProperty();
id17.setName("warning");
id17.setDatabaseId(warning.getId());
utils.HibernateUtil.getCurrentSession().save(id17);
utils.GlobalVariables.warningId=id17.getDatabaseId();
warning.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
warning=null;
}
private static webdsl.generated.domain.NotificationType invitation=null;
private static void globalDeclarationInvitation(){
try{
invitation=webdsl.generated.domain.NotificationType._static_createEmpty_().NotificationType$this_().setName("Invite");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationInvitationPersist(){
utils.HibernateUtil.getCurrentSession().save(invitation);
ApplicationContextProperty id18=new ApplicationContextProperty();
id18.setName("invitation");
id18.setDatabaseId(invitation.getId());
utils.HibernateUtil.getCurrentSession().save(id18);
utils.GlobalVariables.invitationId=id18.getDatabaseId();
invitation.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
invitation=null;
}
private static webdsl.generated.domain.NotificationType error=null;
private static void globalDeclarationError(){
try{
error=webdsl.generated.domain.NotificationType._static_createEmpty_().NotificationType$this_().setName("Error");
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationErrorPersist(){
utils.HibernateUtil.getCurrentSession().save(error);
ApplicationContextProperty id19=new ApplicationContextProperty();
id19.setName("error");
id19.setDatabaseId(error.getId());
utils.HibernateUtil.getCurrentSession().save(id19);
utils.GlobalVariables.errorId=id19.getDatabaseId();
error.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
error=null;
}
static boolean applicationContextPropertyExists(String name,java.util.List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
public static boolean globalvarsChecked=false;
public static void forceLoad(){
globalvarsChecked=false;
load();
}
public static void load(){
if(!globalvarsChecked){
out=new java.io.PrintWriter(System.out);
utils.ThreadLocalOut.push(out);
C=webdsl.generated.domain.SongKey._static_createEmpty_();
CS=webdsl.generated.domain.SongKey._static_createEmpty_();
D=webdsl.generated.domain.SongKey._static_createEmpty_();
DF=webdsl.generated.domain.SongKey._static_createEmpty_();
DS=webdsl.generated.domain.SongKey._static_createEmpty_();
E=webdsl.generated.domain.SongKey._static_createEmpty_();
EF=webdsl.generated.domain.SongKey._static_createEmpty_();
F=webdsl.generated.domain.SongKey._static_createEmpty_();
FS=webdsl.generated.domain.SongKey._static_createEmpty_();
G=webdsl.generated.domain.SongKey._static_createEmpty_();
GF=webdsl.generated.domain.SongKey._static_createEmpty_();
GS=webdsl.generated.domain.SongKey._static_createEmpty_();
A=webdsl.generated.domain.SongKey._static_createEmpty_();
AF=webdsl.generated.domain.SongKey._static_createEmpty_();
AS=webdsl.generated.domain.SongKey._static_createEmpty_();
B=webdsl.generated.domain.SongKey._static_createEmpty_();
BF=webdsl.generated.domain.SongKey._static_createEmpty_();
warning=webdsl.generated.domain.NotificationType._static_createEmpty_();
invitation=webdsl.generated.domain.NotificationType._static_createEmpty_();
error=webdsl.generated.domain.NotificationType._static_createEmpty_();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
utils.AbstractPageServlet ps=utils.ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> res=q.list();
if(!applicationContextPropertyExists("C",res)){
env.putGlobalVariable("C",C);
}
if(!applicationContextPropertyExists("CS",res)){
env.putGlobalVariable("CS",CS);
}
if(!applicationContextPropertyExists("D",res)){
env.putGlobalVariable("D",D);
}
if(!applicationContextPropertyExists("DF",res)){
env.putGlobalVariable("DF",DF);
}
if(!applicationContextPropertyExists("DS",res)){
env.putGlobalVariable("DS",DS);
}
if(!applicationContextPropertyExists("E",res)){
env.putGlobalVariable("E",E);
}
if(!applicationContextPropertyExists("EF",res)){
env.putGlobalVariable("EF",EF);
}
if(!applicationContextPropertyExists("F",res)){
env.putGlobalVariable("F",F);
}
if(!applicationContextPropertyExists("FS",res)){
env.putGlobalVariable("FS",FS);
}
if(!applicationContextPropertyExists("G",res)){
env.putGlobalVariable("G",G);
}
if(!applicationContextPropertyExists("GF",res)){
env.putGlobalVariable("GF",GF);
}
if(!applicationContextPropertyExists("GS",res)){
env.putGlobalVariable("GS",GS);
}
if(!applicationContextPropertyExists("A",res)){
env.putGlobalVariable("A",A);
}
if(!applicationContextPropertyExists("AF",res)){
env.putGlobalVariable("AF",AF);
}
if(!applicationContextPropertyExists("AS",res)){
env.putGlobalVariable("AS",AS);
}
if(!applicationContextPropertyExists("B",res)){
env.putGlobalVariable("B",B);
}
if(!applicationContextPropertyExists("BF",res)){
env.putGlobalVariable("BF",BF);
}
if(!applicationContextPropertyExists("warning",res)){
env.putGlobalVariable("warning",warning);
}
if(!applicationContextPropertyExists("invitation",res)){
env.putGlobalVariable("invitation",invitation);
}
if(!applicationContextPropertyExists("error",res)){
env.putGlobalVariable("error",error);
}
if(!applicationContextPropertyExists("C",res))globalDeclarationC();
if(!applicationContextPropertyExists("CS",res))globalDeclarationCS();
if(!applicationContextPropertyExists("D",res))globalDeclarationD();
if(!applicationContextPropertyExists("DF",res))globalDeclarationDF();
if(!applicationContextPropertyExists("DS",res))globalDeclarationDS();
if(!applicationContextPropertyExists("E",res))globalDeclarationE();
if(!applicationContextPropertyExists("EF",res))globalDeclarationEF();
if(!applicationContextPropertyExists("F",res))globalDeclarationF();
if(!applicationContextPropertyExists("FS",res))globalDeclarationFS();
if(!applicationContextPropertyExists("G",res))globalDeclarationG();
if(!applicationContextPropertyExists("GF",res))globalDeclarationGF();
if(!applicationContextPropertyExists("GS",res))globalDeclarationGS();
if(!applicationContextPropertyExists("A",res))globalDeclarationA();
if(!applicationContextPropertyExists("AF",res))globalDeclarationAF();
if(!applicationContextPropertyExists("AS",res))globalDeclarationAS();
if(!applicationContextPropertyExists("B",res))globalDeclarationB();
if(!applicationContextPropertyExists("BF",res))globalDeclarationBF();
if(!applicationContextPropertyExists("warning",res))globalDeclarationWarning();
if(!applicationContextPropertyExists("invitation",res))globalDeclarationInvitation();
if(!applicationContextPropertyExists("error",res))globalDeclarationError();
if(!applicationContextPropertyExists("C",res))globalDeclarationCPersist();
if(!applicationContextPropertyExists("CS",res))globalDeclarationCSPersist();
if(!applicationContextPropertyExists("D",res))globalDeclarationDPersist();
if(!applicationContextPropertyExists("DF",res))globalDeclarationDFPersist();
if(!applicationContextPropertyExists("DS",res))globalDeclarationDSPersist();
if(!applicationContextPropertyExists("E",res))globalDeclarationEPersist();
if(!applicationContextPropertyExists("EF",res))globalDeclarationEFPersist();
if(!applicationContextPropertyExists("F",res))globalDeclarationFPersist();
if(!applicationContextPropertyExists("FS",res))globalDeclarationFSPersist();
if(!applicationContextPropertyExists("G",res))globalDeclarationGPersist();
if(!applicationContextPropertyExists("GF",res))globalDeclarationGFPersist();
if(!applicationContextPropertyExists("GS",res))globalDeclarationGSPersist();
if(!applicationContextPropertyExists("A",res))globalDeclarationAPersist();
if(!applicationContextPropertyExists("AF",res))globalDeclarationAFPersist();
if(!applicationContextPropertyExists("AS",res))globalDeclarationASPersist();
if(!applicationContextPropertyExists("B",res))globalDeclarationBPersist();
if(!applicationContextPropertyExists("BF",res))globalDeclarationBFPersist();
if(!applicationContextPropertyExists("warning",res))globalDeclarationWarningPersist();
if(!applicationContextPropertyExists("invitation",res))globalDeclarationInvitationPersist();
if(!applicationContextPropertyExists("error",res))globalDeclarationErrorPersist();
org.hibernate.Query q2=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
java.util.List<ApplicationContextProperty> results=q2.list();
for(ApplicationContextProperty a:results){
if(a.getName().equals("C")){
CId=a.getDatabaseId();
}
if(a.getName().equals("CS")){
CSId=a.getDatabaseId();
}
if(a.getName().equals("D")){
DId=a.getDatabaseId();
}
if(a.getName().equals("DF")){
DFId=a.getDatabaseId();
}
if(a.getName().equals("DS")){
DSId=a.getDatabaseId();
}
if(a.getName().equals("E")){
EId=a.getDatabaseId();
}
if(a.getName().equals("EF")){
EFId=a.getDatabaseId();
}
if(a.getName().equals("F")){
FId=a.getDatabaseId();
}
if(a.getName().equals("FS")){
FSId=a.getDatabaseId();
}
if(a.getName().equals("G")){
GId=a.getDatabaseId();
}
if(a.getName().equals("GF")){
GFId=a.getDatabaseId();
}
if(a.getName().equals("GS")){
GSId=a.getDatabaseId();
}
if(a.getName().equals("A")){
AId=a.getDatabaseId();
}
if(a.getName().equals("AF")){
AFId=a.getDatabaseId();
}
if(a.getName().equals("AS")){
ASId=a.getDatabaseId();
}
if(a.getName().equals("B")){
BId=a.getDatabaseId();
}
if(a.getName().equals("BF")){
BFId=a.getDatabaseId();
}
if(a.getName().equals("warning")){
warningId=a.getDatabaseId();
}
if(a.getName().equals("invitation")){
invitationId=a.getDatabaseId();
}
if(a.getName().equals("error")){
errorId=a.getDatabaseId();
}
}
hibSession=null;
utils.ThreadLocalOut.popChecked(out);
out=null;
globalvarsChecked=true;
}
}
public static boolean initGlobalVars(org.webdsl.lang.Environment env,org.hibernate.Session hibSession){
env.putGlobalVariable("C",utils.GlobalVariables.getC(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("C")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("CS",utils.GlobalVariables.getCS(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("CS")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("D",utils.GlobalVariables.getD(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("D")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("DF",utils.GlobalVariables.getDF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("DF")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("DS",utils.GlobalVariables.getDS(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("DS")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("E",utils.GlobalVariables.getE(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("E")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("EF",utils.GlobalVariables.getEF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("EF")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("F",utils.GlobalVariables.getF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("F")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("FS",utils.GlobalVariables.getFS(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("FS")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("G",utils.GlobalVariables.getG(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("G")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("GF",utils.GlobalVariables.getGF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("GF")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("GS",utils.GlobalVariables.getGS(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("GS")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("A",utils.GlobalVariables.getA(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("A")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("AF",utils.GlobalVariables.getAF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("AF")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("AS",utils.GlobalVariables.getAS(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("AS")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("B",utils.GlobalVariables.getB(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("B")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("BF",utils.GlobalVariables.getBF(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("BF")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("warning",utils.GlobalVariables.getWarning(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("warning")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("invitation",utils.GlobalVariables.getInvitation(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("invitation")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("error",utils.GlobalVariables.getError(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("error")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
return true;
}
}
