public class StrToNum {
    public static void main(String[] args) {
        StrToNum ob = new StrToNum();
        System.out.println(ob.solution(""));
    }
    public int solution(String s){
        String str="";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                str+=c;
            } else {
                if (c=='-' || c=='+'){
                    str+=c;
                }
            }
        }
        return Integer.parseInt(str);
    }
}
