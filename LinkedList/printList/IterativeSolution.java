package com.dataStructure.linkedList.printList;

public class IterativeSolution {
	/*linked list class */
	static class LinkedList
	{
		private Node head;				//field
		
		
		//method to print item in list ITERATIVELY			O(n)
		public void printList(Node head)
		{
			//Refer curr to head of list
			Node curr=head;
			
			System.out.print("HEAD -> ");
			//Traverse through list until curr hits null
			while(curr!=null)
			{
				System.out.print(curr.val+" -> ");
				curr=curr.next;				//update curr to refer its next node
			}
			System.out.println("null");
		}
		//method to push item at Head of list				--O(1)
		public void push(int val)
		{
			//Allocate Node object for val provide
			Node newNode=new Node(val);
			
			//wire up newNode with head of list
			newNode.next=head;
			
			head=newNode;
		}
		
		/*class for Node representation*/
		class Node
		{
			private int val;			//field
			private Node next;	
			
			public Node(int val)			//constructor
			{
				this.val=val;
			}
		}
	}
	public static void main(String[] args) {
		
		//create instance of LinkedList class
		LinkedList list=new LinkedList();
		
		//push item
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		//print item iteratively
		list.printList(list.head);

	}

}
