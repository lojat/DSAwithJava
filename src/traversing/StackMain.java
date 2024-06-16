package traversing;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sack is work on last come first out 
		int[] stack = {12,123,234,2,32,1,54,45,43};
		
		for(int i=(stack.length)-1;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}

	}

}
