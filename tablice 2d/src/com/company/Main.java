package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        int [][] macierz = new int[3][3];
        System.out.println("podaj elementy macierzy");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
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
