import java.util.Scanner;

public class IOTest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        int number = 0;

        System.out.println("====================");
        for (int i = 0; i < 3; i++) {
            s = input.next();
            number = input.nextInt();

            String[] kata = s.split(" ");
            System.out.format("%-15s%03d%n", s, number);
        }
        System.out.println("====================");
    }
}
