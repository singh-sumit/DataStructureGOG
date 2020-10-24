package linkedList.mergeList;

public class SimpleSolution {
	
	static class LinkedList
	{
		private Node head;
		private int size;
		
		//constructor
		LinkedList()
		{
			head=new Node();
		}
		//method to push items
		public void push(int data)		//O(1)
		{
			//create node with data
			Node newNode=new Node(data);
			
			//Link newNode to head of list
			newNode.next=head.next;
			head.next=newNode;
			size++;
		}
		//method to printList		--O(n)
		public void printList()
		{
			//create nodal ref of curr to refer head of list
			Node curr=head.next;
			System.out.print("HEAD -> ");
			while(curr!=null)
			{
				System.out.print(curr.data+" -> ");
				curr=curr.next;			//update curr to point its next
			}
			System.out.println("null");
		}
		//method to merge List			--O(n)
		public void merge(LinkedList list1,LinkedList list2)
		{
			Node leftList=list1.head.next;		//node left for comparison in list1
			Node rightList=list2.head.next;
			
			this.size=list1.size+list2.size;	//size of new merged list
			
			Node curr=head;			//curr pointing to head of merged List
			
			//compare data of each list while either of node is not null
			while(leftList!=null && rightList!=null)
			{
				//compare data of each list
				if(leftList.data<=rightList.data)			//= for maintaining order
				{
					Node nodeToInsert=leftList;
					leftList=leftList.next;			//update leftList next node which is to be compared
					curr.next=nodeToInsert;
					curr=nodeToInsert;				//update curr
				}
				else			//right's data is small than left
				{
					Node nodeToInsert=rightList;
					rightList=rightList.next;
					curr.next=nodeToInsert;
					curr=nodeToInsert;
				}
			}
			//IF we're here it means either of list has been traversed completelty either's is lefted
			if(leftList!=null)			//IF leftList has some item lefted
			{
				Node nodeToInsert=leftList;
				curr.next=nodeToInsert;
				return;
			}
			if(rightList!=null)			//If rightList has some item lefted
			{
				Node nodeToInsert=rightList;
				curr.next=nodeToInsert;
				return;
			}
		}
		//Node class 
		class Node
		{
			private int data;
			private Node next;
			
			//constructor for initializing data items
			Node (int data)
			{
				this.data=data;
			}
			//for initializing dummy node to be pointed by head
			Node(){}
		}
	}
	public static void main(String[] args) {
		
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		
		//add items
		list1.push(15);
		list1.push(10);
		list1.push(5);
		
		list1.printList();
		System.out.println("Size of list-1: "+list1.size);
		//add items to list2
		list2.push(30);
		list2.push(25);
		list2.push(20);
		list2.push(15);
		list2.push(3);
		list2.push(2);
		
		list2.printList();
		System.out.println("Size of list-2: "+list2.size);
		
		//create a new List for merge List
		LinkedList list=new LinkedList();
		System.out.println("Item in Merge List :");
		list.printList();
		System.out.println("Size of Merged list: "+list.size);
		//call merge method
		list.merge(list1,list2);
		
		System.out.println("Item in Merge List :");
		list.printList();
		System.out.println("Size of Merged list: "+list.size);
	}

}
