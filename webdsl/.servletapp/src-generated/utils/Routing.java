package utils;
public class Routing{
private static String c$119(java.util.List<String> urlargs__){
try{
Object v=urlargs__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$120(java.util.List<String> url__){
try{
Object v=url__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$121(String pagename__){
try{
Object v=pagename__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$122(java.util.List<String> pageargs__){
try{
Object v=pageargs__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
private static String c$123(java.util.List<String> url__){
try{
Object v=url__;
if(v==null){
return "";
}
else {
return v.toString();
}
}
catch(RuntimeException r){
return "";
}
}
static {
org.webdsl.logging.Logger.info("routing customization used: yes");
}
public static java.util.List<String> processRequest(java.util.List<String> urlargs_){
org.webdsl.logging.Logger.info(webdsl.generated.functions.baseUrl_.baseUrl_());
if(org.webdsl.tools.Utils.equal((String)urlargs_.get(0),"api")&&(!(org.webdsl.tools.Utils.equal(urlargs_.size(),null)||org.webdsl.tools.Utils.equal(1,null))&&urlargs_.size()>1)){
java.util.List<String> url_=utils.CollectionType.addAll(webdsl.generated.functions.apiapp_topdef0_typedlistCr0LStringL_.apiapp_topdef0_typedlistCr0LStringL_(urlargs_),urlargs_.subList(2,urlargs_.size()));
org.webdsl.logging.Logger.info(""+"[routing]: "+c$119(urlargs_)+" -> "+c$120(url_));
return url_;
}
else {
return null;
}
}
public static java.util.List<String> processNavigate(String appurl_,String pagename_,java.util.List<String> pageargs_){
if(org.webdsl.tools.Utils.equal(pagename_,"api")&&(!(org.webdsl.tools.Utils.equal(pageargs_.size(),null)||org.webdsl.tools.Utils.equal(0,null))&&pageargs_.size()>0)){
java.util.List<String> url_=utils.CollectionType.addAll(webdsl.generated.functions.apiapp_topdef0_typedlistCr1LStringL_String_.apiapp_topdef0_typedlistCr1LStringL_String_(pageargs_,appurl_),pageargs_.subList(1,pageargs_.size()));
org.webdsl.logging.Logger.info(""+"[construct]: "+c$121(pagename_)+"/"+c$122(pageargs_)+" -> "+c$123(url_));
return url_;
}
else {
return null;
}
}
}
