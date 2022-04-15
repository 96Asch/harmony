package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class SetListMembersSet extends utils.OwnedSet<webdsl.generated.domain.User>{
public  SetListMembersSet(){
super();
}
public  SetListMembersSet(int anticipatedSize){
super(anticipatedSize);
}
public  SetListMembersSet(java.util.List<webdsl.generated.domain.User> list){
super(list);
}
public  SetListMembersSet(Object owner){
super(owner);
}
public  SetListMembersSet(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  SetListMembersSet(Object owner,java.util.List<webdsl.generated.domain.User> list){
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
