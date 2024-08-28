package searchkth;

public class InterpolationSearch {

	public int search(int[] arr,int low,int high, int k) {
		
		int pos ;
		
		while(low<=high && k>=arr[low] && k<=arr[high]) {
			
//			pos = lo + (((hi - lo) * (k - arr[lo])) / (arr[hi] - arr[lo]));
			
			pos = low + (((high-low) * (k-arr[low])) / (arr[high] - arr[low]));
			
			System.out.println(pos);
			
			if(arr[pos]==k)
				return pos;
			
			if(arr[pos]<k)
				low = pos+1;
			else
				high = pos-1;
			
		}
		
		return -1;
	}

}
