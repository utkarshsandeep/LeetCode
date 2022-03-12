import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reverseword {
    public static void main(String[] args) {
        Reverseword ob = new Reverseword();
        System.out.println(ob.soln("Test1ng-Leet=code-Q!"));
    }
    public String soln(String s){
        String revword = "";
        Map<Integer, Character> ch = new LinkedHashMap<>();
        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                revword=c+revword;
            } else {
                ch.put(i,c);
            }
        }
        for (int i : ch.keySet()){
            if (i == s.length()-1)
                revword = revword+ch.get(i);
            else
            revword = revword.substring(0,i)+ch.get(i)+revword.substring(i);
        }
        return revword;
    }
}
