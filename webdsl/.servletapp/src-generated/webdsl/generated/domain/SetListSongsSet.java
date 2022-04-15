package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class SetListSongsSet extends utils.OwnedSet<webdsl.generated.domain.Song>{
public  SetListSongsSet(){
super();
}
public  SetListSongsSet(int anticipatedSize){
super(anticipatedSize);
}
public  SetListSongsSet(java.util.List<webdsl.generated.domain.Song> list){
super(list);
}
public  SetListSongsSet(Object owner){
super(owner);
}
public  SetListSongsSet(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  SetListSongsSet(Object owner,java.util.List<webdsl.generated.domain.Song> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.Song> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.Song> it=col.iterator();
while(it.hasNext()){
add(it.next());
}
return true;
}
return super.addAll(col);
}
@Override public void clear(){
if(!doEvents){
super.clear();
}
else if(this.owner==null){
super.clear();
}
else if(!beingSet&&doEvents){
while(!isEmpty()){
remove(iterator().next());
}
}
}
@Override public boolean add(webdsl.generated.domain.Song item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
SetList owner=(SetList)this.owner;
owner.setChanged("songs");
beingSet=true;
webdsl.generated.domain.Song oldthing=webdsl.generated.domain.Song._static_createEmpty_();
boolean result=super.add(item);
owner.addToSongsSong_(item);
beingSet=false;
return result;
}
return false;
}
@Override public boolean remove(Object obj){
if(!doEvents){
return super.remove(obj);
}
else if(this.owner==null){
return super.remove(obj);
}
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.Song){
webdsl.generated.domain.Song item=(webdsl.generated.domain.Song)obj;
beingSet=true;
SetList owner=(SetList)this.owner;
owner.setChanged("songs");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromSongsSong_(item);
}
beingSet=false;
return result;
}
return false;
}
}
