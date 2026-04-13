package Modul_3.Bagian_3.Pewarisan.Komposisi;

class Mobil {
    private final Mesin mesin;

    public Mobil(){
        this.mesin = new Mesin();
    }

    void mulai(){
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan");
    }

    void berhenti(){
        mesin.matikan();
        System.out.println("Mobil Berhenti.");
    }
}
