package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]tablica= new int[]{1,2,3,4,5,6,7,8,9,10};
        int wynik =0;
        for(int elem :tablica){
            System.out.println(elem);
            wynik += elem;
        }
        System.out.println("Suma elementów to: " +wynik);

    }
}
