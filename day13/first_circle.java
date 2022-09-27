
public class first_circle {

	static int Calculate(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            
            return (Calculate(n - 1, k) + k - 1) % n + 1;
    }
 
    public static void main(String[] args)
    {
        int n = 9;
        int k = 3;
        System.out.println("Last element is "
                           + Calculate(n, k));
    }
}


