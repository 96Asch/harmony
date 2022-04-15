package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class TempFormDataSongsList extends utils.OwnedList<webdsl.generated.domain.Song>{
public  TempFormDataSongsList(){
super();
}
public  TempFormDataSongsList(int anticipatedSize){
super(anticipatedSize);
}
public  TempFormDataSongsList(java.util.List<webdsl.generated.domain.Song> list){
super(list);
}
public  TempFormDataSongsList(Object owner){
super(owner);
}
public  TempFormDataSongsList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  TempFormDataSongsList(Object owner,java.util.List<webdsl.generated.domain.Song> list){
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
TempFormData owner=(TempFormData)this.owner;
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
@Override public webdsl.generated.domain.Song set(int index,webdsl.generated.domain.Song newitem){
if(!doEvents){
return super.set(index,newitem);
}
else if(this.owner==null){
return super.set(index,newitem);
}
else if(newitem!=null&&!beingSet&&doEvents&&index>=0&&index<size()){
beingSet=true;
TempFormData owner=(TempFormData)this.owner;
owner.setChanged("songs");
webdsl.generated.domain.Song olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.Song item=olditem;
if(!contains(item)){
owner.removeFromSongsSong_(item);
}
item=newitem;
owner.addToSongsSong_(item);
beingSet=false;
return olditem;
}
return null;
}
@Override public void add(int index,webdsl.generated.domain.Song item){
if(!doEvents){
super.add(index,item);
}
else if(this.owner==null){
super.add(index,item);
}
else if(item!=null&&!beingSet){
TempFormData owner=(TempFormData)this.owner;
owner.setChanged("songs");
beingSet=true;
webdsl.generated.domain.Song oldthing=webdsl.generated.domain.Song._static_createEmpty_();
super.add(index,item);
owner.addToSongsSong_(item);
beingSet=false;
}
}
@Override public webdsl.generated.domain.Song remove(int index){
if(!doEvents){
return super.remove(index);
}
else if(this.owner==null){
return super.remove(index);
}
else if(index>=0&&index<size()&&!beingSet&&doEvents){
beingSet=true;
TempFormData owner=(TempFormData)this.owner;
owner.setChanged("songs");
webdsl.generated.domain.Song item=super.remove(index);
if(!contains(item)){
owner.removeFromSongsSong_(item);
}
beingSet=false;
return item;
}
return null;
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
TempFormData owner=(TempFormData)this.owner;
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
