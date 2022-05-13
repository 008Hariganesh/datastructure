package add;
class Node{
	int data;
	Node next;
}

public class Linkedlist {
Node head;
public void addFirst(int val) {
	Node newNode=new Node();
	newNode.data=val;
	newNode.next=head;
	head=newNode;
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
Linkedlist list=new Linkedlist();
list.addFirst(10);
list.addFirst(20);
list.addFirst(30);
list.addFirst(40);
list.addFirst(50);
list.print();
	}

}
