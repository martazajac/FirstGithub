package com.company;

public abstract class Figura {
    private int pole;
    private int obwod;

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public abstract double ObliczPole();

    public abstract double ObliczObwod();
}
