package Insertion;

import java.util.Scanner;

public class StackQueueMain {

	public static void main(String[] args) {
		// Insertion in stack & Queue always done in last index

		Scanner sc = new Scanner(System.in);
		int[] arr = { 24, 23, 4, 54, 3, 2325, 23, 32, 3, 53 };// array

		int ele = 0;// inserting element

		System.out.println("Enter element = ");
		ele = sc.nextInt();

			int[] arr1 = insert(arr, ele);

			display(arr1);
			sc.close();
	}

	static int[] insert(int[] arr, int ele) {

		int[] arr1 = new int[arr.length + 1];
		
		for(int i=0;i<arr.length;i++)
			arr1[i]=arr[1];
		arr1[arr1.length-1]=ele;
		
		return arr1;
	}

	static void display(int[] arr1) {

		for (int i = 0; i < arr1.length; i++)
			System.out.print("index " + i + " = " + arr1[i] + "  ");

	}
}
