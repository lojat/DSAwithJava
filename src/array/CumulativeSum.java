package array;

import java.util.Scanner;

/*The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.

Examples
Initial Array: [1, 2, 3, 4]
Cumulative Sum: [1, 3, 6, 10]
*/

public class CumulativeSum {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int[] arr = getArray();
		
		arr= cumulativeSum(arr);
		
		display(arr);
		
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
		
		// Method to calculate cumulativeSum
		private static int[] cumulativeSum(int[] arr) {
			
			int len = arr.length,prev=0;
			for(int i=0;i<len;i++) {
				arr[i] = arr[i]+prev;
				prev = arr[i];
			}
			return arr;
			
		}

}
