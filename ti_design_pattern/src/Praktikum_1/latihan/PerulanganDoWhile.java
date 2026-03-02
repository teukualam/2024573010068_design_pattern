package Praktikum_1.Laporan.Praktikum_1;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil (Do-While):");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
        System.out.println();
    }
}
