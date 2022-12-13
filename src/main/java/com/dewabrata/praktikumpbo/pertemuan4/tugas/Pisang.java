package com.dewabrata.praktikumpbo.pertemuan4.tugas;

public class Pisang extends Buah {
    // Atribute
    String vitamin;
    
    // Method
    public void khasiat(){
        System.out.println("Menurut Penelitian, " + nama + " dapat memperlancar pencernaan kita.");
    }
    
    public void extraInfo(){
        System.out.println("Pisang banyak mengandung vitamin " + vitamin + " yang bagus untuk tubuh kita.");
    }
}
