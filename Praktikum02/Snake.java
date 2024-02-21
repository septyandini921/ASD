package Praktikum02;
public class Snake {
    int x;
    int y;

    public Snake (int newx, int newy) {
        x = newx;
        y = newy;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void movePosition() {
        System.out.println("Snake position: ( " + x + "," + y + " )" );
    }
    
}
