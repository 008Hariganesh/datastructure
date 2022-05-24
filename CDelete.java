 class Node {
	Node next;
	int data;
}
public class CDelete {
   Node head;
	   public void add(int val) {
		   Node newNode=new Node();
		   newNode.data=val;
		   if(head==null) {
			   newNode.next=newNode;
			   head=newNode;
		   }else {
			   Node last=head;
			   while(last.next!=head){
				last=last.next;   
			   }
			   last.next=newNode;
			   newNode.next=head;
		   }
   }
	   public void delete(int key) {
		   if(head==null)
			   return;
		   if(head.data==key&& head.next==head) {
			  head=null; 
		   }else if(head.data==key) {
			   Node last=head;
			   while(last.next!=head) {
				   last=last.next;
			   }
			   }else {
				   Node current=head;
				   while(current.next != head)
		            {
		                if(current.next.data == key)
		                {
		                    current.next = current.next.next;
		                    break;
		                }
		                current = current.next;
		            }
		        }
		    }

		    public void print()
		    {
		        if(head == null)
		            return;

		        Node temp = head;

		        do
		        {
		            System.out.println(temp.data);
		            temp = temp.next;
		        }while(temp != head);
		    }
		   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CDelete list=new CDelete();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.print();
        System.out.println("Deleting...");
        list.delete(30);
        list.print();
	}

}
