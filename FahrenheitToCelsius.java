import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
		int E = s.nextInt();
        int W = s.nextInt();
        int f = S;
        while(f<=E)
        {
            int celsius = (5*(f - 32))/9;
            System.out.println(f+"	"+celsius);
            f = f + W;
        }
	}

}