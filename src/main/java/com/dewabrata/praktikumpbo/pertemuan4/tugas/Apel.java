package com.dewabrata.praktikumpbo.pertemuan4.tugas;

public class Apel extends Buah {
    // Atribute
    String vitamin;
    
    // Method
    public void khasiat(){
        System.out.println("Menurut Penelitian, " + nama + " dapat mencegah kanker menyerang tubuh kita.");
    }
    
    public void extraInfo(){
        System.out.println("Apel banyak mengandung vitsmin " + vitamin + " yang bagus untuk tubuh kita.");
    }
}
