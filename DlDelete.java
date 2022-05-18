package add;
class Nod{
	int data;
	Nod next;
	Nod pre;
}
public class DlDelete {
      Nod head;
      public void add(int val) {
    	  Nod newNod=new Nod();
    	  newNod.data=val;
    	  if(head==null) {
    		  newNod.pre=null;
    		  newNod.next=null;
    		  head=newNod;
    	  }
    	  else {
    		  Nod last=head;
    		  while(last.next!=null) {
    			  last=last.next;
    		  }
    		  last.next=newNod;
    		  newNod.next=null;
    		  newNod.pre=last;
    	  }
      }
      public void delete(int key){
    	  if(head==null) {
    		  return;
    	  }
    	  Nod temp=head;
    	  while(temp!=null&& temp.data!=key) {
    		  temp=temp.next;
    	  }
    		  if(temp==null) {
    			 System.out.println("not found"); 
    	  }
    		  else if(temp==head){
    		  head=head.next;
    		  head.pre=null;
    	  }
    		  else if(temp.next==null) {
    			  temp.pre.next=null;
    		  } else {
    			  temp.pre.next=temp.next;
    			  temp.next.pre=temp.pre;
    		  }
      }
      public void print() {
    	  Nod temp=head;
    	  Nod last=null;
    	  System.out.println("forward");
    	  while(temp!=null) {
    		  System.out.println(temp.data);
    		  if(temp.next==null)
    			  last=temp;
    		  temp=temp.next;
    	  }
    	  System.out.println("backward");
    	  temp=last;
    	  while(temp!=null) {
    		  System.out.println(temp.data);
    		  temp=temp.pre;
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DlDelete list=new DlDelete();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		list.delete(20);
		list.print();
	}

}
