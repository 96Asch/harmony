package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class BandAdminsList extends utils.OwnedList<webdsl.generated.domain.User>{
public  BandAdminsList(){
super();
}
public  BandAdminsList(int anticipatedSize){
super(anticipatedSize);
}
public  BandAdminsList(java.util.List<webdsl.generated.domain.User> list){
super(list);
}
public  BandAdminsList(Object owner){
super(owner);
}
public  BandAdminsList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  BandAdminsList(Object owner,java.util.List<webdsl.generated.domain.User> list){
super(owner,list);
}
@Override public boolean addAll(java.util.Collection<? extends webdsl.generated.domain.User> col){
if(!doEvents){
return super.addAll(col);
}
else if(this.owner==null){
return super.addAll(col);
}
else if(!beingSet&&doEvents){
java.util.Iterator<? extends webdsl.generated.domain.User> it=col.iterator();
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
@Override public boolean add(webdsl.generated.domain.User item){
if(!doEvents){
return super.add(item);
}
else if(this.owner==null){
return super.add(item);
}
else if(item!=null&&!beingSet&&doEvents){
Band owner=(Band)this.owner;
owner.setChanged("admins");
beingSet=true;
webdsl.generated.domain.User oldthing=webdsl.generated.domain.User._static_createEmpty_();
boolean result=super.add(item);
owner.addToAdminsUser_(item);
beingSet=false;
return result;
}
return false;
}
@Override public webdsl.generated.domain.User set(int index,webdsl.generated.domain.User newitem){
if(!doEvents){
return super.set(index,newitem);
}
else if(this.owner==null){
return super.set(index,newitem);
}
else if(newitem!=null&&!beingSet&&doEvents&&index>=0&&index<size()){
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("admins");
webdsl.generated.domain.User olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.User item=olditem;
if(!contains(item)){
owner.removeFromAdminsUser_(item);
}
item=newitem;
owner.addToAdminsUser_(item);
beingSet=false;
return olditem;
}
return null;
}
@Override public void add(int index,webdsl.generated.domain.User item){
if(!doEvents){
super.add(index,item);
}
else if(this.owner==null){
super.add(index,item);
}
else if(item!=null&&!beingSet){
Band owner=(Band)this.owner;
owner.setChanged("admins");
beingSet=true;
webdsl.generated.domain.User oldthing=webdsl.generated.domain.User._static_createEmpty_();
super.add(index,item);
owner.addToAdminsUser_(item);
beingSet=false;
}
}
@Override public webdsl.generated.domain.User remove(int index){
if(!doEvents){
return super.remove(index);
}
else if(this.owner==null){
return super.remove(index);
}
else if(index>=0&&index<size()&&!beingSet&&doEvents){
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("admins");
webdsl.generated.domain.User item=super.remove(index);
if(!contains(item)){
owner.removeFromAdminsUser_(item);
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
else if(obj!=null&&!beingSet&&doEvents&&obj instanceof webdsl.generated.domain.User){
webdsl.generated.domain.User item=(webdsl.generated.domain.User)obj;
beingSet=true;
Band owner=(Band)this.owner;
owner.setChanged("admins");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromAdminsUser_(item);
}
beingSet=false;
return result;
}
return false;
}
}
