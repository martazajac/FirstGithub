package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("obliczanie silni");
        long n = scanner.nextInt();
        long wynik = 1;
        for (long i=1; i<=n;i++){
            wynik = wynik * i;
        }
        System.out.println("Wynik to " +wynik);
    }
}
