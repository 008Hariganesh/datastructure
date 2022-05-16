class Node{
	int data;
	Node next;
}
public class delete {
          Node head;
          public void hari(int val){
        	  Node newNode=new Node();
        	  newNode.data=val;
        	  newNode.next=null;
        	  if(head==null) {
        		  head=newNode;
        	  }else {
        		  Node lastNode=head;
        		  while(lastNode.next!=null) {
        			  lastNode=lastNode.next;
        		  }
        		  lastNode.next=newNode;
        	  }
          }
          public void find(int num){
        	  if(head.data==num) {
        		  head=head.next;
        	  }else {
        		  Node temp=head;
        		  while(temp.next!=null) {
        			  if(temp.next.data==num) {
        				  temp.next=temp.next.next;
        				  break;
        			  }else {
        				  temp=temp.next;
        			  }
        		  }
        	  }
          }
          public void print(){
        	  Node temp=head;
        	  while(temp!=null) {
        		  System.out.println(temp.data);
        		  temp=temp.next;
        	  }
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        delete list=new delete();
        list.hari(10);
        list.hari(20);
        list.hari(30);
        list.hari(40);
        list.hari(50);
        list.print();
        list.find(20);
        System.out.println("after");
        list.print();
	}

}
