package lCircular;
class Don{
	Don next;
	int data;
}
public class CAddF {
          Don head;
          public void addFirst(int val) {
        	  Don newDon=new Don();
        	  newDon.data=val;
        	 if(head==null) {
        		 newDon.next=newDon;
        		 head=newDon;
        	 }else {
        		 Don last=head;
        		 while(last.next!=head) {
        			 last=last.next;
        		 }
        		 last.next=newDon;
        		 newDon.next=head;
        		 head=newDon;
        	 }
          }
          public void print() {
        	  if(head==null)
        		  return;
        	  Don temp=head;
        	  do {
        	  System.out.println(temp.data);
        	  temp=temp.next;
        	  }while(temp!=head);
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              CAddF list=new  CAddF();
              list.addFirst(10);
              list.addFirst(20);
              list.addFirst(30);
              list.addFirst(40);
              list.print();
	}
}
