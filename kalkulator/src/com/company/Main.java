package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner (System.in);
        int a;
        int b;
        int wynik;
        String operacja;
        System.out.println("Podaj pierwsza liczbe");
        a=scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        b=scanner.nextInt();
        System.out.println("Podaj operacje (+,-,...");
        int operacja = scanner.nextInt();
        switch (operacja){
          case "+";
                  wynik= a+b;
              break;
           case "-";
           wynik = a-b;
           break;
           case "*";
           wynik = a*b;
           break
           case "/";
           wynik = a/b;

        }
    }
}
