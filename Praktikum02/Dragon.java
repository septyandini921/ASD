package Praktikum02;
public class Dragon {
    private int x, y;
    private int direction;

    public Dragon (int newx, int newy, int initialDirection) {
        x = newx;
        y = newy;
        direction = initialDirection;
    }

    public void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah baru tidak valid.");
        }
    }

    public void move (int steps){
        switch (direction) {
            case 1: // Atas
                y += steps;
                break;
            case 2: // Kanan
                x += steps;
                break;
            case 3: // Bawah
                y -= steps;
                break;
            case 4: // Kiri
                x -= steps;
                break;
            default: 
                System.out.println("invalid");
                break;
        }

    }

    public void printStatus(){
        System.out.println("Posisi naga: (" + x + ", " + y + ")");
        System.out.println("Arah naga: " + direction);
    }
}
