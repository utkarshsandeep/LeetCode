import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum ob = new ThreeSum();
        System.out.println(ob.soln(new int[]{-1,0,1,2,-1,-4}));
    }
    public List<List<Integer>> soln(int []nums){
        List<List<Integer>> threeSum = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if (i!=j&&i!=k&&j!=k){
                        List<Integer> three= new ArrayList<>();
                        if (nums[i]+nums[j]+nums[k]==0){
                            three.add(nums[i]);
                            three.add(nums[j]);
                            three.add(nums[k]);
                        }
                        if (!three.isEmpty()) {
                            threeSum.add(three);
                        }

                    }
                }
            }
        }
        List<List<Integer>> finalThree = new ArrayList<>();
        for (int i=0;i<threeSum.size();i++){
            for (int j=i+1;j<threeSum.size();j++){
                if (!(threeSum.get(i).containsAll(threeSum.get(j)) && threeSum.get(j).containsAll(threeSum.get(i)))){
                    finalThree.add(threeSum.get(i));
                }
            }
        }
        return finalThree;
    }
}
