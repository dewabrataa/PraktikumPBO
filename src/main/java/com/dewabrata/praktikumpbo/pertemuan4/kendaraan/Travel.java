package com.dewabrata.praktikumpbo.pertemuan4.kendaraan;

public class Travel extends Kendaraan {
 int dayaAngkut;
    
    public void belok(String arah){
        System.out.println("Travel " + nama + " belok ke " + arah + "!");
    }
    
    public void belok(){
        System.out.println("Error : Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Daya Angkut Travel : " + dayaAngkut + " orang");
    }    
}

