package com.dewabrata.praktikumpbo.pertemuan3.challenge;

public class main {
    public static void main(String[] args) {
        challenge dewa = new challenge("Dewa", 19, 2002);
        challenge brata = new challenge("Brata", 29, 2003);
        challenge james = new challenge ("James", 30, 2004);
        
        dewa.showProfile();
        brata.showProfile();
        james.showProfile();
        
        System.out.println("Dewa name (before) : " + dewa.getName());
        dewa.setName("Marko");
        System.out.println("Dewa name (after) : " + dewa.getName());
        
    }
}
