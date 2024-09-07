import java.math.BigInteger;
import java.util.Scanner;

public class BiggInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger(), b = input.nextBigInteger();

        BigInteger addition = a.add(b);
        BigInteger multiply = a.multiply(b);
        System.out.println(addition);
        System.out.println(multiply);
    }
}
