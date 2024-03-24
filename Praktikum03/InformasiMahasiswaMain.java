package Praktikum03;
import java.util.Scanner;
public class InformasiMahasiswaMain {

    public static void main(String[] args) {
        int jumlahMahasiswa;
        Scanner sc = new Scanner(System.in);
        InformasiMahasiswa [] arrayInformasiMahasiswas = new InformasiMahasiswa[3];

        for (int i = 0; i< arrayInformasiMahasiswas.length ; i++) {
            arrayInformasiMahasiswas[i] = new InformasiMahasiswa();
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            arrayInformasiMahasiswas[i].nama = sc.next();
            System.out.print("NIM: ");
            arrayInformasiMahasiswas[i].NIM = sc.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            arrayInformasiMahasiswas[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("IPK: ");
            arrayInformasiMahasiswas[i].IPK = sc.nextDouble();

        }

        double totalIPK = 0;
        
        

        for (InformasiMahasiswa mahasiswa : arrayInformasiMahasiswas) {
            System.out.println("\nMahasiswa");
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.NIM);
            System.out.println("Jenis Kelamin: " + mahasiswa.jenisKelamin);
            System.out.println("IPK: " + mahasiswa.IPK);

            totalIPK += mahasiswa.IPK;
        }
        double rataRataIPK = totalIPK/3;
        System.out.printf("\nRata-rata IPK:%.2f ", rataRataIPK);
        
    }


    
}
