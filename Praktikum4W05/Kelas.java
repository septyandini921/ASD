package Praktikum4W05;

public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;

    public Kelas(int kuota) {
        daftarMahasiswa = new Mahasiswa [kuota];
    }

    public void add(Mahasiswa mahasiswa) {
        if (index < daftarMahasiswa.length) {
            daftarMahasiswa[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void displayInfo() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa != null) {
                mahasiswa.displayInfo();
            }
        }
    }

    public void  bubleSortByIPK() {
        int n = daftarMahasiswa.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j< n - i - 1; j++) {
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk) {
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j+1];
                    daftarMahasiswa[j+1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur() {
        int n = daftarMahasiswa.length;

        for (int i = 0; i < n - 1; i++) {
            int min_Index = i;

            for (int j = i+1; j<n; j++) {
                if (daftarMahasiswa[j].umur < daftarMahasiswa[min_Index].umur) {
                    min_Index = j;
                }
            }

            Mahasiswa temp = daftarMahasiswa[min_Index];
            daftarMahasiswa[min_Index] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
        
    }

    public void insertionSortByIPKDesc() {
        int n = daftarMahasiswa.length;

        for (int i = 1; i < n; ++i) {
            Mahasiswa key = daftarMahasiswa[i];
            int j = i - 1;

            while (j >= 0 && daftarMahasiswa[j].ipk < key.ipk) {
                daftarMahasiswa[j+1] = daftarMahasiswa[j];
                j = j-1;
            }

            daftarMahasiswa[j+1] = key;
        }
    }

    public void displayInfo(int index) {
        if (index >= 0 && index < daftarMahasiswa.length) {
            if (daftarMahasiswa[index] != null) {
                daftarMahasiswa[index].displayInfo();
            } else {
                System.out.println("Mahasiswa tidak ditemukan pada indeks " + index);
            }
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    // public boolean contains(String keyword) {
    //     return this.nama.toLowerCase().contains(keyword.toLowerCase());
    // }
    
    // public void searchByNama(String keyword) {
    //     boolean found = false;
    //     for (int i = 0; i < daftarMahasiswa.length; i++) {
    //         if (daftarMahasiswa[i].nama.toLowerCase().contains(keyword.toLowerCase())) {
    //             System.out.println("Mahasiswa ditemukan pada indeks: " + i);
    //             daftarMahasiswa[i].displayInfo();
    //             found = true;
    //         }
    //     }
    //     if (!found) {
    //         System.out.println("Mahasiswa dengan nama '" + keyword + "' tidak ditemukan.");
    //     }
    // }
    

    public void sequentialSearchByNama(String keyword) {
        boolean found = false;
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i] != null && daftarMahasiswa[i].contains(keyword)) {
                System.out.println("Mahasiswa ditemukan pada indeks: " + i);
                daftarMahasiswa[i].displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan nama '" + keyword + "' tidak ditemukan.");
        }
    }
    
     
    public void binarySearchByUmur(int umur) {
        selectionSortByUmur();
    
        int l = 0, r = daftarMahasiswa.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
    
            if (daftarMahasiswa[m].umur == umur) {
                System.out.println("Mahasiswa dengan umur " + umur + " ditemukan pada indeks: " + m);
                daftarMahasiswa[m].displayInfo();
                return;
            }
    
            if (daftarMahasiswa[m].umur > umur)
                r = m - 1;
    
            else
                l = m + 1;
        }
    
        System.out.println("Mahasiswa dengan umur " + umur + " tidak ditemukan.");
    }
    
    
    

}

