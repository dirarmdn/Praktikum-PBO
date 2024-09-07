import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiPokok = 500000, hargaItem = 50000, totalPenjualan, bonusPenjualan = 0, bonusItem, denda = 0;
        int penjualan = input.nextInt();

        // Hitung total penjualan
        totalPenjualan = penjualan * hargaItem;

        // Hitung bonus per item
        bonusItem = (int)(penjualan * (0.10 * hargaItem));

        // Hitung bonus penjualan
        if (penjualan > 80) {
            bonusPenjualan = (int)(totalPenjualan * 0.35);
        } else if (penjualan >= 40) {
            bonusPenjualan = (int)(totalPenjualan * 0.25);
        }

        // Hitung denda jika penjualan < 15
        if (penjualan < 15) {
            int minus = 15 - penjualan;
            denda = (int)(0.15 * (minus * hargaItem));
        }

        // Hitung total gaji
        int gaji = gajiPokok + bonusPenjualan + bonusItem - denda;
        System.out.println(gaji);
    }
}
