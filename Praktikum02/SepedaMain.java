package Praktikum02;

public class SepedaMain {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(5,1);
        sepeda1.tambahKecepatan(3);
        sepeda1.cetakInfo();

        Sepeda sepeda2 = new Sepeda();
        sepeda2.kecepatan = 7;
        sepeda2.gear = 1;
        sepeda2.cetakInfo();
    }
}










//bisa terhubung karena aksesnya public dan berada dalam 1 folder
//method dipanggil
//atribut diakses, dimodifikasi