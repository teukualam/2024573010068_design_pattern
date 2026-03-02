package Praktikum_1.Laporan.Praktikum_1;

public class PerulanganWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil (While):");
        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
