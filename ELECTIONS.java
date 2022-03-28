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
		int n=Integer.parseInt(br.readLine());
		for (int i=1;i<=n;i++){
		    String []votes = br.readLine().split(" ");
		    int v1 = Integer.parseInt(votes[0]);
		    int v2 = Integer.parseInt(votes[1]);
		    int v3 = Integer.parseInt(votes[2]);
		    if (v1>50) System.out.println("A");
		    else if (v2>50) System.out.println("B");
		    else if (v3>50) System.out.println("C");
		    else System.out.println("NOTA");
		}
	}
}
