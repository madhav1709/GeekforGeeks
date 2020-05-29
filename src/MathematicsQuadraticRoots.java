// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MathematicsQuadraticRoots {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0)
        {
            Quadratic  obj=new Quadratic();
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            obj.quadraticRoots(a,b,c);
            System.out.println();
        }

    }
}
// } Driver Code Ends


//User function Template for Java


class Quadratic
{
    public void quadraticRoots(int a,int b,int c)
    {
        //Your code here
        double d = (b*b - 4*a*c);
        //System.out.println(d);
        if(d == 0)
        {
            System.out.print((int)(Math.floor(-b/(2.0*a))));
            System.out.print((int)(Math.floor(-b/(2.0*a))));

        }
        else if(d > 0)
        {
            System.out.print((int)Math.floor(-b + Math.sqrt(d))/(2.0*a));
            System.out.print((int)Math.floor(-b - Math.sqrt(d))/(2.0*a));
        }
        else if(d < 0)
        {
            System.out.print("Imaginary");
        }


    }
}
