package modul_4.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();

        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        // Membuat objek Order
        Order order = new Order(product, quantity, price);

        // Menjalankan tugas sesuai tanggung jawab masing-masing kelas
        OrderSaver saver = new OrderSaver();
        saver.saveOrder(order);

        OrderPrinter printer = new OrderPrinter();
        printer.printReceipt(order);
    }
}