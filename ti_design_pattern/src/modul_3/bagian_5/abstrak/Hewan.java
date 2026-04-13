package Modul_3.Bagian_5.abstrak;

abstract class Hewan {
    String nama;

    void makan(){
        System.out.println(nama + "Sedang Makan.");
    }

    abstract void bersuara();
}
