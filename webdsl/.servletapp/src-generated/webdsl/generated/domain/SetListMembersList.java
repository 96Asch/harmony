package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class SetListMembersList extends utils.OwnedList<webdsl.generated.domain.User>{
public  SetListMembersList(){
super();
}
public  SetListMembersList(int anticipatedSize){
super(anticipatedSize);
}
public  SetListMembersList(java.util.List<webdsl.generated.domain.User> list){
super(list);
}
public  SetListMembersList(Object owner){
super(owner);
}
public  SetListMembersList(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  SetListMembersList(Object owner,java.util.List<webdsl.generated.domain.User> list){
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
SetList owner=(SetList)this.owner;
owner.setChanged("members");
beingSet=true;
webdsl.generated.domain.User oldthing=webdsl.generated.domain.User._static_createEmpty_();
boolean result=super.add(item);
owner.addToMembersUser_(item);
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
SetList owner=(SetList)this.owner;
owner.setChanged("members");
webdsl.generated.domain.User olditem=get(index);
super.set(index,newitem);
webdsl.generated.domain.User item=olditem;
if(!contains(item)){
owner.removeFromMembersUser_(item);
}
item=newitem;
owner.addToMembersUser_(item);
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
SetList owner=(SetList)this.owner;
owner.setChanged("members");
beingSet=true;
webdsl.generated.domain.User oldthing=webdsl.generated.domain.User._static_createEmpty_();
super.add(index,item);
owner.addToMembersUser_(item);
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
SetList owner=(SetList)this.owner;
owner.setChanged("members");
webdsl.generated.domain.User item=super.remove(index);
if(!contains(item)){
owner.removeFromMembersUser_(item);
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
SetList owner=(SetList)this.owner;
owner.setChanged("members");
boolean result=super.remove(item);
if(!contains(item)){
owner.removeFromMembersUser_(item);
}
beingSet=false;
return result;
}
return false;
}
}
