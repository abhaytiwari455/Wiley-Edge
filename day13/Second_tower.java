
public class Second_tower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(claculate(n));
	}

	private static int claculate(int n) {
		if(n==1) return 1;
		else return n*claculate(n-1);
	}

}
