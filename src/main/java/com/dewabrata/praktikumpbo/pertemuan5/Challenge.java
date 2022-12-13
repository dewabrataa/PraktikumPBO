package com.dewabrata.praktikumpbo.pertemuan5;

import java.util.Scanner;

public class Challenge {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
      
    System.out.println("Program Menghitung Nilai Rata-rata Mahasiswa");
    System.out.println("============================================");
    System.out.println();
    
    int[] arr = new int[100];
    int jml, i;
    float total, rata2;
    
    System.out.print("Input jumlah nilai mata kuliah : ");
    jml = input.nextInt();
    
    System.out.println("Input "+jml+" nilai mata kuliah : ");
    
    for(i = 0; i < jml; i++){
      arr[i] = input.nextInt();
    }
    
    System.out.println();
    
    total = 0;
    for(i = 0; i < jml; i++){
      total = total+arr[i];
    }
   
    // hitung nilai rata-rata
    rata2 = (total/jml);
    System.out.println("Nilai rata-rata dari "+ jml + " mata kuliah adalah: "+ rata2);
    
  }
}