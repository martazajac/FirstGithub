package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        int[] tablica = new int[10];
        for (int i=0; i<tablica.length; i++){
            tablica[i]=random.nextInt(100);
        }
        System.out.println("podaj liczbe, sprawdze, czy jest");
        int szukana_liczba = scanner.nextInt();
        boolean czyObecna = false;
        for (int i=0; i<tablica.length; i++){
            if(tablica[i]==szukana_liczba){
            czyObecna=true;
                break;
            }
        }
        if(czyObecna) {
            System.out.println("jest taka liczba");}
        else {
            System.out.println("Nie ma takiej liczby");
        }

    }
}
