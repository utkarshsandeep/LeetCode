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
		String []a = br.readLine().split(" ");
		boolean flag=false;
		for (int i=0;i<a.length-1;i++){
		    if (a[3].equals(a[i]))
		    {
		        flag=true;
		        break;
		    }
		}
		if (flag){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
	}
}
