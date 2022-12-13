package com.dewabrata.praktikumpbo.pertemuan5;

public class Array2 {
    public static void main(String[] args) {
        // Pembuatan Array
        String[] names = {"Rain", "Thunder", "Strom"};
        
        // Cek Panjang Array
        System.out.println("Panjang Array : " + names.length);
        
        // Menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i +": " + names[i]);
        }
    }
}