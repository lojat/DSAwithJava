package traversing;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intialize int Array
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		
		//intialize String Array
		String[] strArr = {"one","two","three","four","five","six","seven","eight","nine"};
		
		//traversing int array by lenght function {lengh function will return lenght of array}
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
		}
		System.out.println();
		//traversing String array by for each loop
		for(String s: strArr) {
			System.out.print(s+" ");
		}

	}

}
