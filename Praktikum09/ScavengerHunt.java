package Praktikum09;

import javafx.scene.effect.Light.Point;

public class ScavengerHunt {
    Pointer head;
    Pointer tail;
    Pointer current;
    Pointer startPoint;

    public ScavengerHunt() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    public void addPoint(String question, String answer) {
        Pointer newPoint = new Pointer(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            // Pointer current = head;
            // while (current.next != null) {
            //     current = current.next;
            // }
            // current.next = newPoint;

            tail.next = newPoint;
            newPoint.prev = tail;
            tail = newPoint;
        }
    }

    public void displayPoints() {
        Pointer current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            // if (head.jawaban.equalsIgnoreCase(userAnswer)) {
            //     head = head.next;
            //     return true;
            // }
            if (current.jawaban.equalsIgnoreCase(userAnswer)) {
                current = current.next;
                return true;
            }
        }
        return false;
    }

    // prak 10
    public boolean moveBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return true;
        }
        return false;
    }
}