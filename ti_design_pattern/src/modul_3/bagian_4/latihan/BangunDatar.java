package modul_3.bagian_4.latihan;

// Class ini HARUS public karena nama filenya adalah BangunDatar.java
public class BangunDatar {
    double hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
        return 0;
    }
}

// Class turunan Persegi (tanpa public)
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

// Class turunan Lingkaran (tanpa public)
class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double hitungLuas() {
        return Math.PI * r * r;
    }
}

// Class utama untuk menjalankan program (HAPUS modifier public di sini)
class LatihanOverriding {
    public static void main(String[] args) {
        // Membuat objek persegi dengan sisi 5
        Persegi p = new Persegi(5);

        // Membuat objek lingkaran dengan jari-jari 7
        Lingkaran l = new Lingkaran(7);

        // Menampilkan hasil
        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
    }
}