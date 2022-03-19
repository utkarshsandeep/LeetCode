public class EqualPair {
    public static void main(String[] args) {
        EqualPair ob = new EqualPair();
        System.out.println(ob.soln(new int[]{1,2,3,4}));
    }
    public boolean soln(int nums[]){
        if (nums.length%2==0){
            boolean flag = true;
            for (int i=0;i<nums.length;i++){
                for (int j=0;j<nums.length-i-1;j++){
                    if (nums[j]>nums[j+1]){
                        int t=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=t;
                    }
                }
            }
            for (int i=0;i<nums.length;i+=2){
                if (nums[i]!=nums[i+1]){
                    flag = false;
                    break;
                }
            }
            return flag;
        } else {
            return false;
        }
    }
}
