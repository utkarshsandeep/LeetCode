import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class NumToEng {
    public static void main(String[] args) {
        NumToEng ob = new NumToEng();
        System.out.println(ob.convert(100000));
    }
    public String convert(int num){
        long num1=num;
        String engNum = "";
        Map<Integer, String> word = new LinkedHashMap<>();
        word.put(1,"One");
        word.put(2,"Two");
        word.put(3,"Three");
        word.put(4,"Four");
        word.put(5,"Five");
        word.put(6,"Six");
        word.put(7,"Seven");
        word.put(8,"Eight");
        word.put(9,"Nine");
        word.put(10,"Ten");
        word.put(11,"Eleven");
        word.put(12,"Twelve");
        word.put(13,"Thirteen");
        word.put(14,"Fourteen");
        word.put(15,"Fifteen");
        word.put(16,"Sixteen");
        word.put(17,"Seventeen");
        word.put(18,"Eighteen");
        word.put(19,"Nineteen");
        word.put(20,"Twenty");
        word.put(30,"Thirty");
        word.put(40,"Forty");
        word.put(50,"Fifty");
        word.put(60,"Sixty");
        word.put(70,"Seventy");
        word.put(80,"Eighty");
        word.put(90,"Ninety");
        if (num == 0)
        {
            engNum = "Zero";
        } else {
            while (num != 0) {
                if (num < 100) {
                    if (Objects.nonNull(word.get(num))) {
                        engNum += word.get(num) +" ";
                        break;
                    }
                    int n1 = num / 10 * 10;
                    int n2 = num % 10;
                    engNum += word.get(n1) + " " + word.get(n2) +" ";
                    break;
                } else if (num < 1000) {
                    engNum += word.get(num / 100) + " Hundred ";
                    num = num % 100;
                } else if (num < 100000) {
                    int n1 = num / 1000;
                    if (Objects.nonNull(word.get(n1))) {
                        engNum += word.get(n1) + " Thousand ";
                    } else {
                        int n2 = n1 / 10 * 10;
                        int n3 = n1 % 10;
                        engNum += word.get(n2) + " " + word.get(n3) + " Thousand ";
                    }
                    num = num % 1000;
                } else if (num < 1000000) {
                    engNum += word.get(num / 100000) + " Hundred ";
                    num = num % 100000;
                    if (num<1000)
                        engNum+= "Thousand ";
                } else if (num < 100000000) {
                    int n1 = num / 1000000;
                    if (Objects.nonNull(word.get(n1))) {
                        engNum += word.get(n1) + " Million ";
                    } else {
                        int n2 = n1 / 10 * 10;
                        int n3 = n1 % 10;
                        engNum += word.get(n2) + " " + word.get(n3) + " Million ";
                    }
                    num = num % 1000000;
                } else if (num < 1000000000) {
                    engNum += word.get(num / 100000000) + " Hundred ";
                    num = num % 100000000;
                    if (num<1000000)
                        engNum+= "Million ";
                } else if (num1 < 100000000000L) {
                    int n1 = num / 1000000000;
                    if (Objects.nonNull(word.get(n1))) {
                        engNum += word.get(n1) + " Billion ";
                    } else {
                        int n2 = n1 / 10 * 10;
                        int n3 = n1 % 10;
                        engNum += word.get(n2) + " " + word.get(n3) + " Billion ";
                    }
                    num = num % 1000000000;
                }
            }
        }
        return engNum.trim();
    }
}
