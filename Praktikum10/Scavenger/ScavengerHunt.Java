package Praktikum10.Scavenger;

import java.util.Scanner;

public class ScavengerHunt {
    Point startPoint;
    Point currentPoint;

    void addPoint(String question, String answer) {
        Point newPoint = new Point(question, answer);
        if (startPoint == null) {
            startPoint = newPoint;
            currentPoint = startPoint;
        } else {
            Point current = startPoint;
            while (current.nextPoint != null) {
                current = current.nextPoint;
            }
            current.nextPoint = newPoint;
            newPoint.prevPoint = current;
        }
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);
        currentPoint = startPoint;
        while (currentPoint != null) {
            System.out.println("Pertanyaan: " + currentPoint.question);
            System.out.print("Masukkan jawaban Anda: ");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(currentPoint.answer)) {
                System.out.println("Benar! Pindah ke poin berikutnya.\n");
                currentPoint = currentPoint.nextPoint;
            } else {
                System.out.println("Salah! Coba lagi atau ketik 'kembali' untuk kembali ke pertanyaan sebelumnya.");
                userAnswer = scanner.nextLine().trim();
                if (userAnswer.equalsIgnoreCase("kembali") && currentPoint.prevPoint != null) {
                    currentPoint = currentPoint.prevPoint;
                } else if (!userAnswer.equalsIgnoreCase("kembali")) {
                    System.out.println("Jawaban salah, silakan coba lagi.");
                }
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama ibukota Jawa Timur?", "Surabaya");
        game.addPoint("Berapakah hasil 7 + 3?", "10");
        game.addPoint("Kapan Indonesia merdeka?", "17 Agustus");
        game.addPoint("Siapa presiden pertama Indonesia", "Ir Soekarno");

        game.playGame();
    }
}