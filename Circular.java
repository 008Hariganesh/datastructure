package lCircular;
class Node{
	int data;
	Node next;
}
public class Circular {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head=new Node();
        Node middle=new Node();
        Node last=new Node();
        
        head.data=10;
        middle.data=20;
        last.data=30;
         
        head.next=middle;
        middle.next=last;
        last.next=head;
        
        Node temp=head;
        do {
        System.out.println(temp.data);	
        temp=temp.next;
        }while(temp!=head);
	}

}
