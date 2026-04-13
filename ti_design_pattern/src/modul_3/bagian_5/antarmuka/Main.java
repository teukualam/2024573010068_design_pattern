package Modul_3.Bagian_5.abstrak.antarmuka;

public class Main {
    public static void main(String[] args){
        Bergerak mobil1 = new Mobil();
        mobil1.bergerak();
        mobil1.berhenti();

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak();
        pesawat.berhenti();

        Bergerak.info();
    }
}
