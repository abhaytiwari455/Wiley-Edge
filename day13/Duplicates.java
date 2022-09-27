package LinkedList_Map;
import java.util.*;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll= new LinkedList<>();
		ll.add(1);ll.add(21);ll.add(19);ll.add(1);ll.add(20);
		HashSet<Integer> hs = new HashSet<>();
		for(int i:ll) hs.add(i);
		System.out.println(hs);
	}

}
