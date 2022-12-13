package com.dewabrata.praktikumpbo.pertemuan6.tugas;

public class Exception3 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[3];
        array[0] = 8;
        }catch(ArrayStoreException e){
            e.printStackTrace();
        }
        System.out.println("Running....");
    }
}