import java.math.BigDecimal;

public class LastWord {
    public static void main(String[] args) {
        LastWord ob = new LastWord();
        System.out.println(ob.solution("   fly me   to   the moon  "));
        int a[] = ob.solution2(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
        for (int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public int solution(String str){
        str=str.trim();
        String[] data = str.split(" ");
        return data[data.length-1].length();
    }
    public int[] solution2(int a[]){
        BigDecimal n = BigDecimal.ZERO;
        n.add(BigDecimal.valueOf(0));
        for(int i=0;i<a.length;i++){
            n=n.multiply(BigDecimal.valueOf(10));
            n=n.add(BigDecimal.valueOf(a[i]));
        }
        n = n.add(BigDecimal.valueOf(1));
        String str = String.valueOf(n);
        int aa[] = new int[str.length()];
        for (int i =0;i<str.length();i++){
            aa[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return aa;
    }
}
