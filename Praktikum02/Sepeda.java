package Praktikum02;

public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda () {
        
    }
    
    public Sepeda (float newKecepatan, int newGear) {
        kecepatan = newKecepatan;
        gear = newGear;
    }

    

    public void tambahKecepatan(float increment) {
        //kecepatan maksimum 20
        if (kecepatan <= 20) {
            kecepatan += increment;
        } else {
            kecepatan = 20;
        }
    }

    public void kurangiKecepatan(float decrement) {  
        //kecepatan minimum = 0
        if (kecepatan >= 0) {
            kecepatan -= decrement;
        } else {
            kecepatan = 0;
        }

    }
    
    public void cetakInfo() {
        System.out.println("kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("===================");
    }
}
