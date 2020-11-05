package com.dataStructure.linkedList.printList;

public class RecursiveSolution {
	
	/*linked list class*/
	static class LinkedList
	{
		//field
		private Node head;
		
		//method to display items in list				--O(n)
//		public void printList()
//		{
//			String printMess ="HEAD ->";
////			if(this.head!=null)
//				printMess+=displayRecursive(this.head,"");
//				
//			System.out.println(printMess);
//		}
//		public String displayRecursive(Node currHead,String msg)
//		{
//			if(currHead==null)
//				return msg+="null";
//			
//			msg+=currHead.val +" -> ";
//			return displayRecursive(currHead.next,msg);
//		}
		
		//recursive print item in list   			---O(n)
		public void printList(Node currHead)
		{
			if(currHead==null)		//Base condition
				return;
			
			//print mess
			System.out.print(currHead.val+" -> ");
			
			//recursive call printList for next curr node
			printList(currHead.next);
		}
		//method to push items to head of list 			-O(1)
		public void push(int val)
		{
			//Allocate a node object for value
			Node newNode=new Node(val);
			
			//Wire up newNode with head of list
			newNode.next=head;
			
			head=newNode;
		}
		
		//class for Node representation
		class Node
		{
			//fields
			private int val;
			private Node next;
			
			//constructor for initializing Node object with value provide
			public Node(int val)
			{
				this.val=val;
			}
		}
	}
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		//push item
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		
		list.printList(list.head);

	}

}
