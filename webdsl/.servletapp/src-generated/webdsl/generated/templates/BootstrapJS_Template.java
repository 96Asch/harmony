package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class BootstrapJS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"BootstrapJS":keyOverwrite,BootstrapJS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(BootstrapJS_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "BootstrapJS";
}
public String getTemplateSignature(){
return "template BootstrapJS()";
}
public String getElementsContext(){
if(calledName==null){
return "BootstrapJS";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementid="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
java.io.PrintWriter out=utils.ThreadLocalOut.peek();
if(RENDER_PHASE==phase){
out.print("<!-- Option 1: Bootstrap Bundle with Popper -->");
}
if(RENDER_PHASE==phase){
out.print("<script");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("src","https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("integrity","sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"));
out.print(org.webdsl.tools.Utils.showAttributeEscapeHtml("crossorigin","anonymous"));
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
out.print("</script>");
}
}
}
