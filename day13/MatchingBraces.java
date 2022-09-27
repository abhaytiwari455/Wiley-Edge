package stack_Queues;

import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="{ a+b}{}{}{{{}}}";
		if(check(string1))System.out.println("Braces are balanced");
		else System.out.println("Braces are not balanced");
	}

	private static boolean check(String string1) {
		// TODO Auto-generated method stub
		//boolean ret=true;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<string1.length();i++) {
			char c= string1.charAt(i);
			if(c=='{')stack.push(c);
			else if(c=='}') {
				if(stack.isEmpty()) {
					return false;
				}
				else stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
