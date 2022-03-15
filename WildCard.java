public class WildCard {
    public static void main(String[] args) {
        WildCard ob = new WildCard();
        System.out.println(ob.soln("aaa","a"));
    }

    public boolean soln(String s, String p) {
        if (p.contains("*")){
            return true;
        } else {
            if (p.contains("?")){
                boolean flag = true;
                for (int i=0;i<p.length();i++){
                    char c = p.charAt(i);
                    char c1 = s.charAt(i);
                    if (c == '?') {
                        continue;
                    } else {
                        if (c != c1) {
                            flag = false;
                            break;
                        }
                    }
                }
                return flag;
            } else {
                return p.equals(s);
            }
        }
    }
}
