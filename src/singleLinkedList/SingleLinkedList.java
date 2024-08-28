package singleLinkedList;

// Single Linked List Implementation

public class SingleLinkedList {
	// Create head node
	Node head;

	// node class for node
	static class Node {
		// data variable & address variable
		int data;
		Node next;

		// parameterize constructor
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		// object of single linked list class
		SingleLinkedList list = new SingleLinkedList();

		// insert some elements in list
		list.insert(list, 23);
		list.insert(list, 78);
		list.insert(list, 900);
		list.insert(list, 745);
		list.insert(list, 0);
		list.insert(list, 98);
		list.insert(list, 2323);
		list.insert(list, 784);
		
		list.makeCycle(list);
		
		 
//		list.delete(list,784);
//		 
		// print list
//		list.traversal(list);

//		list.Reverse(list);

//		System.out.println("Reverse list");
//
//		list.traversal(list);
//		
//		System.out.print("Middle Element:   ");
//		
//		list.findMiddle(list);
////		
//	System.out.print("After deletting last node: ");
//		
//		list.deleteLast(list);
//		
//		list.traversal(list);
//		
//		list.detectCircle(list);
		
		System.out.println("List is has cycle: "+ list.detectCircle(list));

	}

	private void makeCycle(SingleLinkedList list) {

		System.out.println("make");
		Node currNode = head;
		
		while(currNode.next!=null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
			
		}
		
		
		currNode.next = head;
		
	}

	private boolean detectCircle(SingleLinkedList list) {
		 
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow == fast)
			return true ;
		else
			return false;
		
	}

	// method to insert element
	public SingleLinkedList insert(SingleLinkedList list, int data) {
		// creating new node with data
		Node newNode = new Node(data);

		// check if head does note have any data & insert data in head node
		if (list.head == null) {
			list.head = newNode;
		}

		// add data to next node, creating and iterate the list till the last node &
		// insert new node
		else {
			Node last = list.head;
			while (last.next != null)
				last = last.next;
			last.next = newNode;
		}
		return list;
	}

	// method for delete node
	SingleLinkedList delete(SingleLinkedList list, int data) {
		// check if list is empty
		if (list.head == null) {
			System.out.println("Deletion faild Empty linked list!");
		}
		// if head the data
		else if (list.head.data == data) {
			list.head = list.head.next;
		}
		// finding data in list and remove it
		else {
			Node temp = head, prev = null;
			while (temp.next != null) {
				if (temp.data == data) {
					prev.next = temp.next;
					break;
				} else {
					prev = temp;
					temp = temp.next;
				}
			}
			if (temp.next == null && temp.data == data) {
				prev.next = null;
			} else {
				System.out.println("Data not Found!");
			}
		}

		return list;
	}

	// method for print linked list
	public void traversal(SingleLinkedList list) {
		// check if head is null then print empty
		if (list.head == null)
			System.out.println("Empty!");

		// print all nodes data, creating new node that hold current node, iterate list
		// till the last node, print data of the current node & set next
		// node data to current node & print last node data
		else {
			Node node = list.head;

			while (node.next != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println(node.data);
		}
		System.out.println("!End");
	}

	public SingleLinkedList Reverse(SingleLinkedList list) {

		// if head is null or only one node
		if (head != null && head.next != null) {

			Node temp = head.next;// temp node to store next node

			head.next = null;// set head next to null

			while (temp.next != null) {

				Node temp1 = temp.next;// temp1 node to store next node of the temp

				temp.next = head;// set prev node address to next node

				head = temp; // set head to temp

				temp = temp1;// temp to temp1

			}

			temp.next = head;// set last node address with new list

			head = temp;

		}

		return list;
	}

	public void findMiddle(SingleLinkedList list) { 
		
		int count =0;
		
		Node res = head;
		
		while(head.next!=null) {
			count++;
			head = head.next;
		}
		
		for(int i = 0; i < (count/2) ; i++ ) {
			
			res = res.next;
			
		}
		
		System.out.println( res.data);
	}
	
	public SingleLinkedList deleteLast(SingleLinkedList list) {
		
		Node prev = head;
		
        while (prev.next.next != null) {
        	
        	prev = prev.next;
            
        }
        
        prev.next = null;
        
        
		return list;
	}
}
