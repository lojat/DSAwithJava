package Insertion;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = { 24, 23, 4, 54, 3, 2325, 23, 32, 3, 53 };// array

		int ele = 0;// inserting element
		int ind = 0;// index number

		System.out.println("Enter element = ");
		ele = sc.nextInt();

		System.out.println("Enter index number");
		ind = sc.nextInt();

		if (ind > arr.length)
			System.out.println("Index out of range");
		else {
			int[] arr1 = insert(arr, ele, ind);

			display(arr1);
		}
		sc.close();
	}

	static int[] insert(int[] arr, int ele, int ind) {

		int[] arr1 = new int[arr.length + 1];

		for (int i = 0; i < ind; i++) {
			arr1[i] = arr[i];
		}
		arr1[ind] = ele;
		for (int i = ind + 1; i < arr1.length; i++) {
			arr1[i] = arr[i - 1];
		}
		if (ind > arr.length)
			System.out.println("Index out of range");

		return arr1;
	}

	static void display(int[] arr1) {

		for (int i = 0; i < arr1.length; i++)
			System.out.print("index " + i + " = " + arr1[i] + "  ");

	}
}
