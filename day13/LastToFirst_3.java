package LinkedList_Map;

import java.util.LinkedList;

public class LastToFirst_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll= new LinkedList<>();
		ll.add(1);ll.add(21);ll.add(19);ll.add(1);ll.add(20);
		System.out.println(ll);
		ll.addFirst(ll.getLast());
		ll.remove(ll.size()-1);
		System.out.println(ll);
	}
}
