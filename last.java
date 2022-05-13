package add;
class Node{
	int data;
	Node next;
}
public class last {
	Node head;
     public void addLast(int val){
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
     public void print() {
    	 Node temp=head;
    	 while(temp!=null) {
    	 System.out.println(temp.data);
    	 temp=temp.next;
    	 }
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      last list=new last();
      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      list.addLast(40);
      list.addLast(50);
      list.print();
	}

}
