package Praktikum03;

public class Tiket {
    public String namaTiketPenumpang;
    public long noKTP;
    public String stasiunKeberangkatan;
    public String stasiunTujuan;

    public void cetakTiketKereta() {
        System.out.println("Nama penumpang: " + namaTiketPenumpang);
        System.out.println("No KTP: " + noKTP);
        System.out.println("Tiket rute " + stasiunKeberangkatan + ", " +stasiunTujuan );
    }
}
