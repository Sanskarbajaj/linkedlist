package linklist;

import linklist.linkedlistimplementation.Node;

public class reversedataiteratively extends linkedlistimplementation {
	
	public void reversedata()
	{
		int beg=0; int end=size-1;
		while(beg<end)
		{
			Node l=getnodeat(beg);
			Node r=getnodeat(end);
			int temp=l.data;
			l.data=r.data;
			r.data=temp;
			beg++;
			end--;
		}
	}
	public static void main(String[] args) throws Exception {
		
		linkedlistimplementation list =new linkedlistimplementation();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		list.display();
		list.reversedata();
		
		list.display();
	}

}
