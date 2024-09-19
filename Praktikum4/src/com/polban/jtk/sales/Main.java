// 2. buat package com.polban.jtk.sales
package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // 1. buat object product dengan qty 10
        Product produk = new Product("Laptop ", 8000000, 10);

        // 3. buatlah object sales
        Sales sales = new Sales(produk);

        sales.sellProduct(5);

        sales.restockProduct(5);

        sales.updateProductPrice(820000000);

        sales.updateProductPrice(-800000000);
    }
}