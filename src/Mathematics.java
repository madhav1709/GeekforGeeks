// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Absolute obj = new Absolute();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Absolute {
    // You need to complete this function
    public int absolute(int I) {
        // Your code here
        return I > 0 ? I : -1 * I;
    }
}
