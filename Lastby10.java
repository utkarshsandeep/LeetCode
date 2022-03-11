public class Lastby10 {
    public static void main(String[] args) {
        Lastby10 ob = new Lastby10();
        System.out.println(ob.soln(new int[]{85,25,65,21,84}));
    }
    public String soln(int a[]){
        String z="";
        String x="";
        for (int i=0;i<a.length;i++){
            x+=a[i]%10;
        }
        if (Long.parseLong(x)%10==0)
            z="Yes";
        else
            z="No";
        return z;
    }
}
