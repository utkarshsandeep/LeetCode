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
        for(int i=1;i<=t;i++) {
            int n = Integer.parseInt(br.readLine());
            String str=br.readLine();
            String str1,str2="";
            if (n%2!=0){
                str1 = str.substring(0,n-1);
                for (int j=0;j<str1.length();j+=2){
                    str2=str2+str1.charAt(j+1)+str1.charAt(j);
                }
                str2=str2+str.charAt(n-1);
            } else {
                str1=str;
                for (int j=0;j<str1.length();j+=2){
                    str2=str2+str1.charAt(j+1)+str1.charAt(j);
                }
            }
            Map<Character, Character> encrypt = new HashMap<>();
            encrypt.put('a','z');
            encrypt.put('b','y');
            encrypt.put('c','x');
            encrypt.put('d','w');
            encrypt.put('e','v');
            encrypt.put('f','u');
            encrypt.put('g','t');
            encrypt.put('h','s');
            encrypt.put('i','r');
            encrypt.put('j','q');
            encrypt.put('k','p');
            encrypt.put('l','o');
            encrypt.put('m','n');
            encrypt.put('n','m');
            encrypt.put('o','l');
            encrypt.put('p','k');
            encrypt.put('q','j');
            encrypt.put('r','i');
            encrypt.put('s','h');
            encrypt.put('t','g');
            encrypt.put('u','f');
            encrypt.put('v','e');
            encrypt.put('w','d');
            encrypt.put('x','c');
            encrypt.put('y','b');
            encrypt.put('z','a');
            str1="";
            for (int j=0;j<str2.length();j++){
                if (encrypt.containsKey(str2.charAt(j))){
                    str1+=encrypt.get(str2.charAt(j));
                }
            }
            System.out.println(str1);
        }
	}
}
