package com.dataStructure.linkedList.reversePrintList;

public class RecursiveSolution {
	/*linked list class */
	static class LinkedList
	{
		private Node head;				//field
		
		
		//method to revesvley print item in list RECURSIVLEY			O(n)
		public void recursiveReversePrintList(Node currHead)
		{
			if(currHead==null)			//Base condition
				return ;
			
			//recursively call for next of currHead
			recursiveReversePrintList(currHead.next);
			
			//After the base condition is met, control comes to point recursiveReversePrintList(lastNode)
			//so print val for that node
			//And again after that contro comes to recursiveRevesePrintList(secondLastNode)
			//again print val for that node
			
			System.out.print(currHead.val+" -> ");
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
		
//		push item
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		//print item iteratively
		list.recursiveReversePrintList(list.head);

	}

}
