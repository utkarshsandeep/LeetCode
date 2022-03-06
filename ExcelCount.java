import java.util.ArrayList;
import java.util.List;

public class ExcelCount {
    public static void main(String[] args) {
        ExcelCount ob = new ExcelCount();
        System.out.println(ob.solution("K1:L2"));
    }
    public List<String> solution(String excel){
        List<String> answer = new ArrayList<>();
        String s1 = excel.substring(0,excel.indexOf(':'));
        String s2 = excel.substring(excel.indexOf(':')+1);

            for (char i = s1.charAt(0);i<=s2.charAt(0);i++){
                for (char j = s1.charAt(1);j<=s2.charAt(1);j++){
                    answer.add(i+""+j);
                }
            }

        return answer;
    }
}
