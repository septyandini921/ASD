package Praktikum10;

public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode =head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kososng");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newnNode = new Node(input);

        if (isEmpty()) {
            head = newnNode;
            tail = newnNode;
        } else {
            tail.next = newnNode;
            newnNode.prev = tail;
            tail = newnNode;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kososng");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Linked list kosong");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    //pertanyaan 

    public int getData(int index) {
        Node currentNode = head;
    
        for (int i = 0; i < index; i++) {
            if (currentNode == null) {
                System.out.println("Indeks melebihi panjang linked list");
                return -1; 
            }
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    

    public int indexxOf(int key) {
        Node currentNode = head;
        int index = 0;

        while(currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    //Tugas

    public void reversePrint() {
        if (!isEmpty()) {
            System.out.print("Isi linked list terbalik: ");
            Node currentNode = tail;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.prev;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void insertAt(int index, int key) {
        if (index == 0) {
            addFirst(key);
        } else {
            Node newNode = new Node(key);
            Node currentNode = head;

            for (int i = 0; i < index; i++) {
                if (currentNode == null) {
                    System.out.println("Index melebihi batas");
                    return;
                }
                currentNode = currentNode.next;
            }

            if (currentNode == null) {
                System.out.println("Index melebihi batas");
            } else {
                newNode.next = currentNode;
                newNode.prev = currentNode.prev;

                if (currentNode.prev != null) {
                    currentNode.prev.next = newNode;
                }

                currentNode.prev = newNode;

                // 
                if (newNode.prev == null) {
                    head = newNode;
                }
            }
        }
    }

}
