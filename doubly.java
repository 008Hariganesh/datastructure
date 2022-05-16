class N{
	int data;
	N next;
	N pre;
}
public class doubly {
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N head,middle,last;
         head=new N();
        middle=new N();
       last=new N();
       head.data=10;
       middle.data=20;
       last.data=30;
       head.pre=null;
       head.next=middle;
       middle.pre=head;
       middle.next=last;
       last.pre=middle;
       last.next=null;
       
       N temp=head;
       System.out.println("forward");
       while(temp!=null) {
    	   System.out.println(temp.data);
    	   temp=temp.next;
       }
        temp=last;
       System.out.println("backward");
       while(temp!=null) {
    	   System.out.println(temp.data);
    	   temp=temp.pre;
       }
	}
}

