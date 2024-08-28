package leet20;

import singleLinkedList.SingleLinkedList;

public class Solution {
	
 
	static void insert() {
		SingleLinkedList list = new SingleLinkedList();

		// insert some elements in list
		list.insert(list, 231);
		list.insert(list, 7823);
		list.insert(list, 900);
		list.insert(list, 745);
		list.insert(list, 0);
		list.insert(list, 98);
		list.insert(list, 2323);
		list.insert(list, 784);
		
		list.traversal(list);
	}
	
}
