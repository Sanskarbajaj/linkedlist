package linklist;

public class removefromdoublylinklist extends doublylinklist {
public int removefirst() throws Exception
{ Node temp=head;
	if(isempty())
	{
		throw new Exception("khaali h bro");
	}
	else if(size==1)
	{
		head=null;
		tail=null;
		return head.data;
	}
	else {
		head.next=null;
		head.next.prev=null;
		head=head.next;
	}
	size--;
	return temp.data; 
}
public int removelast() throws Exception
{ Node temp=tail;
	if(isempty())
	{
		throw new Exception("khaali h bro");
	}
	else if(size==1)
	{
		head=null;
		tail=null;
		return head.data;
	}
	else {
		tail.prev=null;
		tail.prev.next=null;
		tail=tail.prev;
	}
	size--;
	return temp.data; 
}

	public static void main(String[] args) {
		
	}

}
