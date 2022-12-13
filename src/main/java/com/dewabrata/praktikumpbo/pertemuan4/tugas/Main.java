package com.dewabrata.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("BUAH-BUAHAN");
        System.out.println("1. Pisang ");
        System.out.println("2. Semangka ");
        System.out.println("3. Apel  ");
        System.out.println("4. Keluar  ");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        
        // Pembuatan Object
        Pisang pi = new Pisang();
        Buah bu = new Buah();
        Apel ap = new Apel();
        
        // Isi Nilai Attribute
        pi.nama = "Pisang";
        pi.jml = 5;
        pi.warna = "Kuning";
        pi.vitamin = "A";
        
        bu.nama = "Semangka";
        bu.warna = "Hijau";
        bu.jml = 1;
        
        ap.nama = "Apel";
        ap.jml = 3;
        ap.warna = "Merah";
        ap.vitamin = "B6";
        
        // Memanggil Method
        switch(pilihan){
            case 1 -> {
                pi.colour();
                pi.showInfo();
                pi.khasiat();
                pi.extraInfo();
            }
            
            case 2 -> {
                bu.colour();
                bu.showInfo();
            }
            
            case 3 -> {
                ap.colour();
                ap.showInfo();
                ap.khasiat();
                ap.extraInfo();
            }
            
            case 4 -> System.out.println("Anda Telah Keluar");
        }
        
    }
}
