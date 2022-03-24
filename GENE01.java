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
		
		    String []color = br.readLine().split(" ");
		    char a1 = color[0].charAt(0);
		    char a2 = color[1].charAt(0);
		    if (a1=='R' || a2=='R')
		    System.out.println('R');
		    else if (a1=='B' || a2=='B')
		    System.out.println('B');
		    else
		    System.out.println('G');
		
	}
}
