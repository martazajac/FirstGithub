package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int a =scanner.nextInt();
        int b= scanner.nextInt();
        int [][] macierz = new int[a][b];
        System.out.println("podaj elementy macierzy");
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                macierz[i][j]=scanner.nextInt();
            }
        }
        for (int n=0; n<3; n++){
            for (int m=0; m<3; m++){
                System.out.print(macierz[n][m] + " ");
            }
            System.out.println();
        }
    }
}
