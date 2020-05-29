// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MathematicsDigitsInFactorial {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {
            Factorial1 obj=new Factorial1();
            int N;
            N=sc.nextInt();
            System.out.println(obj.digitsInFactorial(N));

        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Factorial1
{

    public int digitsInFactorial(int N)
    {
        //Your code here
        if(N == 0)
            return 0;
        long c = N*digitsInFactorial(N-1);
        System.out.println(c);
        return 0;
    }

}

