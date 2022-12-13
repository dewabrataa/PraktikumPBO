package com.dewabrata.praktikumpbo.pertemuan3.tugas.dewa;

public class Main {
    public static void main(String[] args) {
        // memanggil class Dewa
        Dewa saya = new Dewa ("Dewa", 178, 68, 19);
        Dewa dia = new Dewa ("Brata", 182, 70, 21);
        
        // menjalankan Method
        saya.biodataSaya();
        dia.biodataSaya();
        
        // Menjalankan Getter & Setter dari class Dewa
        System.out.println("Tinggi badan saya(sebelum diet) : " + dia.getBerat());
        dia.setBerat(59);
        System.out.println("Tinggi badan saya (setelah diet) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Massa Tubuh saya adalah " + massa);
        
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        Uhuy hewan = new Uhuy(); // memanggil class Test
        System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Uhuy));
        System.out.println("Apakah hewan adalah Kelinci -> " + (hewan instanceof Gajah));
        System.out.println("------------------------"); // spasi
 
        Gajah gajah = new Gajah(); // Memanggil class Gajah “Gajah termasuk hewan mamalia karena melahirkan dan menyusui anaknya” 
        System.out.println("Apakah hewan adalah Objek -> " + (gajah instanceof Object));
        System.out.println("Apakah gajah adalah Hewan -> " + (gajah instanceof Uhuy));
        System.out.println("Apakah gajah adalah gajah -> " + (gajah instanceof Gajah)); 
    }
}