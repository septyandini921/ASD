package UTS;

import java.util.Scanner;
public class PengunjungWahana {
    static Scanner sc = new Scanner(System.in);
    public String kategori;
    public String nama;
    public int durasi;
    public int biaya;

    public PengunjungWahana (String kategori, String nama, int durasi, int biaya) {
        this.kategori= kategori;
        this.nama= nama;
        this.durasi= durasi;
        this.biaya= biaya;

    }

    public void InputData (String kategori, String nama, int durasi, int biaya) {

        System.out.print("Kategori pengunjung: ");
        kategori=sc.nextLine();
        System.out.print("Nama: ");
        nama=sc.nextLine();
        System.out.print("Durasi: ");
        durasi=sc.nextInt();
        if (kategori.equals("dewasa")) {
            biaya = (20000 * durasi);
        } else if (kategori.equals("anak-anak")) {
            biaya = (10000 * durasi);
        }
        System.out.println("Biaya: " + biaya);
        
        

    }

    public void displayInfo() {
        System.out.println("Kategori: " + kategori);
        System.out.println("Nama: " + nama);
        System.out.println("Durasi: " + durasi);
        System.out.println("Biaya: " + biaya);
    }

    

    public static void displayAllData(PengunjungWahana[] array, int count) {
        System.out.println("Data Pengunjung:");
        for (int i = 0; i < count; i++) {
            array[i].displayInfo();
        }
    }

    public static void generateReport(PengunjungWahana[] array, int count) {
        int totalBiayaDewasa = 0;
        int totalBiayaAnak = 0;
        for (int i = 0; i < count; i++) {
            if (array[i].kategori.equals("dewasa")) {
                totalBiayaDewasa += array[i].biaya;
            } else if (array[i].kategori.equals("anak-anak")) {
                totalBiayaAnak += array[i].biaya;
            }
        }
        System.out.println("Total pendapatan dari pengunjung dewasa: " + totalBiayaDewasa);
        System.out.println("Total pendapatan dari pengunjung anak-anak: " + totalBiayaAnak);
    }


    
}

