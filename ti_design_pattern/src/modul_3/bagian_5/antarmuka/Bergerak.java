package Modul_3.Bagian_5.abstrak.antarmuka;

interface Bergerak {
    void bergerak();

    default void berhenti(){
        System.out.println("Berhenti Bergerak.");
    }

    static void info(){
        System.out.println("ini adalah interface Bergerak.");
    }
}
