public class Capacity {
    public static void main(String[] args) {
        Capacity ob = new Capacity();
        System.out.println(ob.soln(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public int soln(int []height) {
        int cap=0;
        for (int i=0;i<height.length;i++)
        {
            int x=0;
            for (int j=i+1;j<height.length;j++){
                x=j-i;
                int k= Math.min(height[i], height[j]);
                if (cap < x*k)
                    cap=x*k;
            }
        }
        return cap;
    }
}
