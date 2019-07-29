package linklist;

public class linkedlistimplementation {
	private class Node
	{
		int data;
		Node next;
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
		
	}
	Node head;
	Node tail;
	int size;
	public linkedlistimplementation() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void addfirst(int data)
	{
		Node node=new Node(data,this.head);
		if(this.size>=1)
		{
		this.head=node;
		}
		if(isempty())
		{
		   	this.head=node;
		   	this.tail=node;
		}
	this.size++;
	}
	public void addlast(int data)
	{
		Node node=new Node(data,null);
		if(isempty())
		{
			this.head=node;
			this.tail=node;
		}
		if(this.size>=1)
		{
			this.tail.next=node;
			this.tail=node;
		}
		size++;
	}

	public int getfirst() throws Exception
	{
		if(isempty())
		{
			throw new Exception("linklist is empty");
		}
		return this.head.data;
	}
	public int getlast() throws Exception
	{
		if(isempty())
		{
			throw new Exception("linklist is empty");
		}
		return this.tail.data;
	}
	public Node getnodeat(int index) throws Exception
	{
		if(index<0||index>size)
		{
			throw new Exception("invalid index");
		}
	  	int count =0;
	  	Node temp=head;
	  	while(count<index)
	  	{
	  		temp=temp.next;
	  		count++;
	  	}
	  	return temp;
	}
	public void addat(int data,int index) throws Exception
	{if(index<0||index>size)
	{
		throw new Exception("invalid index");
	}
	if(index==0)
	{
		addfirst(data);
	}
	else if(index==size)
	{
		addlast(data);
	}
	Node nm1=getnodeat(index-1);
	Node node =new Node(data,nm1.next);
	nm1.next=node;
	size++;
	}
	public int getat(int index) throws Exception
	{
		if(index<0||index>size)
		{
			throw new Exception("invalid index");
		}
		int count =0;
	  	Node temp=head;
	  	while(count<index)
	  	{
	  		temp=temp.next;
	  		count++;
	  	}
	  	return temp.data;
	}
	public int removefirst()
	{
		int rv=this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		size--;
		return rv;
	}
	public int removelast() throws Exception
	{
		int rv=this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm2=getnodeat(size-2);
			this.tail = nm2;
			this.tail.next = null;
			
		}
		size--;
		return rv;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}

	public static void main(String[] args) throws Exception {
		linkedlistimplementation list=new linkedlistimplementation();
		for(int i=0;i<10;i++)
		{
			list.addlast(i*1);
		}
		list.display();
		list.removefirst();
		list.removelast();
		list.display();
		

	}

}
