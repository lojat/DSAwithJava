package sorting.algo;

import java.util.ArrayList;
import java.util.Scanner;

//implementation of Insertion sort 
public class InsertionSort {

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

		ArrayList<Integer> sortArr = insertionSort(arr);// calling sorting method

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
	private static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {

		int n = arr.size(), c = 0;// length of array

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;//flag for check if already sorted 
			for (int j = i; j < n - 1; j++) {
				
				if (arr.get(i) > arr.get(j + 1)) {// checking if before element is greater then after element if yes then swap
					int temp = arr.get(i);
					arr.set(i, arr.get(j + 1));
					arr.set(j + 1, temp);
					swapped = true;;// set flag to true
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
