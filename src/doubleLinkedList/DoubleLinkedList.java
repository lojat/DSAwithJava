package doubleLinkedList;

//Double linked list Implementation

public class DoubleLinkedList {
	//head hold address of first node & tail hold address of last node  
	Node head = null;
	Node tail = null;

	//Node class declaration
	static class Node {
		Node prev;
		String data;
		Node next;
	
		//parameter constructor 
		public Node(String data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public static void main(String[] args) {

		//variable for double linked list
		DoubleLinkedList list = new DoubleLinkedList();

		//insert some elements
		list.insert(list, "Hello");
		list.insert(list, "java");
		list.insert(list, "double");
		list.insert(list, "linked");
		list.insert(list, "listed");

		//print list
		list.print(list);

		//delete element
		list.delete(list, "listed");

		//print list end to start
		list.reversePrint(list);

	}

	//insert Method
	DoubleLinkedList insert(DoubleLinkedList list, String data) {
		Node temp = new Node(data);
		if (head == null) {
			list.head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			tail.next.prev = tail;
			tail = tail.next;
		}
		System.out.println(data + " Inserted");
		
		return list;
	}

	//delete Method
	DoubleLinkedList delete(DoubleLinkedList list, String data) {
		if (list.head == null) {
			System.out.println("Deletion Failed Empty List!");
		} else {
			if (list.head.data == data) {
				list.head = head.next;
				list.head.prev = null;
			} else if (list.tail.data == data) {
				list.tail = tail.prev;
				list.tail.next = null;
			} else {
				Node temp1 = list.head.next, temp2 = list.tail.prev;
				while (temp1.next != temp2 || temp1 != temp2) {
					if (temp1.data == data) {
						temp1.prev.next = temp1.next;
						temp1.next.prev = temp1.prev;
						break;
					} else if (temp2.data == data) {
						temp2.prev.next = temp2.next;
						temp2.next.prev = temp2.prev;
						break;
					}
					temp1 = temp1.next;
					temp2 = temp2.prev;
				}
			}
			System.out.println(data+" deleted!");
		}
		
		return list;
	}

	//print Method
	void print(DoubleLinkedList list) {
		System.out.println("Forward :");
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data + "\n");
	}

	//reverse print method
	void reversePrint(DoubleLinkedList list) {
		System.out.println("Reverse :");
		Node temp = tail;
		while (temp.prev != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println(temp.data + "\n");
	}
}
