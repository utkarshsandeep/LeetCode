public class MedianArray {
    public static void main(String[] args) {
        MedianArray ob = new MedianArray();
        System.out.println(ob.soln(new int[]{1, 2, 3}, new int[]{4, 5, 6,7}));
    }
    public double soln(int num1[], int num2[]){
        int num3[] = new int[num1.length+num2.length];
        int x=0;
        for(int i=0;i<num1.length;i++){
            num3[x++]=num1[i];
        }
        for(int i=0;i<num2.length;i++){
            num3[x++]=num2[i];
        }
        for (int i=0;i<num3.length;i++){
            for (int j=0;j<num3.length-i-1;j++){
                if (num3[j]>num3[j+1]){
                    int t=num3[j];
                    num3[j]=num3[j+1];
                    num3[j+1]=t;
                }
            }
        }
        int n3 = num3.length;
        if (n3%2==0){
            return (double) (num3[n3/2-1]+num3[n3/2])/2;
        } else {
            return (double) (num3[n3/2]);
        }
    }
}
