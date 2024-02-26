package Praktikum03;
import java.util.Scanner;
public class TiketMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = sc.nextInt();

        Tiket [] arrayTiket = new Tiket[jumlahTiket];

        for (int i = 0; i<jumlahTiket; i++ ){
            arrayTiket[i]= new Tiket();
            System.out.print("\nMasukkan nama penumpang: ");
            arrayTiket[i].namaTiketPenumpang = sc.next();
            System.out.print("Masukkan No KTP: ");
            arrayTiket[i].noKTP = sc.nextLong();
            System.out.print("Masukkan stasiun keberangkatan: ");
            arrayTiket[i].stasiunKeberangkatan = sc.next();
            System.out.print("Masukkan stasiun tujuan: ");
            arrayTiket[i].stasiunTujuan = sc.next();
        }
        
        for (int i = 0; i < jumlahTiket; i++) {
            System.out.println("\nTiket Kereta " + (i+1) + ":");
            arrayTiket[i].cetakTiketKereta();
        }
    }
    
}
