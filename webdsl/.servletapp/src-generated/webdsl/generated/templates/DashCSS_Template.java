package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
@SuppressWarnings("all")public class DashCSS_Template extends utils.TemplateServlet{
public static org.webdsl.lang.Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"DashCSS":keyOverwrite,DashCSS_Template.class);
utils.AbstractPageServlet.loadLiftedTemplateMap(DashCSS_Template.class);
return staticEnv;
}
public String getUniqueName(){
return "DashCSS";
}
public String getTemplateSignature(){
return "template DashCSS()";
}
public String getElementsContext(){
if(calledName==null){
return "DashCSS";
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
out.print(".icon {\n			width : 40px;\n			height: 40px;\n		}\n		\n		.invite-icon {\n			width : 15px;\n			height: 15px;\n		}\n		\n		.button-icon {\n		  width : 20px;\n		  height: 20px;\n		}\n		\n		.setlistinvite {\n		  background-color : #66ff66;\n		}\n		\n		.bandinvite {\n		  background-color : #ffcc66;\n		}\n		\n	  .block {\n	    display: block;\n	    margin-bottom: 20px;\n	  }\n	  \n	  input {\n	    max-width: 200px;\n	  }\n	  \n	  label {\n	    width: 300px;\n	  }\n	  \n	  .overflow-500 {\n	    max-height: 500px;\n      overflow: auto;\n	  }\n	  \n	  .overflow-200 {\n	    max-height: 200px;\n      overflow: auto;\n	  }\n	  \n    .overflow-400 {\n      max-height: 400px;\n      overflow: auto;\n    }	  \n		\n		.carddims {\n			-ms-overflow-style: none;  /* IE and Edge */\n      scrollbar-width: none;  /* Firefox */\n		  background-image: linear-gradient(to top, white, white),\n		    linear-gradient(to top, white, white),\n		    linear-gradient(to top, rgba(0, 0, 0, 0.25), rgba(255, 255, 255, 0)),\n		    linear-gradient(to bottom, rgba(0, 0, 0, 0.25), rgba(255, 255, 255, 0));\n		  background-position: bottom center, top center, bottom center, top center;\n		  background-color: white;\n		  background-repeat: no-repeat;\n		  background-size: 100% 20px, 100% 20px, 100% 10px, 100% 10px;\n		  background-attachment: local, local, scroll, scroll;\n		}\n		\n		.carddims::-webkit-scrollbar {\n		  display: none;\n		}\n		\n		textarea {\n      display: block;\n      min-height: 200px;\n      width: 50%;\n      max-height : 60vh;\n      overflow : auto;\n    }\n    .rendering-target {\n      font-family: monospace;\n      white-space: nowrap;\n      font-size: 1.0rem;\n      border: 1px solid #ccc;\n      overflow-wrap: break-word;\n      hyphens: manual;\n      padding: 10px;\n      min-height: 200px;\n      width: 50%;\n      max-height : 60vh;\n      overflow : auto;\n    }\n    .rendering-target:empty:before {\n      content: \"<Output...>\";\n      font-style: italic;\n      text-align: center;\n      font-size: 1.0rem;\n      display: block;\n      padding: 20px 0;\n      color: #ccc;\n    }\n    .rendering-target .command_block {\n      padding-bottom: 10px;\n    }\n    .rendering-target .command_block h1 {\n      font-size: 1.8rem;\n      margin:  0;\n      padding: 0;\n    }\n    .rendering-target .command_block h4 {\n      font-size: 1.4rem;\n      margin:  0;\n      padding: 0;\n    }\n    .rendering-target .command_block em.comment {\n      display: block;\n    }\n    .rendering-target .lyric_block {\n      column-count: 2;\n    }\n    .rendering-target .lyric_block .line {\n      -webkit-column-break-inside: avoid; /* Chrome, Safari */\n      page-break-inside: avoid;           /* Theoretically FF 20+ */\n      break-inside: avoid-column;         /* IE 11 */\n      display:table;                      /* Actually FF 20+ */\n    }\n    .rendering-target .lyric_block .chord {\n      color: #44f;\n      font-weight: bold;\n    }\n    @media print {\n      .rendering-target {\n        padding: 0;\n        border: none;\n      }\n    }\n    \n    .modal-lg {\n      min-width : 80%;\n      min-height : 75vh;\n    }\n    \n    \n  ");
out.print("</style>");
}
}
}
