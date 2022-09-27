package LinkedList_Map;


import java.util.HashSet;

public class Nuts_Bolts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] nuts={'$', '%', '#', '&','@'};
		char[] bolts={'@','#','$','%','&'};
		HashSet<Character> hm = new HashSet<>();
		for(int i=0; i<nuts.length;i++) {
			hm.add(nuts[i]);
		}
		for(int i=0; i<bolts.length;i++) {
			if(hm.contains(bolts[i]))System.out.println(bolts[i]);
		}
	}

}
