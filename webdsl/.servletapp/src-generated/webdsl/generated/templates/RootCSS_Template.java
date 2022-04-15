package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class RootCSS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"RootCSS":keyOverwrite,RootCSS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(RootCSS_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "RootCSS";
}
public String getTemplateSignature(){
return "template RootCSS()";
}
public String getElementsContext(){
if(calledName==null){
return "RootCSS";
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
out.print("<style");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
out.print("input {\n     max-width: 200px;\n   }\n  \n  .highlight {\n    font-size: 1.5em;\n    text-transform: uppercase;\n    color: #4CAF50;\n  }\n  \n  block {\n    font-size: 2rem;\n  }\n  \n  .waves-top {\n    position: absolute;\n    top: 0;\n    left: 0;\n    width: 100%;\n    overflow: hidden;\n    line-height: 0;\n	}\n	\n	.waves-top svg {\n	    position: relative;\n	    display: block;\n	    width: calc(100% + 1.3px);\n	    height: 96px;\n	}\n	\n	.waves-top .shape-fill {\n	    fill: rgb(25 135 84);\n	}\n	\n	.waves-bottom {\n    position: absolute;\n    bottom: 0;\n    left: 0;\n    width: 100%;\n    overflow: hidden;\n    line-height: 0;\n    transform: rotate(180deg);\n	}\n	\n	.waves-bottom svg {\n	    position: relative;\n	    display: block;\n	    width: calc(125% + 1.3px);\n	    height: 65px;\n	    transform: rotateY(180deg);\n	}\n	\n	.waves-bottom .shape-fill {\n	    fill: rgb(25 135 84);\n	}\n  \n  ");
out.print("</style>");
}
}
}
