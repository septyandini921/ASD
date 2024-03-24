package Praktikum03;
import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjangArrayPp;
        int panjang, lebar;

        System.out.print("Masukkan panjang array persegi panjang: ");
        panjangArrayPp = sc.nextInt();

        PersegiPanjang [] arrayofPersegiPanjang = new PersegiPanjang[panjangArrayPp];
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(panjang, lebar);

        for (int i = 0; i<panjangArrayPp; i++) {
            
            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayofPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);
        }

        for (int i = 0; i<panjangArrayPp; i++) {
            System.out.print("Persegi panjang ke-" + (i+1));
            arrayofPersegiPanjang[i].cetakInfo();
            arrayofPersegiPanjang[i].hitungLuas();
            arrayofPersegiPanjang[i].hitungKeliling();
        }
  
    }
}
