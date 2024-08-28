package searchkth;

import java.util.Arrays;

public class SearchingAlgo {

	public static void main(String[] args) {
		 
		int arr []= {2,4,6,8,0,46,3,5,86,9,43,55};// unsorted array
		int k = 6;// element to be find
		
		System.out.println(Arrays.toString(arr));
		
		LinearSearch linear = new LinearSearch();
		int res = linear.search(arr,k);// searching by linear search
		System.out.println("Index of "+k+" by linear Search: "+res);// printing index
		
		Arrays.sort(arr);// sorting given array
		System.out.println(Arrays.toString(arr));
		
		BinarySearch binary = new BinarySearch();
		int res1 = binary.search(arr,k);// searching by binary search
		System.out.println("Index of "+k+ " by binary Search: "+res1);//printing index
		
		InterpolationSearch inter = new InterpolationSearch();
		int res2 = inter.search(arr,0,arr.length-1,k);
		System.out.println("Index of "+k+ " by Interpolution Search: "+res2);
	}

}
