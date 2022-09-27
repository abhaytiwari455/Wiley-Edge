import java.util.ArrayList;

public class Fourth_Braces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		ArrayList<String> result = new ArrayList<>();
		claculate(result,0,0,n,"");
		System.out.println(result);
	}

	private static void claculate(ArrayList<String> result, int open, int close, int n, String string) {
		// TODO Auto-generated method stub
		if(open==4 && close==4) {
			result.add(string);
			return;
		}
		if(open < 4) {
			claculate(result,open+1,close,n,string+"{");
		}
		if(close < 4 && close<open) {
			claculate(result,open,close+1,n,string+"}");
		}
	}

}
