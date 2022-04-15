package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class GlobalCSS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"GlobalCSS":keyOverwrite,GlobalCSS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(GlobalCSS_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "GlobalCSS";
}
public String getTemplateSignature(){
return "template GlobalCSS()";
}
public String getElementsContext(){
if(calledName==null){
return "GlobalCSS";
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
out.print("body {\n	    color : white;\n	    background-color : rgb(44, 52, 61);\n   }\n   \n   .front {\n	    position : relative;  \n	    z-index: 1000;\n   }\n   \n   .modal-content {\n      background-color: rgb(37 42 46);\n   }\n   \n   .modal-header {\n      background-color: rgb(0 0 0 / 53%);\n   }\n   \n   .form-control {\n      color: #edeff1;\n      background-color: #3c3c3c;\n      border: 2px solid #232628;\n   }\n   \n   .card {\n	    background-color: rgb(39 46 56);\n	    border: 3px solid rgb(44 52 61);\n   }\n   \n   .card-body {\n      padding: 0 0.4rem 0rem 0rem;\n   }\n   \n   .border {\n		  border: 3px solid #2c343d!important;\n	 }\n	 \n	 .wav-header {\n	    position: absolute;\n	    top: 0;\n	    left: 0;\n	    width: 100%;\n	    overflow: hidden;\n	    line-height: 0;\n	    \n   }\n	\n	 .wav-header svg {\n	    position: relative;\n	    display: block;\n	    width: calc(100% + 1.3px);\n	    height: 96px;\n	 }\n	 \n	 .split-top {\n	    position: absolute;\n	    top: 0;\n	    left: 0;\n	    width: 100%;\n	    overflow: hidden;\n	    line-height: 0;\n		}\n		\n		.split-top svg {\n		    position: relative;\n		    display: block;\n		    width: calc(177% + 1.3px);\n		    height: 301px;\n		}\n		\n		.split-top .shape-fill {\n		    fill: rgb(20, 128, 101);\n		}\n		\n		.searchheader {\n      	background-color: rgb(0 0 0 / 20%);	 \n      	border-top-left-radius: 0.25rem;\n        border-top-right-radius: 0.25rem; \n		}\n\n    .list-group-item {\n		    color: whitesmoke;\n		    background-color: rgb(37 48 64);\n    }\n   \n  ");
out.print("</style>");
}
}
}
