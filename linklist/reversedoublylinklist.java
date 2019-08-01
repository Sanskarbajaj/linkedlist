package linklist;

public class reversedoublylinklist extends doublylinklist{

	public void reversedoublyll(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			Node temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			head=curr;
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
	

	}

}
