package Modul_3.Bagian_2;

public class main {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setNama("Budi");
        mhs1.setUmur(20);

        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
    }
}
