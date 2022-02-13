package com.javaschool;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
            System.out.println("Broj je djeljiv s 3");}
            else if (i % 5 == 0)
                System.out.println("Broj je djeljiv s 5");
            else if (1 % 10 == 0)
                System.out.println("Broj je djeljiv s 10");
            else System.out.println("broj nije djeljiv");
        }
    }
}