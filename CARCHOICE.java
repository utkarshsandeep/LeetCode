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

            if ((double) Integer.parseInt(n[2]) / Integer.parseInt(n[0]) < (double) Integer.parseInt(n[3]) / Integer.parseInt(n[1])) {
                System.out.println(-1);
            } else if ((double) Integer.parseInt(n[2]) / Integer.parseInt(n[0]) > (double) Integer.parseInt(n[3]) / Integer.parseInt(n[1])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
	}
}
