package stack_Queues;

public class QueueUsingStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.print();
		queue.pop();
		queue.pop();
		queue.print();
	}

}
