package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int max;
//        wczytywanie liczb
        System.out.println("Podaj pierwsza liczbe");
        a = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        b = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe");
        c = scanner.nextInt();
//        porównanie
        if ((a > b) && (a > c)) {
            System.out.println("Najwieksze a");
        } else if ((b > c) && (b > a)) {
            System.out.println("Największe b");
        } else if ((c > a) && (c > b)) {
            System.out.println("Największe c");
        }
        if ((a < b) && (a < c)) {
            System.out.println("Najmniejsze a");
        } else if ((b > c) && (b > a)) {
            System.out.println("Najmniejsze b");
        } else if ((c < a) && (c < b)) {
            System.out.println("Najmniejsze c");
        }
        if(a>b){
            max=a
        }
        else {
            max=b;

        }
    }
    }



