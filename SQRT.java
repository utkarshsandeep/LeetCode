public class SQRT {
    public static void main(String[] args) {
        SQRT ob = new SQRT();
        System.out.println(ob.soln(8));
    }
    public int soln(int x){
        double y = Math.sqrt(x);
        return (int) y;
    }
}
