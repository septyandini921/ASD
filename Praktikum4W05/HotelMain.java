package Praktikum4W05;

public class HotelMain {
    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[5];
        hotels[0] = new Hotel("Hotel A", 1000000, 5);
        hotels[1] = new Hotel("Hotel B", 800000, 4);
        hotels[2] = new Hotel("Hotel C", 1200000, 3);
        hotels[3] = new Hotel("Hotel D", 900000, 2);
        hotels[4] = new Hotel("Hotel E", 700000, 1);
    
        // Mengurutkan berdasarkan harga
        bubbleSortHarga(hotels);
        for (Hotel hotel : hotels) {
            System.out.println(hotel.nama + ", " + hotel.harga + ", " + hotel.rating);
        }
    
        // Mengurutkan berdasarkan rating
        selectionSortRating(hotels);
        for (Hotel hotel : hotels) {
            System.out.println(hotel.nama + ", " + hotel.harga + ", " + hotel.rating);
        }
    }

    public static void bubbleSortHarga(Hotel[] hotels) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < hotels.length - 1; i++) {
                if (hotels[i].harga > hotels[i + 1].harga) {
                    Hotel temp = hotels[i];
                    hotels[i] = hotels[i + 1];
                    hotels[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void selectionSortRating(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].rating > hotels[minIndex].rating) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Hotel temp = hotels[i];
                hotels[i] = hotels[minIndex];
                hotels[minIndex] = temp;
            }
        }
    }
}

