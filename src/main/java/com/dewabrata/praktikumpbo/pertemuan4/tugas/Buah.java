package com.dewabrata.praktikumpbo.pertemuan4.tugas;

public class Buah {
    // Attribute
    String nama;
    String warna;
    int jml;
    
    // Method
    public void colour(){
        System.out.println("Ibu baru saja membeli buah berwarna " + warna + " di pasar.");
    }
    
    public void showInfo(){
        System.out.println("Ternyata, Ibu membeli buah " + nama + " sebanyak " + jml );
    }
}
