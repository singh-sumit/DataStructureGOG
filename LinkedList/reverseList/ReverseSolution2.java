package linkedList.reverseList;

import linkedList.reverseList.IterativeSolution.LinkedList;

public class ReverseSolution2 {
	//class for implementing list of node (LinkedList)
	static class LinkedList
	{
		//fields
		private Node head;
		private int size;
		
		//constructor
		public LinkedList() {
							//dummy node refering to null object
		}
		//method to push items to list At head				-O(1)
		public void push(int val) 
		{
			//create node object for val
			Node newNode=new Node(val);
			
			//Add reference of head to newNode's next
			newNode.next=head;
			//Make head to refer newNode
			head=newNode;
			size++;
		}
		//method to display items in list				--O(n)
		public void printList()
		{
			//Make curr to refer what head is refering to.
			Node curr=head;
			
			System.out.print("HEAD -> ");
			//Traverse till curr hits null and print its data
			while(curr!=null)
			{
				System.out.print(curr.val+" -> ");
				curr=curr.next;			//update curr to refer curr's next node
			}
			System.out.println("null");
		}
		//method to reverse a item in linked list recursively tail-recursive
		public Node reverse(Node curr,Node prev)
		{
			//Base Condition
			if(curr==null)
				return head;
			if(curr.next==null)
			{
				head=curr;
				curr.next=prev;
				return head;
			}
			
//			prev=curr;
			//recurse
			reverse(curr.next,curr);
			
			curr.next=prev;
			return head;
		}
		//class for implementing Node
		class Node
		{
			//fields
			private int val;
			private Node next;
			
			//constructor
			public Node(int val) {
				this.val=val;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		//push items
		list.push(5);
		list.push(6);
		list.push(8);
		list.push(3);
		list.push(12);
		
		list.printList();
		
		System.out.println("Size of list :"+list.size);
		
		list.reverse(list.head,null);
		
		System.out.println("After reverse:");
		list.printList();

	}

}
