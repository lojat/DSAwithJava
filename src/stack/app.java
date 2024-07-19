package stack;

//stack implementation with array

public class app {
	 
	static int stack[] = new int[100];
	//top element holding address of last in element
	static int  top=0; 
	
	public static void main(String[] args) {
		//push some elements in stack
		push(50); 
		push(20); 
		push(0); 
		push(90); 
		
		//pop some element from stack
		pop(); 
		pop(); 
 
		System.out.println("peek :"+peek());//print top element 20
		
		System.out.println("pop :"+pop());//pop  top element 20
		
		System.out.println("push 40:"+push(40));// push 40 in top 
		
		// print all element of stack
		for(int i=0;i<top;i++) {
			System.out.println(i+" : "+stack[i]);
		}
		
		
	}
	//push method
	static int push(int ele) {
		stack[top++]=ele; 
		return stack[top-1]; 
	}
	
	//pop method
	static int pop() {
		int ele=stack[top-1]; 
		stack[top--]=0; 
		return ele; 
	}
	
	//peek method
	static int peek() {
		return stack[top-1]; 
	}
}
