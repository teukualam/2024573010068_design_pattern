package Laporan1.Praktikum_1;

public class PerulanganFor {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil (For):");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
