package Modul_3.Bagian_5.abstrak;

public class Main {
    public static void main(String[] args){
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.makan();
        kucing.bersuara();

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan();
        anjing.bersuara();
    }
}
