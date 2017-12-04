package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //    Deklaracja
    public static void PrintMessage(String imie) {
        System.out.println("Witaj " + imie);
    }

    public static void printtab(int[] macierz) {

        for (int i = 0; i < 10; i++) {
            System.out.println(macierz[i]);

        }
    }

    public static int Silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;

    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner= new Scanner(System.in);
        int rozmiar= scanner.nextInt();
        float[] tablica = new float[rozmiar];

         float nowa=srednia[tablica];

//        int liczba = scanner.nextInt();
//        int silnia = Silnia(liczba);
//        System.out.println(silnia);
//        float[]liczby=new float[]{1,2,3,4,5};
//        float srednia = srednia(liczby);
//        System.out.println(srednia);
    }

    public static int Sumarray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }
//    Scanner scanner= new Scanner(System.in);
//    float a= scanner.nextFloat();
//    float b= scanner.nextFloat();
//    float [] tablica = new float [a];
//    funkcja, która przyjmuje tablice float i oblicza srednia
    public static float srednia (float[] sr){
        float sum= 0;
        for (int i=0; i<sr.length;i++){
         sum+=sr[i];
        }
        return sum/sr.length;
    }
    public static void inna(String[] args) {
        int myArray[] = new int[]{1, 2, 3, 4, 5};
        int result = Sumarray(myArray);
        System.out.println("Suma to " + result);
    }
    public static float[] srednbia (float[] array){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj elem tablicy");
        for (int i = 0; i < array.length; i++){
            System.out.println(("Podaj " + (i +1 )+ "element tablicy"));
            array [i]= scanner.nextFloat();
        }
        return array;
    }
    public static float[] sredniasredniazrandom(float[]array){
        Random random= new Random();
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);


        }


    }
}

