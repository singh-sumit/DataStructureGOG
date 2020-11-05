package linkedList.reverseList;

import linkedList.reverseList.Solution.LinkedList;
import linkedList.reverseList.Solution.LinkedList.Node;

public class IterativeSolution {
	static class LinkedList
	{
		//field
		private Node head;
		private int size;
		//constructor
		public LinkedList()			//for instantiating linkedlist with head to object of dummy Node
		{
			
		}
		
		//method to push item to head of list
		public void push(String usr_name)
		{
			//create a node object with data
			Node newNode=new Node(usr_name);
			
			//Wire up newNode to head
				//Add REF of  head to newNode
				newNode.next=head;
				//Add newNode to head's ref
				head=newNode;
			//Increment size
				size++;
		}
		
		//method to print items		--O(n)
		public void printList()
		{
			Node curr=head;
			System.out.print("HEAD -> ");
			while(curr!=null)
			{
				System.out.print(curr.name+" -> ");
				curr=curr.next;
			}
			System.out.println("null");
		}
		
		//method to reverse node in linked list
		public Node reverse()
		{
			//create curr to ref to head
			Node curr=head;				//node1
			
			//create prev, and next to ref to null
			Node prev=null;
			Node next=null;
			
			while(curr!=null)
			{
				next=curr.next;		//node2					//null
				//change current node next to prev
				curr.next=prev;		//node1.next=null		//node2.next=node1
				
				//move both curr and prev one positon ahead
				prev=curr;			//node1					//node2
				curr=next;			//node2					//null
			}
			head=prev;
			return head;
		}
		
		//class to create a node
		class Node
		{
			//fields
			private String name;
			private Node next;
			
			//constructor
			public Node()		//for instantiating head to dummy Node object		
			{	}
			
			public Node(String name)		//for instantiating list item with data
			{
				this.name=name;
			}
		
		}
	}
		
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.push("Everest");
		list.push("Makalu");
		list.push("Manaslu");
		list.push("Mt.K2");
		list.push("Annapurna");
		list.push("Mt.Ganesh");
		
		list.printList();
		
		System.out.println("Size of list :"+list.size);
		
		list.reverse();
		
		list.printList();

	}

}
