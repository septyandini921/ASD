package Praktikum08.Klinik;

public class Queue {
    public Pasien[] antrian;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue(int max) {
        this.max = max;
        this.antrian = new Pasien[max];
        this.size = 0;
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == max);
    }
    
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            int i = front;

            while (i != rear) {
                System.out.print(antrian[i] + " ");
                i= (i+1) % max;
            }

            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah elemen: " + size);
        }
    } 

    public void clear() {
        front = rear = -1;
        size = 0;
    }

    public void enqueue(Pasien dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else if (rear == max -1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pasien dequeue() {
        Pasien temp =null;

        if (isEmpty()) {
            System.out.println("Queue masih kososng");
        } else {
            temp = antrian[front];
            size--;

            if (isEmpty()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front =0;
            } else {
                front++;
            }
        }

        return temp;
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
      
        int position = -1;
        int i = front;
      
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                position = i;
                break;
            }
            i = (i + 1) % max;
        }
      
        if (antrian[i].nama.equals(nama)) {
            position = i;
        }
      
        if (position != -1) {
            int actualPosition = (position - front + max) % max; 
            System.out.println("Pasien " + nama + " berada di posisi: " + actualPosition);
        } else {
            System.out.println("Pasien " + nama + " tidak ditemukan di queue");
        }
    }
    

}

