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
		int n = Integer.parseInt(br.readLine());
		for (int i=1;i<=n;i++){
		    String[] num = br.readLine().split(" ");
		    int n1 = Integer.parseInt(num[0]);
		    int n2 = Integer.parseInt(num[1]);
		    System.out.println((n1*n2)/100);
		}
	}
}
