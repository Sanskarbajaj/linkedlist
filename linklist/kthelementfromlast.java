package linklist;

import java.util.LinkedList;

import linklist.linkedlistimplementation.Node;

public class kthelementfromlast extends linkedlistimplementation {
	public static int kthelementfromend(int k) throws Exception
	{ if(k<0||k>size)
	{
		throw new Exception("invalid index");
	}
	Node slow=head;Node fast =head;
	for(int i=0;i<k;i++)
	{
		fast=fast.next;
	}
	while(fast!=null)
	{
		slow=slow.next;
		fast=fast.next;
	}
		return slow.data;
	}
	public static void main(String[] args) throws Exception {
		linkedlistimplementation list=new linkedlistimplementation();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.display();
		System.out.println(kthelementfromend(2));
	}

}
