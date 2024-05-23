package Praktikum08.Klinik;
import java.util.Scanner;
public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;
        
        Queue myQueue = new Queue(kapasitas);

        do {
        System.out.println("\nMasukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. clear");
        System.out.println("6. Peek Rear");
        System.out.println("7. Peek position");
        System.out.println("8. Exit");
        System.out.println("-----------------------------------");
        menu = sc.nextInt();
        sc. nextLine();

        switch (menu) {
            case 1: 
                System.out.println("Masukkan nama: ");
                String nama = sc.nextLine();
                System.out.println("Masukkan no ID: ");
                String noID = sc.next();
                System.out.println("Masukkan jenis kelamin: ");
                char jenisKelamin = sc.next().charAt(0);
                
                Pasien newPasien = new Pasien(nama, noID, jenisKelamin);
                myQueue.enqueue(newPasien);
                break;
            case 2:
                Pasien deletedData = myQueue.dequeue();

                if (deletedData != null) {
                    System.out.println("Data yang dikeluarkan: ");
                    System.out.println(deletedData);
                }
                break;
            case 3:
                myQueue.print();
                break;
            case 4:
                myQueue.peek();
                break;
            case 5:
                myQueue.clear();
                break;
            case 6:
                myQueue.peekRear();
                break;
            case 7:
            System.out.println("Masukkan nama yang dicari : " );
            String namaPasien = sc.nextLine();
            myQueue.peekPosition(namaPasien);
            break;
        }

        } while (menu >= 1 && menu <= 7);
    }
}
