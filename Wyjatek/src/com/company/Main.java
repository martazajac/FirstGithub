package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int wynik = a/b;
        try {
            wynik = a / b;
        } catch (Exception ex){
            System.out.println("Nie mozna dzielic przez 0");


        }
    }
}
