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
            String []b = br.readLine().split(" ");
            int n=Integer.parseInt(a[0]);
            int k=Integer.parseInt(a[1]);
            int s=0;
            boolean flag=true;
            for (int j=0;j<b.length;j++){
                s+=Integer.parseInt(b[j]);
                s-=k;
                if (s<0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println("YES");
            } else {
                System.out.println("NO " + (s*-1));
            }
        }
	}
}
