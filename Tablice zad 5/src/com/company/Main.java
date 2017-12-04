package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj l elementów");
        int ilosc = scanner.nextInt();
        int [] liczby = new int [ilosc];

        System.out.println("Podaj wartości");
        for (int i=0; i< liczby.length; i++) {
            liczby[i] = scanner.nextInt();
        }
        int max = liczby[0];
        for (int i=0; i<liczby.length; i++){
            if ( liczby[i] > max ){
                max=liczby[i];
            }
        }
    }
}
