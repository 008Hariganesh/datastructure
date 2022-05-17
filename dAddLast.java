class Al{
	int data;
	Al next;
	Al pre;
}
public class dAddLast {
      Al head;
      public void addLast(int val) {
    	  Al newAl=new Al();
    	  newAl.data=val;
    	  if(head==null) {
    		  newAl.next=null;
    		  newAl.pre=null;
    		  head=newAl;
    	  }else { 
    		  Al last=head;
    		  while(last.next!=null) {
    			  last=last.next;
    		  }
    		   last.next=newAl;
    		   newAl.pre=last;
    		   newAl.next=null;
    	  }
      }
      public void print() {
    	  Al temp=head;
    	  Al last=null;
    	  System.out.println("Forward");
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
       dAddLast list=new dAddLast();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       list.addLast(50);
       list.print();
	}

}
