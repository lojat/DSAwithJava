package sorting.algo;

import java.util.ArrayList;
import java.util.Scanner;

//implementation of bubble sort 

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("Enter number of elements: ");// getting length of array
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.print("Before Sorting: ");// print unsorted array
		displayArray(arr);

		ArrayList<Integer> sortArr = bubbleSort(arr);// calling sorting method

		System.out.print("After Sorting: ");// print sorted array
		displayArray(sortArr);

		sc.close();
	}

	// method for print
	private static void displayArray(ArrayList<Integer> arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	// method for sorting
	private static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {

		int n = arr.size(), c = 0;// length of array

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;//flag for check if already sorted 
			for (int j = 0; j < n - i - 1; j++) {//nested loop
				
				if (arr.get(j + 1) < arr.get(j)) {// checking if before element is greater then after element if yes then swap
					int temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
					swapped = true;// set flag to true
				}
				
				c++;
			}
			if (!swapped)// if flag is not true it means array is sorted
				break;
		}
		System.out.println("c: " + c);
		return arr;
	}

}
