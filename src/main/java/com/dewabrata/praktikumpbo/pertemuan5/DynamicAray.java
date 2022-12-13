package com.dewabrata.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class DynamicAray {
    public static void main(String[] args) {
        // Deklarasi Scanner untuk user input nanti
        Scanner input = new Scanner(System.in);
        
        // Membuat agar panjang array ditentukan input user
        System.out.println("-- Program Input Nilai --");
        System.out.print("Masukkan jumlah matkul : ");
        int jml = input.nextInt();
        System.out.println();
        
        // Membuat array baru dengan panjang sesuai input user
        int[] nilai = new int[jml];
        
        // Memasukkan nilai ke array
        for(int i=0; i<jml; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();    
        }
        System.out.println();
        
        // Menampilkan semua nilai array
        for(int i=0; i<jml; i++){
            System.out.println(i + ": " + nilai[i]);
        }
    }
}
