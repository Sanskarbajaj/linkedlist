package linklist;

public class getmiddlenode extends linkedlistimplementation {
	public Node getmiddle()
	{
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null||fast.next.next==null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		

	}

}
