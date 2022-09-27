
public class Fifth_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=4;
		int stairs[]= {1,2,3};
		System.out.println(PossibleWays(stairs,0,target));
	}

	private static int PossibleWays(int[] stairs, int n, int target) {
		if(n==target)return 1;
		if(n>target)return 0;
		int ret=0;
		for(int i=0;i<3; i++) {
			ret+=PossibleWays(stairs,n+stairs[i],target);
		}
		return ret;
	}

}
