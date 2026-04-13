package Modul_3.Bagian_5;

interface Terbang{
    void terbang();
}

abstract class Hewan{
    String nama;

    abstract void bersuara();
}

class Burung extends Hewan implements Terbang{
    @Override
    void bersuara(){
        System.out.println("Kicau Kicau!");
    }

    @Override
    public void terbang(){
        System.out.println(nama + "sedang terbang.");
    }
}

public class Main {
    public static void main(String[] args){
        Burung burung = new Burung();
        burung.nama = "Merpati";
        burung.bersuara();
        burung.terbang();
    }
}