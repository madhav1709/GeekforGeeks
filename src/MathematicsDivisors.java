// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MathematicsDivisiors {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {
            Divisors obj=new Divisors();
            int N;
            N=sc.nextInt();

            System.out.println(obj.exactly3Divisors(N));


        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Divisors
{

    public int exactly3Divisors(int N)
    {
        //Your code here
        int factorscount = 0;
        int count = 0;
        for(int i = 1;i<N;i++)
        {
            for(int j = 1;j<=N;j++)
            {
                if(i%j == 0){

                    ++factorscount;
                    //System.out.print(i);
                    //System.out.print(factorscount + " ");
                }
                //factorscount = 0;



            }
            if(factorscount == 3)
            {
                //factorscount = 0;
                count++;
            }
            factorscount = 0;
        }
        return count;


    }
}
