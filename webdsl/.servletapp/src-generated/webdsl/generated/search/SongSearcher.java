package webdsl.generated.search;
import utils.HibernateUtilConfigured;
import java.util.Collection;
import java.util.Date;
import org.apache.lucene.index.IndexReader;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.SearchFactory;
import org.hibernate.search.store.DirectoryProvider;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.store.Directory;
import org.apache.lucene.analysis.PerFieldAnalyzerWrapper;
import org.apache.lucene.analysis.Analyzer;
import org.webdsl.search.SearchSuggester;
import org.webdsl.search.QueryDef;
import com.browseengine.bobo.api.BoboIndexReader;
import com.browseengine.bobo.facets.FacetHandler;
public class SongSearcher extends org.webdsl.search.AbstractEntitySearcher<webdsl.generated.domain.Song,SongSearcher>{
private static Analyzer _analyzer;
private static Analyzer _highlightAnalyzer;
private static BoboIndexReader _boboReader;
static {
_highlightAnalyzer=org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory().getAnalyzer(webdsl.generated.domain.Song.class);
_analyzer=org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory().getAnalyzer(webdsl.generated.domain.Song.class);
}
public  SongSearcher(){
entityClass=webdsl.generated.domain.Song.class;
analyzer=_analyzer;
highlightAnalyzer=_highlightAnalyzer;
searchFields=defaultSearchFields=new String[]{"title"};
untokenizedFields=new String[]{};
mltSearchFields=new String[]{"title"};
rootQD=parentQD=currentQD=new QueryDef(Occur.SHOULD,new String[]{"title"});
}
public static SongSearcher fromString(String str){
return (SongSearcher)fromParamMap(utils.URLFilter.URLEncodingToParamMap(str));
}
public boolean instanceOf(String s){
return s.equals("SongSearcher");
}
public static java.util.ArrayList<String> spellSuggest(String toSuggestOn,java.util.List<String> fields,float accuracy,int noSug){
return spellSuggest(toSuggestOn,"",fields,accuracy,noSug);
}
public static java.util.ArrayList<String> spellSuggest(String toSuggestOn,String field,float accuracy,int noSug){
return spellSuggest(toSuggestOn,"",field,accuracy,noSug);
}
public static java.util.ArrayList<String> spellSuggest(String toSuggestOn,String namespace,java.util.List<String> fields,float accuracy,int noSug){
String baseDir=IndexManager.indexDirSpellCheck(webdsl.generated.domain.Song.class,"",namespace);
return SearchSuggester.findSpellSuggestions(webdsl.generated.domain.Song.class,baseDir,fields,noSug,accuracy,true,_analyzer,toSuggestOn);
}
public static java.util.ArrayList<String> spellSuggest(String toSuggestOn,String namespace,String field,float accuracy,int noSug){
String baseDir=IndexManager.indexDirSpellCheck(webdsl.generated.domain.Song.class,"",namespace);
return SearchSuggester.findSpellSuggestionsForField(webdsl.generated.domain.Song.class,baseDir,field,noSug,accuracy,true,_analyzer,toSuggestOn);
}
public static java.util.ArrayList<String> autoCompleteSuggest(String toSuggestOn,java.util.List<String> fields,int noSug){
return autoCompleteSuggest(toSuggestOn,"",fields,noSug);
}
public static java.util.ArrayList<String> autoCompleteSuggest(String toSuggestOn,String field,int noSug){
return autoCompleteSuggest(toSuggestOn,"",field,noSug);
}
public static java.util.ArrayList<String> autoCompleteSuggest(String toSuggestOn,String namespace,java.util.List<String> fields,int noSug){
String baseDir=IndexManager.indexDirAutoComplete(webdsl.generated.domain.Song.class,"",namespace);
return SearchSuggester.findAutoCompletions(webdsl.generated.domain.Song.class,baseDir,fields,noSug,_analyzer,toSuggestOn);
}
public static java.util.ArrayList<String> autoCompleteSuggest(String toSuggestOn,String namespace,String field,int noSug){
String baseDir=IndexManager.indexDirAutoComplete(webdsl.generated.domain.Song.class,"",namespace);
return SearchSuggester.findAutoCompletionsForField(webdsl.generated.domain.Song.class,baseDir,field,noSug,_analyzer,toSuggestOn);
}
public Class<?> fieldType(String field){
return String.class;
}
public SongSearcher reset(){
clearFacetSelection();
clearFieldFilters();
clearSorting();
removeNamespace();
rootQD=parentQD=currentQD=new QueryDef(Occur.SHOULD,new String[]{"title"});
mainQuery=null;
searchFields=defaultSearchFields;
nonDefaultSearchFields=false;
untokenizedFields=new String[]{};
mltSearchFields=new String[]{"title"};
updateLuceneQuery=true;
return this;
}
protected synchronized BoboIndexReader getBoboReader(String field){
if(_boboReader==null||_boboReader.getFacetHandler(field)==null){
renewBoboReader(discreteFacetRequests.keySet());
}
return _boboReader;
}
public final synchronized static void tryRenewBoboReader(){
if(_boboReader!=null){
renewBoboReader(new java.util.ArrayList<String>());
}
}
public final synchronized static void closeBoboReader(){
closeBoboReader(_boboReader);
}
public final synchronized static void closeBoboReader(BoboIndexReader reader){
if(reader!=null){
try{
reader.close();
}
catch(java.io.IOException ex){
org.webdsl.logging.Logger.error("Error when closing bobo facet reader",ex);
}
}
}
private final synchronized static void renewBoboReader(Collection<String> allFields){
org.webdsl.logging.Logger.info("renewing faceting index reader for entity "+"Song");
BoboIndexReader boboReader_OLD=_boboReader;
java.util.List<FacetHandler<?>> facetHandlerList=new java.util.ArrayList<FacetHandler<?>>();
if(_boboReader!=null){
facetHandlerList.addAll(_boboReader.getFacetHandlerMap().values());
}
java.util.Map<String,FacetHandler<?>> facetHandlerMap=new java.util.HashMap<String,FacetHandler<?>>();
for(FacetHandler<?> facetHandler:facetHandlerList){
facetHandlerMap.put(facetHandler.getName(),facetHandler);
}
for(String fld:allFields){
if(!facetHandlerMap.containsKey(fld))facetHandlerList.add(getFacetHandlerForField(fld));
}
SearchFactory searchFactory=org.hibernate.search.Search.getFullTextSession(utils.HibernateUtil.getCurrentSession()).getSearchFactory();
DirectoryProvider<?>[] providers=searchFactory.getDirectoryProviders(webdsl.generated.domain.Song.class);
try{
Directory idx=providers[0].getDirectory();
IndexReader reader=IndexReader.open(idx,true);
_boboReader=BoboIndexReader.getInstance(reader,facetHandlerList);
}
catch(java.io.IOException ex){
org.webdsl.logging.Logger.error("Error during renewal of bobo facet readers",ex);
}
finally{
closeBoboReader(boboReader_OLD);
}
}
}