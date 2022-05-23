package add;
class rrr{
	int data;
	rrr next;
}
class Middle {
	rrr head;
	public void addFirst(int val) {
		rrr newNode=new rrr();
		newNode.data=val;
		newNode.next=head;
		head=newNode;
		
	}
	public void print() {
		rrr temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void fMiddle() {
	       rrr b=head; 
	       rrr a=head;
	       
	        while(a!=null&&a.next!=null){
	        	a=a.next.next;
	        	b=b.next;
	        }
	        System.out.println("middle :" + b.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Middle list=new Middle();
	        list.addFirst(10);
	        list.addFirst(20);
	        list.addFirst(30);
	        list.addFirst(40);
	        list.addFirst(50);
	        list.addFirst(60);
	        list.print();
	        list.fMiddle();
        
	}

}
