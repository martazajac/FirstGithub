package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        float a;
        float b;
        float c;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c= scanner.nextFloat();
        float po;
        float Pole;
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            System.out.println("Oblicz pole");
            po = (float)0.5 * ( a + b + c );
            float Pole_bez_pierwaistka = po*(po-a)*(po-b)*(po-c);
            System.out.println(Pole_bez_pierwaistka);
            Pole = (float) Math.sqrt(Pole_bez_pierwaistka);
            System.out.println(Pole);

        }
        else{
            System.out.println("Nie ma trojkata");
        }




    }
}
