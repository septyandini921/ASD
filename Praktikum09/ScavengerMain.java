package Praktikum09;

import java.util.Scanner;
public class ScavengerMain{
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama ibukota Jawa Timur?", "Surabaya");
        game.addPoint("Berapakah hasil 7 + 3?", "10");
        game.addPoint("Kapan Indonesia merdeka?", "17 Agustus");
        game.addPoint("Siapa presiden pertama Indonesia", "Ir Soekarno");

        game.displayPoints();
        game.current = game.head; //tugas prak 10

        Scanner sc = new Scanner(System.in);

        // while (game.head != null) {
        //     System.out.print("Jawab: ");
        //     String answer = sc.nextLine();
        //     if (game.checkAnswer(answer)) {
        //         System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
        //     } else {
        //         System.out.println("Jawaban salah. Coba lagi.");
        //     }
        // }

        //prak 10
        while (game.current != null) {
            System.out.print(game.current.pertanyaan + "\nJawab: ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("back")) {
                if (game.moveBack()) {
                    System.out.println("Kembali ke pertanyaan sebelumnya.");
                } else {
                    System.out.println("Tidak bisa kembali ke pertanyaan sebelumnya.");
                }
            } else if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }

        //end
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc.close();
        //System.exit(0);
    }
}


