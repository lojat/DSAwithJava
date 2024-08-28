package searchkth;

public class BinarySearch {

	public int search(int[] arr, int k) {
		
		int res = -1; 
		int low = 0, high = arr.length-1; // set low to 0 and high to last index of the array
		int mid = 0;
		
		while(low<=high) {// interate untile 
			
			mid = low+(high-low)/2;
			
			if(arr[mid]==k) {
				res = mid;
				break;
			}else if(arr[mid]<k) {
				low = mid+1;
			}else{
				high = mid-1;
			}
			
		}
		
		return res;
	}
	
}
