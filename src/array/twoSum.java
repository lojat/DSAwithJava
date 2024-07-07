package array;

import java.util.Scanner;


/*Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 

Examples: 

Input: arr[] = {1, 2, 3, 4, 5}, x= 5
Output: Yes
Explanation: If we calculate the sum of the output,2 + 3 = 5*/

public class twoSum {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		 
		int[] arr = getArray();
		
		System.out.println("Enter Elements that sum find:");
		int ele = sc.nextInt();
		
		String string = twoSumMethod(arr,ele);
		
		System.out.println(string);
	
		
	}

	//Method to find twoSum
	private static String twoSumMethod(int[] arr,int ele) {
		
		String res="";
		int arr1[]= new int[ele+1];
		int def=0,flag =0 ;
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ele) {
				def=ele-arr[i];
				if(arr1[def]==1) {
					res= "Yes";
					flag=1;
				}
				else {
					arr1[arr[i]]=1;
				}
			}
		}
		if(flag==0)
			res="No";
		
		return res;
	
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
		 
}
