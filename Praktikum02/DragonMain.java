package Praktikum02;
public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(0, 0, 1);
        Dragon dragon2 = new Dragon(5, 5, 3);

        dragon1.changeDirection(2);

        dragon2.move(3);

        dragon1.printStatus();
        dragon2.printStatus();
    }
    
}
