package Praktikum03;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang (int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    public void cetakInfo() {
        int i = 0;
        System.out.println(" panjang: " + panjang +  ", lebar: " + lebar + " Luas persegi panjang: " + hitungLuas() +  ", Keliling Persegi Panjang: " + hitungKeliling());
    }

    public int hitungLuas() {
        int luasPersegiPanjang = panjang * lebar;
        return luasPersegiPanjang;
        
    }

    public int hitungKeliling () {
        int kelilingPersegiPanjang = 2*(panjang + lebar);
        return kelilingPersegiPanjang;
    }
    
}
