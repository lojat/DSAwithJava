package circularLinkedList;

//circular linked list implementation

public class CircularLinkedList {

	//assigning head to null
	Node head = null;

	//creating node class
	static class Node {
		Node prev, next;
		int data;

		//creating constructor 
		public Node(int data) {
			this.data = data;
			prev = next = null;
		}

		public Node(int data, Node head, Node last) {
			this.data = data;
			prev = last;
			next = head;
		}
	}

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();

		//adding some elements
		list.insert(list, 45);
		list.insert(list, 3445);
		list.insert(list, 214);
		list.insert(list, 345);
		list.insert(list, 545);
		list.insert(list, 245);
		list.insert(list, 4345);

		//print list
		list.print(list);

		//deleting element
		list.delete(list, 4345);

		//reverse print
    	list.reversPrint(list);
    	
	}

	//method to insert new node
	CircularLinkedList insert(CircularLinkedList list, int data) {
		if (head == null) {
			Node newNode = new Node(data);
			list.head = newNode;
			list.head.prev = list.head;
			list.head.next = list.head;
		} else {
			Node last = head;
			while (last.next != list.head) {
				last = last.next;
			}
			Node newNode = new Node(data, list.head, last);
			last.next = newNode;
			list.head.prev = newNode;
		}
		
		return list;
	}

	// method for print
	void print(CircularLinkedList list) {
		Node temp = head;
		while (temp.next != head) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	//reverse print method
	void reversPrint(CircularLinkedList list) {
		Node temp = head.prev;
		while (temp.prev != head.prev) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println(temp.data);
	}

	//method for deleting
	CircularLinkedList delete(CircularLinkedList list, int data) {

		if (list.head.data == data) {
			list.head.next.prev = list.head.prev;
			list.head.prev.next = list.head.next;
			list.head = list.head.next;
		} else {
			Node temp1 = list.head.next;
			Node temp2 = list.head.prev;

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
		return list;
	}

}
