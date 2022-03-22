import java.io.BufferedReader;
import java.io.InputStreamReader;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n1; i++) {
            int n = Integer.parseInt(br.readLine());
            int x=0;
            x+=n/10;
            n=n%10;
            x+=n/5;
            n=n%5;
            if (n==0){
                System.out.println(x);
            } else {
                System.out.println(-1);
            }
        }
    }
}