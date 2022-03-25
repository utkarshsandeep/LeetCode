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
        for(int i=1;i<=n;i++){
            String []a = br.readLine().split(" ");
            String []b = br.readLine().split(" ");
            int s1 = 0, s2=0;
            for (int j=0;j<a.length;j++){
                s1+=Integer.parseInt(a[j]);
                s2+=Integer.parseInt(b[j]);
            }
            if (s1 > s2) {
                System.out.println("DRAGON");
            } else if (s1<s2){
                System.out.println("SLOTH");
            } else{
                if (Integer.parseInt(a[0])>Integer.parseInt(b[0])) {
                    System.out.println("DRAGON");
                }else if (Integer.parseInt(a[0])<Integer.parseInt(b[0])) {
                    System.out.println("SLOTH");
                } else {
                    if (Integer.parseInt(a[1])>Integer.parseInt(b[1])) {
                        System.out.println("DRAGON");
                    }else if (Integer.parseInt(a[1])<Integer.parseInt(b[1])) {
                        System.out.println("SLOTH");
                    } else {
                        if (Integer.parseInt(a[2])>Integer.parseInt(b[2])) {
                            System.out.println("DRAGON");
                        }else if (Integer.parseInt(a[2])<Integer.parseInt(b[2])) {
                            System.out.println("SLOTH");
                        } else {
                            System.out.println("TIE");
                        }
                    }
                }
            }
        }
	}
}
