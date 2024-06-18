package delete;

import java.util.Scanner;


public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= {12,3,2,43,42,24,54,24};
		int ele=0;
		
		System.out.println("Enter element to be delete = ");
		ele=sc.nextInt();
		
		int arr1[] = delete(arr,ele);
		sc.close();
	}

	private static int[] delete(int[] arr, int ele) {
		
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==ele){
					count++;
					break;
				}
			}
		
		return null;
	}

}
