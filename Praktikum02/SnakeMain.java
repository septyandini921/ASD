package Praktikum02;

public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake(0,0);
        Snake snake2 = new Snake(2,3);

        System.out.println("Initial position: ");
        snake1.movePosition();
        snake2.movePosition();

        snake1.moveRight();
        snake1.moveUp();

        snake2.moveDown();
        snake2.moveLeft();
        snake2.moveLeft();

        System.out.println("\nAfter moving: ");
        snake1.movePosition();
        snake2.movePosition();

    }
}
