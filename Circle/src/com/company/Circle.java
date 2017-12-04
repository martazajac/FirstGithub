package com.company;

public class Circle {
    private double promien;

    public double getPromien() {
        return this.promien;
    }

    public void setPromien(double r) {
        if (r < 0) {
            System.out.println("Promien nie moze byc ujemny");
        } else {
            this.promien =r ;
    }

    }


    public double Area() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double Circumference() {
        return 2 * Math.PI * promien;
    }
}
