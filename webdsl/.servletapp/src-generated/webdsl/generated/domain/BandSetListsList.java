package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class BandSetListsList extends utils.OwnedList<webdsl.generated.domain.SetList>{
public  BandSetListsList(){
super();
}
public  BandSetListsList(int anticipatedSize){
super(anticipatedSize);
}
public  BandSetListsList(java.util.List<webdsl.generated.domain.SetList> list){
super(list);
}
public  BandSetListsList(Object owner){
super(owner);
}
public  BandSetListsList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  BandSetListsList(Object owner,java.util.List<webdsl.generated.domain.SetList> list){
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
@Override public webdsl.generated.domain.SetList set(int index,webdsl.generated.domain.SetList newitem){
if(!doEvents){
return super.set(index,newitem);
}
else if(this.owner==null){
return super.set(index,newitem);
}
else if(newitem!=null&&!beingSet&&doEvents&&index>=0&&index<size()){
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("setLists");
webdsl.generated.domain.SetList olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.SetList item=olditem;
if(!contains(item)){
owner.removeFromSetListsSetList_(item);
}
item=newitem;
owner.addToSetListsSetList_(item);
beingSet=false;
return olditem;
}
return null;
}
@Override public void add(int index,webdsl.generated.domain.SetList item){
if(!doEvents){
super.add(index,item);
}
else if(this.owner==null){
super.add(index,item);
}
else if(item!=null&&!beingSet){
Band owner=(Band)this.owner;
owner.setChanged("setLists");
beingSet=true;
webdsl.generated.domain.SetList oldthing=webdsl.generated.domain.SetList._static_createEmpty_();
super.add(index,item);
owner.addToSetListsSetList_(item);
beingSet=false;
}
}
@Override public webdsl.generated.domain.SetList remove(int index){
if(!doEvents){
return super.remove(index);
}
else if(this.owner==null){
return super.remove(index);
}
else if(index>=0&&index<size()&&!beingSet&&doEvents){
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("setLists");
webdsl.generated.domain.SetList item=super.remove(index);
if(!contains(item)){
owner.removeFromSetListsSetList_(item);
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
