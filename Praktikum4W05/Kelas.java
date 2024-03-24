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
            mahasiswa.displayInfo();
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

    }

