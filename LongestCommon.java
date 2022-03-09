import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestCommon {
    public static void main(String[] args) {
        LongestCommon ob = new LongestCommon();
        System.out.println(ob.solution("abcabcbb"));
    }
    public int solution(String s){
        int l = 0;
        for (int i=0;i<s.length();i++){
            for (int j = i;j<s.length();j++){
                String ss = s.substring(i,j+1);
                if (nonduplicate(ss)){
                    if (ss.length()>l){
                        l=ss.length();
                    }
                }
            }
        }
        return l;
    }
    public boolean nonduplicate(String ss){
        char ar[] = ss.toCharArray();
        int x[]= new int[ar.length];
        for(int i =0;i<ar.length;i++){
            x[i]=ar[i];
        }
        List<Integer> ch=Arrays.stream(x).boxed().collect(Collectors.toList());
        Set<Integer> ch1 = ch.stream().collect(Collectors.toSet());
        return ch.size() == ch1.size();
    }
}
