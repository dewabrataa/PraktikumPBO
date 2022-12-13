package com.dewabrata.praktikumpbo.pertemuan6.tugas;

public class Exception1 {
    public static void main(String[] args) {
        String str = "Welcome to my house";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("Panjang String : " + str.length());
        
        try{
            // Mengakses elemen lebih besar dari panjang string
            System.out.println(str.charAt(30));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception Terjadi");
        }
    }
}
