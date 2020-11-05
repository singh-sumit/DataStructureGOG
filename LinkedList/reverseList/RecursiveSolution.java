package linkedList.reverseList;

public class RecursiveSolution {
	//class to implement Linked list
	static class LinkedList
	{
		private Node head;			//head ref for linked list
		private int size;
		
		//constructor
		public LinkedList()		//constructor to instantiate list & head
		{
			head=new Node();
		}
		
		//method to add new node to head of list	--O(1)
		public void push(String data)
		{
			//create a node with data
			Node newNode=new Node(data);
			
			//change ref of next of newNode to head's next
			newNode.next=head.next;
			//make head to refer newNode
			head.next=newNode;
			//increment size
			size++;
		}
		
		//method to reverse List			--O(n)
		//Initially we pass curr as head of list
		//Returns last node in original list	which is to be assigned to head's next
		public Node reverse(Node curr)
		{
			//Base condition
			//if head is not initialized i.e., head=null
			//Or curr is last node with it's next=nul THEN return curr(we need it)
			if(curr==null || curr.next==null)
				return curr;
			
			//If base condition hits THEN we get last node (which we need to preserve)
			//BUT before that we need to go till last node recursively
			//SO let rest stores ref which node it has recursed. and AT THE END last node it self
			Node rest=reverse(curr.next);
			
			//IF WE are here it means base case has hitten and curr is node before last node
			
			//SO make node ahead of curr to refer curr
			Node rightToCurr=curr.next;
			
			rightToCurr.next=curr;
			
			//make curr's next to ref null
			curr.next=null;
			
			//return lastNode ref from rest
			return rest;
		}
		//method to display items in list -O(n)
		public void printList()
		{
			//make curr to ref head's next
			Node curr=head.next;
			
			System.out.print("HEAD -> ");
			//Traverse till curr is not null
			while(curr!=null)
			{
				System.out.print(curr.name+" -> ");
				curr=curr.next;			//update curr to ref curr'next
			}
			System.out.println("null");
		}
		//class to implement Node
		class Node
		{
			private String name;
			private Node next;			//next ref of  node
			
			//constructor
			public Node() {}			//constructor to instantiate head to dummy node
			public Node(String data)	//to instantiate node with data provided
			{
				name=data;			
			}
		}
	}
	public static void main(String[] args) {
		//create instance of linkedList
		LinkedList list =new LinkedList();
		
		list.printList();
		System.out.println("Size of List :"+list.size);
		//push element
		list.push("Everest");
		list.push("Makalu");
		list.push("Ganesh");
		list.push("Annapurna");
		list.push("Manaslu");
		
		list.printList();
		System.out.println("Size of List :"+list.size);
		
		//Reverse list and store lastNode
		LinkedList.Node lastNode=list.reverse(list.head.next);
		//Assign lastNode to Head.next
		list.head.next=lastNode;
		
		list.printList();
	}

}
