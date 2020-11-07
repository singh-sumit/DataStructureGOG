package linkedList.single.swap;

public class Solution {
	/*linked List class for implementation*/
	static class LinkedList
	{
		private Node head;			//field
		
	//method to swap
	public void swap(int val1,int val2)
	{
		if(val1==val2)			//if value are same no need of swapping
			return ;
		
		//Traverse and find curr position of node with val and prev node
		Node prevX=null,currX=head;
		while(currX!=null && currX.val!=val1)
		{
			prevX=currX;
			currX=currX.next;
		}
		
		//Also for val2 node
		Node prevY=null,currY=head;
		while(currY!=null && currY.val!=val2)
		{
			prevY=currY;
			currY=currY.next;
		}
		
		if(currX==null || currY==null)	   //Either val1 or val2 is not present
			return ;
		
		if(prevX!=null)			//if currX is not head of list
		{
			prevX.next=currY;
		}
		else						//if currX is head
		{
			head=currY;
		}
		
		if(prevY!=null)
		{
			prevY.next=currX;
		}
		else {
			head=currX;
		}
		
		//change next of curr nodes
		Node temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
	}
		
		//method to display item in list		--O(n)
		public void printList(Node h)
		{
			//Refer curr to head of list
			Node curr=h;
			
			System.out.println("HEAD -> ");
			//Traverse till curr is not null
			while(curr!=null)
			{
				System.out.print(curr.val+" -> ");
				curr=curr.next;				//update curr to curr.next
			}
			System.out.println("null");
		}
		//method to push item in list			--O(1)
		public void push(int val)
		{
			//Allocate node object for value
			Node newNode=new Node(val);
			
			//Wire up newNode with head of list
			newNode.next=head;
			
			head=newNode;
		}
		
		/*class for implementing node*/
		class Node
		{
			private int val;				//field
			private Node next;
			
			public Node(int val)		//constructor
			{
				this.val=val;
			}
		}
	}
	public static void main(String[] args) {
		
		//linkedlist object instance
		LinkedList list =new LinkedList();
		
		//push item to list 
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		//display items
		list.printList(list.head);
		
//		String msg=(list.swap(1,5))?"Swap performed ":"One or both value missing ";
//		System.out.println(msg);
		
		list.swap(2,1);
		System.out.println("After swapping :");
		list.printList(list.head);
	}

}
