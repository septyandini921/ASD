package Praktikum09;

import java.util.Scanner;

class Pointer {
    String pertanyaan;
    String jawaban;
    Pointer next;
    Pointer prev;

    public Pointer(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
        this.prev = null;
    }
}