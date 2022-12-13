package Quiz1_B_3042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Nelayan_3042 nl = new Nelayan_3042();
        Penduduk_3042 pd = new Penduduk_3042();
        
        nl.nik_3042 = "Jawa Tengah";
        nl.nama_3042 = "Dewa";
        nl.umur_3042 = 40;
        nl.alamat_3042 = "Purwokerto";
        nl.jmlBeratIkan_3042 = 50;
        nl.jmlSolar_3042 = 9;
        
        nl.nik_3042 = "Jawa Tengah";
        nl.nama_3042 = "Bambang";
        nl.umur_3042 = 40;
        nl.alamat_3042 = "Purwokerto";
        nl.jmlBeratIkan_3042 = 7;
        nl.jmlSolar_3042 = 7;
        
        nl.tampilDataPenduduk();
        nl.tampilDataNelayan();
        nl.totalPendapatanNelayan();
    }
}
