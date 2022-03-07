import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HaystackNeedle {
    public static void main(String[] args) {
        HaystackNeedle ob = new HaystackNeedle();
        System.out.println(ob.solution("",""));
        System.out.println(ob.solution2(new int[]{1, 3, 5, 6},2));
    }
    public int solution(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public int solution2(int[] nums, int target){
        List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (!num.contains(target)) {
            num.add(target);
            num = num.stream().sorted().collect(Collectors.toList());
        }
        return num.indexOf(target);
    }
}
