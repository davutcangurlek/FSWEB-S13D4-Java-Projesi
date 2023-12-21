package com.workintech.encapsulation;

public class Console {
    public static void main(String[] args) {
        Player davut = new Player("Davut", -100, Weapon.SWORD);
        Player ali = new Player("Ali", 1000, Weapon.AXE);

        System.out.println(davut);
        System.out.println(ali);

        System.out.println("*************************");

        davut.restoreHealth(100);
        davut.loseHealth(50);
        System.out.println(davut.healthRemaining());

        davut.loseHealth(60);
        System.out.println(davut.healthRemaining());

        davut.email = "dk@test.com";


    }
}
