package PraktikumW06;

public class Sorting {
    public static void main(String[] args) {
        //sequen
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        sequentialSearch(daftarNilai, 5);

        int[] kumpulanNilai = {2,5,6,9,10};
        int indeks = binarySearch(kumpulanNilai, 9);
        if (indeks != -1) {
            System.out.println("\"Data yang ditemukan pada indeks ke-" + indeks);
        } else {
            System.out.println("tidak ditemukan");
        }
       
        //binary asc
        int[] sortedNilai = {5, 5, 10, 20, 30, 40, 50};
        int index = binarySearchAsc(sortedNilai, 5);
        if (index != -1) {
            System.out.println("Data yang ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        //binary desc
        // int[] sortedNilaiDes = {50, 40, 30, 20, 10, 5, 5};
        // int index2 = binarySearchDesc(sortedNilaiDes, 5);
        // if (index2 != -1) {
        //     System.out.println("Data yang ditemukan pada indeks ke-" + index2);
        // } else {
        //     System.out.println("Data tidak ditemukan");
        // }

    }
    
    public static void sequentialSearch(int[] arr, int key) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Data " + key + " ditemukan pada indeks ke-" + i);
                return;
            } 
            
        }
        System.out.println("Data tidak ditemukan");

        
    }
    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

        
    }
    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            //System.out.println("Array kosong");
            return -1;
        }

        if (arr[0] < arr[arr.length -1]) {
            System.out.println("data ditemukan menggunakan");
            return binarySearchAsc(arr, key);
        } else {
            return binarySearchDesc(arr, key);
        }
    }
}

