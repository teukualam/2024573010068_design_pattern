package modul_3.bagian_4.latihan;

// Class ini tetap public karena namanya sama dengan nama file: Matematika.java
public class Matematika {
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}

// HAPUS kata 'public' di sini agar bisa digabung dalam file Matematika.java
class LatihanOverloading {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        System.out.println("Tambah 2 int: " + mtk.tambah(10, 20));
        System.out.println("Tambah 3 int: " + mtk.tambah(10, 20, 30));
        System.out.println("Tambah 2 double: " + mtk.tambah(10.5, 2.5));
    }
}