package com.dewabrata.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class tugaspraktikummodul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d;
        int log = 0;
        d = 1;
        
        String username, password;
        
        do{
            System.out.println("Program Login");
            System.out.println("-------------");
            System.out.println("\nUsername : ");
            username = input.nextLine();
            System.out.println("\nPassword : ");
            password = input.nextLine();
            
            if(username.equals("DewaBrata")&&password.equals("dewabrt")){
                System.out.println("\nAnda Berhasil Login");
                d = 4;
                log = 1;
        }else{
            System.out.println("\nAnda Gagal Login");
            d = d + 1;
        }
        }while(d <= 3);
            if(log !=1){
                System.out.println("Anda Telah Gagal Login Sebanyak 3x");
                System.out.println("Mohon Coba Lagi Nanti");
       }
    }
}
