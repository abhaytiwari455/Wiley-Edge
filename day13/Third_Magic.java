
public class Third_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,2,3,4};
		System.out.println(calculateMagicNo(array,0,array.length-1));
	}

	private static int calculateMagicNo(int[] array, int i, int n) {
		
		if(i==n)return -1;
		else if(array[i]==i) return i;
		return calculateMagicNo(array,i+1,n);
	}

}
