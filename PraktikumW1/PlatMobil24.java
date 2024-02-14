package PraktikumW1;
import java.util.Scanner;
public class PlatMobil24 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char kodeInput;
        char periksaKembali;
        char KODE [] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char KOTA [][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A','Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'},
        };

        do {
            System.out.println("\nInputkan kode plat nomor: ");
            kodeInput=sc.next().charAt(0);

            int kodeIndex = -1;
            for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                kodeIndex = i;
                break;
            }
        }

        if (kodeIndex != -1) {
            for (char c : KOTA[kodeIndex]) {
                System.out.print(c);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat tidak valid.");
        }

        System.out.println("Apakah anda ingin memeriksa kode play kembali? (y/t)");
        periksaKembali=sc.next().charAt(0);
            
        } while (periksaKembali == 'y' || periksaKembali == 'Y');

        




    }
}
