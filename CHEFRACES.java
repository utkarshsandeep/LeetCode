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
        int t=Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++){
            String []a = br.readLine().split(" ");
            int r=2;
            String w =a[0],x=a[1],y=a[2],z=a[3];
            if (w.equals(y) || w.equals(z)){
                r--;
            }
            if (x.equals(y) || x.equals(z)){
                r--;
            }
            System.out.println(r);
        }
	}
}
