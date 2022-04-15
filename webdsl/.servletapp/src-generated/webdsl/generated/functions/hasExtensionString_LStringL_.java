package webdsl.generated.functions;
@SuppressWarnings("all")public class hasExtensionString_LStringL_{
public static Boolean hasExtensionString_LStringL_(String file_,java.util.List<String> ext_){
java.util.List<String> split_=utils.StringType.splitWithSeparator(file_,".");
if(!(org.webdsl.tools.Utils.equal(split_.size(),null)||org.webdsl.tools.Utils.equal(1,null))&&split_.size()>1&&(!org.webdsl.tools.Utils.equal(ext_,null)&&ext_.contains((String)split_.get(split_.size()-1)))){
return true;
}
else {}
return false;
}
}
