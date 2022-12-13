package com.dewabrata.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        // Pembuatan object
        // Class object = new Class()
        Mobil mb = new Mobil();
        Travel tv = new Travel();
        Kendaraan kn = new Kendaraan();
       
        
        // Memasukkan nilai attribute
        mb.nama = "Miyata";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        kn.nama = "Kendaraan Misterius";
        kn.jmlRoda = 3;
        
        tv.nama = "Kilat";
        tv.jmlRoda = 4;
        tv.dayaAngkut = 11;
                
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("kanan");
        mb.belok();
        
        System.out.println("\n");
        kn.showInfo();
        kn.nyalakanMesin();
        
        System.out.println("\n");
        tv.showInfo();
        tv.nyalakanMesin();
        tv.belok("Kanan");
        tv.belok();
    }
}