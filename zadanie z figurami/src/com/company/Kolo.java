package com.company;


public class Kolo  extends Figura {



    private int promien;

    public int getPromien() {
        return this.promien;
    }

    public void setPromien(int r) {
        if (r < 0) {
            System.out.println("Promien musi byc wiekszy od 0");
        } else {
            this.promien =r ;
        }

    }
    public double ObliczPole () {
        return Math.PI * Math.pow(promien, 2);
    }

    public double ObliczObwod () {
        return 2 * Math.PI * promien;
    }


}
