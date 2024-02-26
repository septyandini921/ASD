package Praktikum03;
import java.util.Scanner;
public class KursiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah penumpang: ");
        int penumpang = sc.nextInt();

        Kursi [] arrayKursi = new Kursi[penumpang];

        for (int i = 0; i<penumpang; i++ ){
            arrayKursi[i]= new Kursi();
            System.out.print("\nMasukkan nama penumpang: ");
            arrayKursi[i].namaPenumpang = sc.next();
            System.out.print("Masukkan Gerbong kereta: ");
            arrayKursi[i].gerbongKereta = sc.next();
            System.out.print("Masukkan baris kursi: ");
            arrayKursi[i].barisKursi = sc.nextInt();
            System.out.print("Masukkan kolom kursi: ");
            arrayKursi[i].kolomKursi = sc.next().charAt(0);
        }
        
        for (int i = 0; i < penumpang; i++) {
            System.out.println("\nData Kursi " + (i+1) + ":");
            arrayKursi[i].cetakPosisiKursi();
        }
        
    }
    
}
