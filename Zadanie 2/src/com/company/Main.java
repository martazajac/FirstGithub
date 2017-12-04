package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String napis = sc.next();
        if (napis.length() < 30) {
            System.out.println("Wybierz opcje");
            int wybor = sc.nextInt();

            String wynik = " ";


            switch (wybor) {
                case 1: {
                    for (int i = 0; i < napis.length(); i++) {

                        char znak = napis.charAt(i);
                        //sprawdzam czy mala litera
                        if ((znak >= 97) && (znak <= 122)) {
                            znak-=32;
                            wynik= wynik+znak;
//                            wynik+=znak; to samo co wyzej
                        }
                        break;
                    }
                }
                case 2: {
                    for (int i = 0; i < napis.length(); i++) {
                        char znak = napis.charAt(i);
                        if ((znak >= 65) && (znak <= 90)) {
                            znak += 32;

                            wynik += znak;
                        }

                    }
                    System.out.println(wynik);
                    break;
                    }
                case 3: {
                    for (int i = 0; i<napis.length(); i++){
                        char znak = napis.charAt(i);
                        if (znak>=97 && znak <=122){
                            znak-=32;
                        }
                        else if (znak>=65 && znak <=90) {
                            znak += 32;
                        }else{
                            }
                            wynik+=znak;
                            }
                        }
                    }


                    }
                }


            }



