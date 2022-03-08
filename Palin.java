public class Palin {
    public static void main(String[] args) {
        Palin ob = new Palin();
        System.out.println(ob.solution("A man, a plan, a canal: Panama"));
    }
    public boolean solution(String s){
        s = s.toLowerCase();
        String s1="",s2="";
        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >='a' &&c<='z' || c>='0' && c<='9'){
                s1=s1+c;
                s2=c+s2;
            }
        }
        return s1.equals(s2);
    }
}
