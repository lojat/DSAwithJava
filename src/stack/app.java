package stack;

//stack implementation with array

public class app {
	//stack with size 100
	static int stack[] = new int[100];
	//top element holding address of last in element
	static int  top=0; 
	
	public static void main(String[] args) {
		//push some elements in stack
		push(50);//add 50 in stack
		push(20);//add 20 in stack
		push(0);//add 0 in stack
		push(90);//add 90 in stack
		
		//pop some element from stack
		pop();//remove 90
		pop();//remove 0
 
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
		stack[top++]=ele;// add element in top of the array
		return stack[top-1];//return element
	}
	
	//pop method
	static int pop() {
		int ele=stack[top-1];// last inserted element
		stack[top--]=0;//set array top to 0
		return ele;//return top element 
	}
	
	//peek method
	static int peek() {
		return stack[top-1];//return top element
	}
}
