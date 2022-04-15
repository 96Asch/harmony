package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class BandSetListsSet extends utils.OwnedSet<webdsl.generated.domain.SetList>{
public  BandSetListsSet(){
super();
}
public  BandSetListsSet(int anticipatedSize){
super(anticipatedSize);
}
public  BandSetListsSet(java.util.List<webdsl.generated.domain.SetList> list){
super(list);
}
public  BandSetListsSet(Object owner){
super(owner);
}
public  BandSetListsSet(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  BandSetListsSet(Object owner,java.util.List<webdsl.generated.domain.SetList> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.SetList> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.SetList> it=col.iterator();
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
@Override public boolean add(webdsl.generated.domain.SetList item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
Band owner=(Band)this.owner;
owner.setChanged("setLists");
beingSet=true;
webdsl.generated.domain.SetList oldthing=webdsl.generated.domain.SetList._static_createEmpty_();
boolean result=super.add(item);
owner.addToSetListsSetList_(item);
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
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.SetList){
webdsl.generated.domain.SetList item=(webdsl.generated.domain.SetList)obj;
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("setLists");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromSetListsSetList_(item);
}
beingSet=false;
return result;
}
return false;
}
}
