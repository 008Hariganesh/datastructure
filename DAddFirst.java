class dl{
	int data;
  dl next;
	dl pre;
}
public class DAddFirst {
	dl head;
      public void addFirst(int val) {
      dl newNode=new dl();
      newNode.data=val;
      if(head==null) {
    	 head =newNode;
    	  newNode.pre=null;
    	  newNode.next=null;
      }else {
    	  newNode.pre=null;
    	  newNode.next=head;
    	  head.pre=newNode;
    	  head=newNode;
      }
      }
      public void print() {
    	  dl temp=head;
    	  dl last=null;
          System.out.println("forward");
          while(temp!=null) {
       	   System.out.println(temp.data);
       	   if(temp.next==null)
       		   last=temp;
       	   temp=temp.next;
          }
           temp=last;
           System.out.println("backward");
           while(temp!=null) {
        	   System.out.println(temp.data);
        	   temp=temp.pre;
           }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DAddFirst list=new DAddFirst();
      list.addFirst(10);
      list.addFirst(20);
      list.addFirst(30);
      list.addFirst(40);
      list.addFirst(50);
      list.print();
	}

}
