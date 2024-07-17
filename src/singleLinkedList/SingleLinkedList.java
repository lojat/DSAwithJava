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
		 
		list.delete(list,784);
		 
		// print list
		list.traversal(list);

	}

	// method to insert element
	SingleLinkedList insert(SingleLinkedList list, int data) {
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
		//check if list is empty
		if (list.head == null) {
			System.out.println("Deletion faild Empty linked list!");
		}
		//if head the data
		else if(list.head.data==data){
			list.head=list.head.next;
		}
		//finding data in list and remove it 
		else {
			Node temp=head,prev=null;
			while(temp.next!=null) {
				if(temp.data==data) {
					prev.next=temp.next;
					break;
				}else {
					prev=temp;
					temp=temp.next;
				}
			}
			if(temp.next==null&&temp.data==data) {
				prev.next=null;
			}
			else {
				System.out.println("Data not Found!");
			}
		}
		
		return list;
	}

	// method for print linked list
	void traversal(SingleLinkedList list) {
		// check if head is null then print empty
		if (list.head == null)
			System.out.println("Empty!");

		// print all nodes data, creating new node that hold current node, iterate list
		// till the last node, print data of the current node & set next
		// node data to current node & print last node data
		else {
			Node node = list.head;

			while (node.next != null) {
				System.out.println(node.data + " ");
				node = node.next;
			}
			System.out.println(node.data);
		}
		System.out.println("!End");
	}
}
