class Node{
	int data;
	Node next;
}
public class LinkedList {
      Node head;
      public void hari(int val){
    	Node newNode=new Node();
    	newNode.data=val;
    	newNode.next=null;
    	if(head==null)
    		head=newNode;
    	else {
    		Node lastNode=head;
    	
    	while (lastNode.next!=null) {
    		lastNode=lastNode.next;	
    	}
    	 lastNode.next = newNode;
    	}
      }
      public boolean find(int num){
    	  Node temp=head;
    	  while(temp!=null) {
    		  if(temp.data==num) {
    			return true;
    		
    		  }
    		  temp=temp.next;
    	  }
		return false;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList list=new LinkedList();
          list.hari(10);
          list.hari(20);
          list.hari(30);
          list.hari(40);
          list.hari(50);
          if(list.find(30))
         System.out.println("found");
          else
        	  System.out.println("not found");
	}

}
