package Praktikum10;

public class DLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList myDLL = new DoubleLinkedList();

        myDLL.print();;
        myDLL.addFirst(800);
        myDLL.print();
        myDLL.addFirst(700);
        myDLL.print();
        myDLL.addLast(500);
        myDLL.print();
        myDLL.removeFirst();
        myDLL.print();
        myDLL.removeLast();
        myDLL.print();
        //Tambahan untuk tugas
        myDLL.addLast(550);
        myDLL.addLast(750);
        
        myDLL.reversePrint();

        System.out.println("Data di index 0: " + myDLL.getData(0)); 
        System.out.println("Index dari elemen 800: " + myDLL.indexxOf(800)); 
        
    }
}
