package com.dewabrata.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        // Membuat Array dab Scanner
        String[][]absen = new String[2][2];
        Scanner scan = new Scanner(System.in);
        
        // Mengisi data absen karyawan
        System.out.println("  NAMA KARYAWAN  ");
        for(int bar = 0; bar < absen.length; bar++){
            for(int kol = 0; kol < absen[bar].length;kol++){
                System.out.format("Karyawan yang sudah berangkat (%d,%d): ", bar,kol);
                absen[bar][kol] = scan.nextLine();
            }
        }
        System.out.println();
        
        // Menampilkan Array
        System.out.println("-- ABSEN KARYAWAN --");
        System.out.println("|Shift Pagi|  |Shift Malam|");
        for(int bar = 0; bar < absen.length; bar++){
            for(int kol = 0; kol < absen[bar].length; kol++){
                System.out.format("| %s | \t", absen[bar][kol]);
            }
            System.out.println("");
        }
    }
}
