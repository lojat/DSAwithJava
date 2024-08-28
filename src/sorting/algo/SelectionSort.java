package sorting.algo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {22,423,1,32,34,342,23,2,42,2,432,0};
		
		int[] res = selectionSort(arr);
		
		System.out.println(Arrays.toString(res));

	}

	private static int[] selectionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0 ;i<n;i++) {
			
			int minInd = i;
			
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[minInd]) {
					minInd = j;
				}
			}
			
			int temp = arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=temp;
			
		}
		
		return arr;
	}

}
