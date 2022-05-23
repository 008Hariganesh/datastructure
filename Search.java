package lCircular;
class Node{
	Node next;
	int data;
}

public class Search {
       Node head;
       public void addLast(int val){
    	   Node newNode=new Node();
    	   newNode.data=val;
    	   if(head==null) {
    		   newNode.next=newNode;
    		   head=newNode;
    	   }else {
    		   Node last=head;
    		   while(last.next!=head) {
    			   last=last.next;
    		   }
    		   last.next=newNode;
    		   newNode.next=head;
    	   }
       }
       public boolean search (int num) {
    	   if(head==null)
    		   return false;
    	   Node temp=head;
    	   do {
    		   if(temp.data==num)
    			   return true;
    		   temp=temp.next;
    	   }while(temp!=head);
    	   return false;
       }
       public void print() {
    	   Node temp=head;
    	   do {
    		   System.out.println(temp.data);
    		   temp=temp.next;
    	   }while(temp!=head);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Search list= new Search();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.print();
        if(list.search(30)) {
        	System.out.println("found");
        }else {
        	System.out.println("not found");
        }
	}

}
