import java.util.*;
import java.util.stream.Collectors;

public class ListClass {
    public static void main(String[] args) {
        ListClass ob = new ListClass();
        System.out.println(ob.reverseOnlyLetters("           YES      leading spaces        are valid,    problemsetters are         evillllll"));
    }

    public String reverseOnlyLetters(String s) {
        s=s+" ";
        List<String> word = new ArrayList<>();
        String sub = "";
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                sub+=ch;
            } else {
                word.add(sub);
                sub="";
            }
        }
        word = word.stream().filter(a->!a.equals("")).collect(Collectors.toList());
        System.out.println(word.size());
        for(String w:word){
            System.out.println(w);
        }
        return "";
    }
}
