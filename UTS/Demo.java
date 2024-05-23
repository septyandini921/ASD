package UTS;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        PengunjungWahana[] daftarPengunjung = new PengunjungWahana[10];
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int count = 0;
        
        
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Lihat Data");
            System.out.println("4. Laporan");
            System.out.println("5. Exit");
            System.out.print("Pilih menu:  ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                if (count < 10) {
                    System.out.print("Kategori pengunjung (anak-anak/dewasa): ");
                    String kategori = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    int biaya = 0;
                    if (kategori.equals("dewasa")) {
                        biaya = (20000 * durasi);
                    } else if (kategori.equals("anak-anak")) {
                        biaya = (10000 * durasi);
                    }
                    System.out.println("Biaya: " + biaya);
                    PengunjungWahana pengunjung = new PengunjungWahana(kategori, nama, durasi, biaya);
                    daftarPengunjung[count] = pengunjung;
                    count++;
                } else {
                    System.out.println("Daftar sudah penuh!");
                }
                

                break;
                 case 2:
                System.out.print("Masukkan nama yang ingin dicari: ");
                    String keyword = sc.nextLine();
                    sequentialSearch(daftarPengunjung, count, keyword);
                
                break;
                // case 3:
                // displayAllData(daftarPengunjung, count);
                // case 4:
                // pengunjung.Laporan();
                // break;
                case 5:
                running = false;
                break;
                default: 
                System.out.println("Menu invalid");

            }

    
        }

        sc.close();
    }

    public static void sequentialSearch(PengunjungWahana[] array, int count, String keyword) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (array[i].nama.toLowerCase().contains(keyword.toLowerCase())) {
                array[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Pengunjung dengan nama '" + keyword + "' tidak ditemukan.");
        }
    }
    
}
