package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny napis (bez znaku$)");
        String napis = scanner.next();
        int licznik = 0;
        for (int i = 0; i < napis.length(); i++) {
            licznik++;
            char znak = napis.charAt(i);
            if (znak == '$') {
                System.out.println("niedozwolony znak");
                continue;
            }
        }
        licznik++;
    }
}