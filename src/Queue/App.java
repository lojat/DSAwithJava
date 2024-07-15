package Queue;

//QUEUE IMPLEMENTATION BY USING ARRAY

public class App {
//Declaration
	static int queue[]= new int[100];
	static int front=0;//front holding address starting element
	static int rear=0;//rear holding address of last element

	public static void main(String[] args) {
		//adding some elements in queue
		 add(10);
		 add(20);
		 add(30);
		 add(40);
		 add(50);
		 
		 //remove head come element 
		 System.out.println("remove head element: "+poll());
		 //add 60
		 System.out.println("add 60: "+add(60));
		 //peek head element
		 System.out.println("Peek :"+peek());
		 //display all elements
		 System.out.println("Elements:");
		 
		 for(int i=front;i<rear;i++) {
			 System.out.println(queue[i]);
		 }
		 
	}

static //	add() - Inserts the specified element into the queue. 
//	If the task is successful, add() returns true, if not it throws an exception.
	boolean add(int ele) {
		if(rear==queue.length-1)
			return false;
		queue[rear++]=ele;
		return true;
	}
	
 //	peek() - Returns the head of the queue.
static int peek() {
		return queue[front];
	}
	
 //	 Returns and removes the head of the queue.
static int poll() {
		int ele= queue[front];
		queue[front++]=0;
		return ele;
	}
	
}
