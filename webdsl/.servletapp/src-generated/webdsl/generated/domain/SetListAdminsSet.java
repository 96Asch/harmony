package webdsl.generated.domain;
@SuppressWarnings("unchecked")public class SetListAdminsSet extends utils.OwnedSet<webdsl.generated.domain.User>{
public  SetListAdminsSet(){
super();
}
public  SetListAdminsSet(int anticipatedSize){
super(anticipatedSize);
}
public  SetListAdminsSet(java.util.List<webdsl.generated.domain.User> list){
super(list);
}
public  SetListAdminsSet(Object owner){
super(owner);
}
public  SetListAdminsSet(Object owner,int anticipatedSize){
super(owner,anticipatedSize);
}
public  SetListAdminsSet(Object owner,java.util.List<webdsl.generated.domain.User> list){
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
