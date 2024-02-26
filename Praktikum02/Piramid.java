package Praktikum02;

public class Piramid {
    double tinggiSegitiga;
    double rusukPersegi; 
    double tinggiPiramid;

    public Piramid(double newtinggiSegitiga, double newrusukPersegi, double newtinggiPiramid) {
        tinggiSegitiga = newtinggiSegitiga;
        rusukPersegi = newrusukPersegi; 
        tinggiPiramid = newtinggiPiramid;
        
    }

    public void hitungLuasAlas(){
        System.out.println("Luas alas: " + hitungLuasAlas(rusukPersegi));
    }
    
    public void hitungLuasPermukaan(){
        double luasPersegi = hitungLuasAlas(rusukPersegi);
        double luasSelimut = hitungLuasSegitiga(luasPersegi, luasPersegi);
        double luasPermukaan = luasSelimut*4 + luasPersegi;
        System.out.println("Luas permukaan: " + luasPermukaan);
    }
   
    public void hitungVolume(){
        double luasPersegi = hitungLuasAlas(rusukPersegi);
        double volumePiamid = (luasPersegi * tinggiPiramid) / 3.0 ;
        System.out.println("Volume piramid: " + volumePiamid);
    }
   
    public double hitungLuasAlas(double rusukPersegi) {
        double luasAlas;
        luasAlas = rusukPersegi * rusukPersegi;
        return luasAlas;
    }

    public double hitungLuasSegitiga(double rusukPersegi, double tinggiSegitiga) {
        double luasSegitiga;
        luasSegitiga= 0.5 * rusukPersegi * tinggiSegitiga;
        return luasSegitiga;
    }
}

