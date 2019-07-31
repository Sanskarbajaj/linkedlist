package linklist;

import linklist.circularlinklist.Node;

public class removeFromcircularlinklist extends circularlinklist {
	public int removefirst() throws Exception
	{ Node temp=null;
		if(isempty())
		{
			throw new Exception("khaali bro");
		}
		else if(size==1)
		{
			last=null;
		}
		else
		{
			 temp=last.next;
			last.next=temp.next;
			temp.next=null;
		}
		size--;
		return temp.data;
		
	}
	public int removelast() throws Exception
	{
		if(isempty())
		{
			throw new Exception("khaali bro");
			
		}
		int rv=this.last.data;
		Node nm2=getnodeat(size-2);
		nm2.next=last.next;
		nm2=last;
		size--;
		return rv;
	}

	public static void main(String[] args) throws Exception {
		circularlinklist list=new circularlinklist();
	 list.addlast(10);
	 list.addlast(20);
	 list.addlast(30);
	 list.addlast(40);
	 list.addlast(50);
	 list.display();
	 list.removefirst();
	 list.display();
	Node ans= list.getnodeat(2);
    System.out.println(ans.data);
    list.removelast();
    list.display();
    list.addlast(50);
    list.addat(2, 450);
  System.out.println(list.size());
	}

}
