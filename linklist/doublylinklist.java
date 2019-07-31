package linklist;

public class doublylinklist {
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data,Node next,Node prev) {
		this.data=data;
		this.next=next;
		this.prev=prev;
		}
	}
	int size;
	Node head;
	Node tail;
	public doublylinklist() {
	int size=0;
	this.head=null;
	this.tail=null;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void addfirst(int value)
	{ Node node=new Node(value, null, null);
		if(isempty())
		{
			node.next=null;
			node.prev=null;
			head=node;
			tail=node;
			}
		else
		{
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
		}
		this.size++;
			
	}
	public void addlast(int value)
	{
		Node node=new Node(value,null,null);
		if(isempty())
		{
			node.next=null;
			node.prev=null;
			head=node;
			tail=node;
		}
		else
		{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		this.size++;
	}
	public void displayfwd()
	{  Node temp=this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("End");
		
	}
	public void displaybkwd()
	{  Node temp=this.tail;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
				temp=temp.prev;
	}
	System.out.println("End");
		
	}
	public static void main(String[] args)  {
		doublylinklist dlist=new doublylinklist();
		dlist.addfirst(10);
		dlist.addfirst(20);
		dlist.addfirst(30);
		dlist.addfirst(40);
		dlist.addfirst(50);
		dlist.addlast(60);
		dlist.addlast(70);
		dlist.addlast(80);
		dlist.addlast(90);
		dlist.displayfwd();
		dlist.displaybkwd();
		System.out.println(dlist.size);

}
}
