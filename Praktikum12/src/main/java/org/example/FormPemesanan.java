package org.example;
import javax.swing.*;

public class FormPemesanan {
    public JPanel contentPane;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneField;
    private JCheckBox pizzaCheckBox;
    private JCheckBox spaghettiCheckBox;
    private JCheckBox steakCheckBox;
    private JTextField totalField;
    private JButton addButton;
    private JTextArea textArea;

    // Harga menu
    private final int PRICE_STEAK = 80000;
    private final int PRICE_SPAGHETTI = 32000;
    private final int PRICE_PIZZA = 50000;
    private int totalBayar = 0;

    public FormPemesanan() {
        // Listener untuk checkbox
        steakCheckBox.addActionListener(e -> updateTotal(steakCheckBox, PRICE_STEAK));
        spaghettiCheckBox.addActionListener(e -> updateTotal(spaghettiCheckBox, PRICE_SPAGHETTI));
        pizzaCheckBox.addActionListener(e -> updateTotal(pizzaCheckBox, PRICE_PIZZA));

        textArea.setRows(9);
        textArea.setColumns(30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Listener untuk tombol Tambah
        addButton.addActionListener(e -> tambahPesanan());
    }

    // Metode untuk mengupdate total bayar
    private void updateTotal(JCheckBox checkBox, int price) {
        if (checkBox.isSelected()) {
            totalBayar += price;
        } else {
            totalBayar -= price;
        }
        totalField.setText(String.valueOf(totalBayar));
    }

    // Metode untuk menambahkan pesanan ke textArea
    private void tambahPesanan() {
        StringBuilder pesanan = new StringBuilder();

        // Ambil data customer
        pesanan.append("Nama: ").append(nameField.getText()).append("\n");
        pesanan.append("Alamat: ").append(addressField.getText()).append("\n");
        pesanan.append("No Telp: ").append(phoneField.getText()).append("\n");

        // Tambahkan menu yang dipesan
        pesanan.append("Pesanan:\n");
        if (steakCheckBox.isSelected()) pesanan.append(" - Steak\n");
        if (spaghettiCheckBox.isSelected()) pesanan.append(" - Spaghetti\n");
        if (pizzaCheckBox.isSelected()) pesanan.append(" - Pizza\n");

        pesanan.append("============================\n");

        // Tambahkan total bayar
        pesanan.append("\tTotal Bayar: ").append(totalBayar).append("\n");

        // Tampilkan di textArea
        textArea.append(pesanan.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplikasi Pemesanan");
            frame.setContentPane(new FormPemesanan().contentPane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
