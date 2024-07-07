package delete;

import java.util.Scanner;

public class ArrayMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = getArray();
		int ele = 0;
		
		// get element to delete from array
		System.out.println("Enter element to be delete = ");
		ele = sc.nextInt();

		int arr1[] = deleteEle(arr, ele);

		display(arr1);
	}
	//Method to get Array
	private static int[] getArray() {

		System.out.println("Enter length of Array:");
		int num = sc.nextInt();

		int[] arr = new int[num];
		System.out.println("Enter Elements:");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}
	
	// Method to display array
	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	// Method to delete elements from array
	private static int[] deleteEle(int[] arr, int ele) {

		int len = arr.length, count = 0;
		int[] arr1 = new int[len - 1];

		for (int i = 0; i < len; i++) {
			if (arr[i] != ele) {
				arr1[count++] = arr[i];
			}
		}
		return arr1;
	}

}
