// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics1 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {
            CelsiusToFahrenheit obj=new CelsiusToFahrenheit();

            int C;
            C=sc.nextInt();

            System.out.println((int)(obj.cToF(C)));
        }

    }
}
// } Driver Code Ends


//User function Template for Java


class CelsiusToFahrenheit
{
    public double cToF(int C)
    {
        //Your code here


        return (C * 1.8) + 32;

    }
}
