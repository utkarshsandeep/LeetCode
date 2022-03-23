/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n1; i++) {
            String[] n = br.readLine().split(" ");
            int [] nums = new int[n.length];
            for (int j=0;j<n.length;j++){
                nums[j]= Integer.parseInt(n[j]);
            }
            if (nums[0] <= (nums[1]+nums[2]*2)) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
	}
}
