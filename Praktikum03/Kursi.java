package Praktikum03;

public class Kursi {
    public String namaPenumpang;
    public String gerbongKereta;
    public int barisKursi;
    public char kolomKursi;  
    
    public void cetakPosisiKursi(){
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Posisi kursi: " + gerbongKereta+ " " + barisKursi + kolomKursi);
    }
}
