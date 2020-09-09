package com.soft.train.java.collections;

import java.util.Scanner;

public class Scannerplay {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);
        System.out.println("bana girdi gir : ");
        String nextLoc = scannerLoc.nextLine();

        System.out.println("Şunu girdiniz : " + nextLoc);

        System.out.println("int gir : ");
        int res = scannerLoc.nextInt();

        System.out.println("Şunu girdiniz : " + res);

    }
}
