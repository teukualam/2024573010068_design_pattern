package Modul_3.Bagian_3.Pewarisan;

class Mobil extends Kendaraan {
    int jumlahPintu;

    void displayInfoMobil(){
        displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
