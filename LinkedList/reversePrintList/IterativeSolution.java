package com.dataStructure.linkedList.reversePrintList;

import java.util.Stack;

public class IterativeSolution {
	/*linked list class */
	static class LinkedList
	{
		private Node head;				//field
		
		
		//method to revesvley print item in list ITERATIVELY			O(n)
		public void reversePrintList(Node head)
		{
			//store all node to stack
			Stack<Node>	stack=new Stack();
			
			//set curr pointer to head of list
			Node curr=head;
			//push item to stack until curr nodes next is null
			while(curr!=null)
			{
				stack.push(curr);
				curr=curr.next;				//update curr pointer to point next node of curr
			}
			
			
			//when stack is full start popping out item
			while(!stack.isEmpty())
			{
				Node popedNode=stack.pop();				//pop item indicated by top of stack
				
				System.out.print(popedNode.val+" -> ");
			}
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
		list.reversePrintList(list.head);
	}

}
