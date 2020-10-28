package linkedList.middle;

import linkedList.middle.Solution2SlowFastPointer.LinkedList;

public class CountSolution {
	//class for LinkedList
	static class LinkedList
	{
		private Node head;
		private int size;
		
		public LinkedList() {
			head=new Node();
		}
		//push item to list		-O(1)
		public void push(int data)
		{
			//create node for data
			Node newNode=new Node(data);
			//Link newNode with head
			newNode.next=head.next;
			head.next=newNode;
			size++;
		}
		//print item in list		-O(n)
		public void printList()
		{
			//create a refrence to head of list
			Node curr=head.next;
			
			System.out.print("HEAD -> ");
			
			//Traverse till curr hits null
			while(curr!=null)
			{
				System.out.print(curr.data+" -> ");
				curr=curr.next;			//update curr
			}
			System.out.println("null");
		}
		//find middle Node using count
		public Node getMiddleNode()
		{
			//set curr to refer head of list
			Node curr=head.next;
			int len=size;
			
			if(len<2)			//Only Node or it is empty
				return head;		//return head as middle node
			
			int hopCount=(len-1)/2;			//place of middle Node in 0-based indexing
			
			for(int i=0;i<hopCount;i++)
			{
				curr=curr.next;
			}
			
			return curr;			//curr is pointing to middle node 
		}
		//class for Node
		class Node{
			//fields
			private int data;
			private Node next;
			
			//constructor
			public Node() {}		//for instantiating dummy node for head
			public Node(int data) {		//for instantiating node with data
				this.data=data;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.push(5);
		list.push(10);
		list.push(15);
		list.push(2);
		list.push(19);
	
		list.printList();
		
		LinkedList.Node middleNode=list.getMiddleNode();
		
		System.out.println("Node is "+middleNode.data);

	}

}
