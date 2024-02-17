package PraktikumW1;
import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namaMatkul = new String[10];
        double[] nilaiAngka = new double[10];
        String[] nilaiHuruf = new String[10];
        double[] bobotNilai = new double[10];
        int[] bobotSKS = new int[10];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < 10; i++) {  //loop inputan
            System.out.print("\nMasukkan Nama Mata Kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Masukkan Nilai Angka Mata Kuliah ke-" + (i + 1) + ": ");
            nilaiAngka[i] = sc.nextDouble();
            System.out.print("Masukkan Bobot SKS Mata Kuliah ke-" + (i + 1) + ": ");
            bobotSKS[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Masukkan Nilai Huruf Mata Kuliah ke-" + (i + 1) + ": ");
            nilaiHuruf[i] = sc.nextLine();

            //konversi nilai huruf ke nilai angka
            if (nilaiHuruf[i].equalsIgnoreCase("A")) {
                bobotNilai[i] = 4.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("B+")) {
                bobotNilai[i] = 3.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("B")) {
                bobotNilai[i] = 3.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C+")) {
                bobotNilai[i] = 2.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("C")) {
                bobotNilai[i] = 2.0;
            } else if (nilaiHuruf[i].equalsIgnoreCase("D")) {
                bobotNilai[i] = 1.0;
            } else {
                bobotNilai[i] = 0.0;
            }
        }

        //cetak data inputan
        System.out.println("======================");
        System.out.println("Data Mata Kuliah yang Diinputkan");
        System.out.println("======================");
        System.out.println("MK\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%s\t\t%.2f\t\t%s\t\t%.2f", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]));
        }

        //hitung ip
        double totalBobot = 0;
        double totalNilai = 0;
        for (int i = 0; i < 10; i++) {
            totalBobot += bobotSKS[i] * bobotNilai[i];
            totalNilai += nilaiAngka[i] * bobotSKS[i];
        }
        
        double totalBobotSKS = 0;
        double totalSKS = 0;
        for (int i = 0; i < 10; i++) {
            totalBobotSKS += bobotNilai[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        double ip = totalBobotSKS / totalSKS;

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("IP: " + ip);
    }
}