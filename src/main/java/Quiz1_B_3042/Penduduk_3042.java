package Quiz1_B_3042;

import java.util.Scanner;

public class Penduduk_3042 {
    // Attribute
    String nik_3042;
    String nama_3042;
    int umur_3042;
    String alamat_3042;
    Scanner input = new Scanner(System.in);
    
    // Method
    public void tampilDataPenduduk(){
        System.out.println("NIK : " + nik_3042);
        System.out.println("Nama : " + nama_3042);
        System.out.println("Umur : " + umur_3042);
        System.out.println("Alamat : " + alamat_3042);
        extraInfo();
    }
    
    public void extraInfo(){}
}
