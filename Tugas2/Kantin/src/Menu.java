import java.util.ArrayList;

public class Menu {
    private String[] listMenu;
    private int[] listHarga;

    public String[] getListMenu() {
        return listMenu;
    }

    public void setListMenu(int pilihanToko) {
        switch (pilihanToko) {
            case 1:
                this.listMenu = new String[]{"Nasi Rendang (20k)", "Nasi Ayam Pop (17k)", "Nasi Telur Dadar (12k)", "Es Teh Tawar (7k)"};
                this.listHarga = new int[]{20000, 17000, 12000, 7000};
                break;
            case 2:
                this.listMenu = new String[]{"Nasi Ayam Geprek Cianjur (15k)", "Nasi Ayam Geprek Cianjur Hot (16k)", "Ice Tea (15k)"};
                this.listHarga = new int[]{15000, 16000, 15000};
                break;
            case 3:
                this.listMenu = new String[]{"Nasi Ayam Katsu (15k)", "Bento Katsu (20k)", "Ocha (12k)"};
                this.listHarga = new int[]{15000, 20000, 12000};
                break;
            default:
                this.listMenu = new String[0];
                this.listHarga = new int[0];
                break;
        }
    }

    public float hitungJumlahPesanan(ArrayList<Integer> pilihanMenu) {
        float totalTransaksi = 0;
        for (int pilihan : pilihanMenu) {
            if (pilihan >= 0 && pilihan < listHarga.length) {
                totalTransaksi += listHarga[pilihan-1];
            }
        }
        return totalTransaksi;
    }
}
