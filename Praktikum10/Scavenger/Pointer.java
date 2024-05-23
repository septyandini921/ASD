package Praktikum10.Scavenger;

import javafx.scene.effect.Light.Point;

public class Pointer {
    String question;
    String answer;
    Point nextPoint;
    Point prevPoint;

    Pointer(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
        this.prevPoint = null;
    }

}
