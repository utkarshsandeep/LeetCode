import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInt ob = new BigInt();
        System.out.println(ob.soln("23456789876543456", "7654567876543567"));
    }
    public String soln(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger n3 = n1.multiply(n2);
        return n3.toString();
    }
}
