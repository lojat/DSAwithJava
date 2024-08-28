package searchkth;

public class LinearSearch {

	public int search(int[] arr, int k) {
		 
		int res = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				res = i;
				break;
			}
		}
		
		 
		return res;
	}
	
	
}
