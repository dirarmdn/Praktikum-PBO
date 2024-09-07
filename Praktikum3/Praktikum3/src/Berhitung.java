import java.util.Scanner;

public class Berhitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int bilangan1 = input.nextInt();
        String operasi = input.next();
        int bilangan2 = input.nextInt();

        switch (operasi) {
            case "+":
                total = bilangan1 + bilangan2;
                break;
            case "-":
                total = bilangan1 - bilangan2;
                break;
            case "*":
                total = bilangan1 * bilangan2;
                break;
            case "/":
                if (bilangan2 != 0) {
                    total = bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            case "%":
                total = bilangan1 % bilangan2;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        System.out.println(total);
    }
}
