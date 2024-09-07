import java.util.Scanner;

public class RegEx {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
            System.out.println(splitString.length);
            for (String string : splitString) {
                System.out.println(string);
            }
        }
    }
}
