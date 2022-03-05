public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix ob = new LongestCommonPrefix();
        System.out.println(ob.solution(new String[]{"dog","flow","cat"}));
    }
    public String solution(String arr[]){
        String common = "";
        int l = arr[0].length(),j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i].length()<l){
                l=arr[i].length();
                j=i;
            }
        }
        for (int i=1;i<=l;i++){
            int c=0;
            String a = arr[j].substring(0,i);
            for (int k =0;k<arr.length;k++){
                String b = arr[k].substring(0,i);
                if (!a.equals(b)){
                    c=1;
                }
            }
            if (c==0)
                common = a;
        }
        return common;
    }
}
