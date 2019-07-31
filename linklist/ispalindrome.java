package linklist;

import java.util.Stack;

public class ispalindrome extends linkedlistimplementation{
	public boolean ispalindrome(Node head)
	{  Node temp=this.head;
	Stack<Integer> stack=new Stack<Integer>();
		while(temp!=null)
		{
			stack.push(temp.data);
			temp=temp.next;
		}
		while(!stack.isEmpty())
		{ temp=head;
			   int ans=stack.pop();
			   if(ans==temp.data)
			   {
				temp=temp.next;   
			   }else
			   {
				   return false;
			   }
		}
		return true;	
	}

	public static void main(String[] args) {
		

	}

}
