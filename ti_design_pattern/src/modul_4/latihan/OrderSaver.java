package modul_4.latihan;

import java.io.FileWriter;
import java.io.IOException;

public class OrderSaver {
    public void saveOrder(Order order) {
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(order.getProduct() + " - " + order.getQuantity() +
                    " - Rp" + order.calculateTotal() + "\n");
            System.out.println("Pesanan telah disimpan!");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
        }
    }
}