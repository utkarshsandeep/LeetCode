public class MergeSA {
    public static void main(String[] args) {
        MergeSA ob = new MergeSA();
        ob.solution(new int[]{1},1, new int[]{},0);
        
    }
    public void solution(int nums1[],int m,int nums2[],int n){
        int x = Math.min(nums1.length, m);
        int y = Math.min(nums2.length, n);
        int nums3[] = new int[x+y];
        int a = 0,b=0;
        boolean a1 = true,b1=true;
        if (nums2.length!=0 && nums1.length!=0){
            for (int i =0;i <nums3.length;i++){
                if(nums1[a]<nums2[b] && a1){
                    nums3[i]=nums1[a++];
                    if (a==x){
                        a1=false;
                    }

                } else{
                    if(b1) {
                        nums3[i] = nums2[b++];
                    }
                    if(y==b)
                        b1=false;
                }
            }
            for (int i =0;i<nums3.length;i++){
                nums1[i]=nums3[i];
            }
        } else {
            if (nums1.length==0){
                for (int i =0;i<nums2.length;i++){
                    nums1[i]=nums2[i];
                }
            }
        }
    }
}
