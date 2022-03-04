import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt ob = new RomanToInt();
        System.out.println(ob.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        int number = 0;
        Map<String, Integer> roman = new LinkedHashMap<>();
        roman.put("CM", 900);
        roman.put("CD", 400);
        roman.put("XC", 90);
        roman.put("XL", 40);
        roman.put("IX", 9);
        roman.put("IV", 4);
        Map<String, Integer> roman1 = new LinkedHashMap<>();
        roman1.put("M", 1000);
        roman1.put("D", 500);
        roman1.put("C", 100);
        roman1.put("L", 50);
        roman1.put("X", 10);
        roman1.put("V", 5);
        roman1.put("I", 1);
        String s2 = s;
        for (int i=0;i<s.length()-1;i++){
            String s1=s.substring(i,i+2);
            for (String k : roman.keySet()) {
                if (s1.equals(k)) {
                    number +=roman.get(k);
                    s2 = s2.substring(0,s2.indexOf(s1))+s2.substring(s2.indexOf(s1)+2);
                }
            }
        }
        for (int i=0;i<s2.length();i++){
            for (String k : roman1.keySet()){
                if (k.equals(String.valueOf(s2.charAt(i)))){
                    number+=roman1.get(k);
                }
            }
        }
        return number;
    }
}
