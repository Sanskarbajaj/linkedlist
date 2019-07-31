package linklist;

import linklist.linkedlistimplementation.Node;

public class detectcycle extends linkedlistimplementation {
	public boolean detectloop()
	{
		Node slow=head,fast=head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
			if (fast == slow) {
				return true;
		}
	}
		return false;

	}

	public static void main(String[] args) {
		linkedlistimplementation list=new linkedlistimplementation();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.addlast(50);
		System.out.println(list.detectloop());
	}

}
