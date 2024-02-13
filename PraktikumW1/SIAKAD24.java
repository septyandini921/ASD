package Praktikum01;
import java.util.Scanner;
public class SIAKAD24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pancasila;
        int KTI;
        int matDas;
        int CTPS;
        int bIng;
        int daspro;
        int pDaspro;
        int k3;
        //nilai dibuat array
        //input program: nama matkul, bobot SKS, nilai huruf

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        System.out.print("Masukkan nilai Angka untuk MK Pancasila: ");
        pancasila=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Konsep Teknologi Informasi: ");
        KTI=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Critical Thinking dan Problem Solving: ");
        CTPS=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Matematika Dasar: ");
        matDas=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Bahasa Inggris: ");
        bIng=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Dasar Pemrograman: ");
        daspro=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Praktikum Dasar Pemrograman: ");
        pDaspro=sc.nextInt();
        System.out.print("Masukkan nilai Angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        k3=sc.nextInt();

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK   Nilai Angka  Nilai Huruf    Bobot Nilai");
        
    }
}