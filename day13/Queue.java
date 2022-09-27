package stack_Queues;

import java.util.Stack;

public class Queue {
	Stack<Integer> stack1= new Stack<>();
	Stack<Integer> stack2= new Stack<>();
	public void push(int x) {
		stack1.push(x);
	}
	public int pop() {
		if(stack1.isEmpty())System.out.println("Queue is Empty");
		else {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		int ret=stack2.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return ret;
	}
	public void print() {
		if(stack1.isEmpty())System.out.println("Queue is Empty");
		else {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		while(!stack2.isEmpty()) {
			System.out.print(stack2.peek()+"  ");
			stack1.push(stack2.pop());
		}
		System.out.println();
	}
	
}
