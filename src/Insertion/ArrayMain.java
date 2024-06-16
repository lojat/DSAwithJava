package Insertion;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {24,23,4,54,3,2325,23,32,3,53};// array
		int ele=0;//inserting element
		int ind=0;//index number
		int next=0;
		
		System.out.println("Enter element = ");
		ele= sc.nextInt();
		
		System.out.println("Enter index number");
		ind=sc.nextInt();
		
		if(ind>arr.length)
			System.out.println("Index out of range");
		else {
			next=arr[ind];
			for(int i=ind;i<arr.length;i++) {
				arr[i]=ele;
				ele=next;
//				if(i==arr.length-1)
//					break;
				next=arr[i+1];
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

		sc.close();
	}
}
