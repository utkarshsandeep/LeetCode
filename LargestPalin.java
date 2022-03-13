public class LargestPalin {
    public static void main(String[] args) {
        LargestPalin lp = new LargestPalin();
        System.out.println(lp.soln("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
    public String soln(String s){
        String pl = "";
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                String st = s.substring(i,j+1);
                if (palin(st) && pl.length()<st.length()){
                    pl = st;
                }
            }
        }
        return pl;
    }
    public boolean palin(String str){
        String str2="";
        for (int i=0;i<str.length();i++){
            str2=str.charAt(i)+str2;
        }
        return str2.equals(str);
    }
}
