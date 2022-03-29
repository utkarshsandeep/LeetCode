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
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for (int i=1;i<=n;i++){
		    String data[]=br.readLine().split(" ");
		    int a =Integer.parseInt(data[0]);
		    int b =Integer.parseInt(data[1]);
		    int c=Integer.parseInt(data[2]);
		    if (a-b<=c)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
		
	}
}
