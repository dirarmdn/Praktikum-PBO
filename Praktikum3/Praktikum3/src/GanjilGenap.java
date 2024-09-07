import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plat1 = input.next(), plat2 = input.next(), plat3 = input.next(), plat4 = input.next();

        String gabungan = plat1 + plat2 + plat3 + plat4;

        long gabunganAngka = Long.parseLong(gabungan);

        long hasil = (gabunganAngka - 999999) % 5;
        if (hasil == 0) {
            System.out.println("jalan");
        } else {
            System.out.println("berhenti");
        }
    }
}
