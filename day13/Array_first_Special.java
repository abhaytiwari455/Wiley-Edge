
public class Array_first_Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hwjsd lsdkh @ hihi";
		String string2 = "hwjsd lsdkh 12 hihi";
		System.out.println(check(string));
		System.out.println(check(string2));
	}

	private static boolean check(String string) {
		// TODO Auto-generated method stub
		boolean ret= false;
		for(int i=0; i<string.length();i++) {
			
			char c= string.charAt(i);
			int ascii=(int)c;
			if(c==' ') {continue;}
			if((ascii>=32 && ascii<=47)||(ascii>=58 && ascii<=65)) ret=true;
		}
		return ret;
	}

}
