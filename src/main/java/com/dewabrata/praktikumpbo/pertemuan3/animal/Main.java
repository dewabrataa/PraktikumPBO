package com.dewabrata.praktikumpbo.pertemuan3.animal;

public class Main {
    // 'main' + [Tab]
    public static void main(String[] args) {
        // membuat object dari class Animal
        Animal cat = new Animal("Ireng", 3, "Black");
        Animal dog = new Animal("Marko", 4, "Brown");
        Animal rabbit = new Animal("Hope", 2, "White");
        
        // memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
        // Demo Getter & Setter
        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Marko");
        System.out.println("Dog's name (after) : " + dog.getName());
            
    }  
}