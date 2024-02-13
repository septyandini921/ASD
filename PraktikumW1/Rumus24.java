package PraktikumW1;
import java.util.Scanner;
public class Rumus24 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        
        do{
            System.out.println("\n==Menu==");
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung waktu");
            System.out.println("4. exit");
            System.out.print("Menu yang dipilih: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                case 4:
                    continue;    
                default: 
                    System.out.println("\n ==Pilihan tidak valid, silahkan memilih ulang==");
                    break;
            }
        } while ( menu !=  4);
    }
    //function
    static void kecepatan(){
        int s, t;
        System.out.println("\nMenghitung Kecepatan ");
        System.out.print("diketahui jarak (m)=  ");
        s=sc.nextInt();
        System.out.print("diketahui waktu (s)= ");
        t=sc.nextInt();
        System.out.println("Kecepatan adalah " + (s/t) + " m/s");
    }
    static void jarak(){
        int v, t;
        System.out.println("\nMenghitung Jarak ");
        System.out.print("diketahui kecepatan (m/s)= ");
        v=sc.nextInt();
        System.out.print("diketahui waktu (s)= ");
        t=sc.nextInt();
        System.out.println("jarak adalah " + (v*t) + " m");
    }
    static void waktu(){
        int v, s;
        System.out.println("\nMenghitung Waktu ");
        System.out.print("diketahui jarak (m)=  ");
        s=sc.nextInt();
        System.out.print("diketahui kecepatan (t)= ");
        v=sc.nextInt();
        System.out.println("Waktu adalah " + (s/v) + " s");
    }
}
