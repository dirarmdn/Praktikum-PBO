import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Toko toko = new Toko();
        Menu menu = new Menu();

        String[] namaToko, namaMenu;
        int pilihanToko;
        ArrayList<Integer> pilihanMenu = new ArrayList<>();
        int lanjut = 1;
        float totalTransaksi;

        System.out.print("Masukkan nama pembeli: ");
        String namaPembeli = input.nextLine();
        Pembeli pembeli = new Pembeli(namaPembeli);

        // Menampilkan daftar toko
        namaToko = toko.getAllNamaToko();
        System.out.printf("SELAMAT DATANG DI PUJASERA %s!\n", namaPembeli);
        System.out.println("Toko: ");
        for (int i = 0; i < namaToko.length; i++) {
            System.out.println(i + 1 + ". " + namaToko[i]);
        }

        // Memilih toko
        System.out.print("Pilihan Anda: ");
        pilihanToko = input.nextInt();

        // Menampilkan menu berdasarkan pilihan toko
        menu.setListMenu(pilihanToko);
        namaMenu = menu.getListMenu();
        System.out.println("DAFTAR MENU");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println(i + 1 + ". " + namaMenu[i]);
        }

        while (lanjut == 1) {
            System.out.print("Pilihan Anda (0 untuk selesai): ");
            int pilihan = input.nextInt();
            if (pilihan == 0) {
                break;
            }
            pilihanMenu.add(pilihan);
        }

        // Menampilkan total transaksi
        System.out.println("Transaksi Anda:");
        totalTransaksi = menu.hitungJumlahPesanan(pilihanMenu);
        for (int j = 0; j < pilihanMenu.size(); j++) {
            System.out.println("Menu " + namaMenu[pilihanMenu.get(j) - 1]);
        }
        System.out.println("Total: " + totalTransaksi);
    }
}
