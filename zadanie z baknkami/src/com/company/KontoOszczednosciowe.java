package com.company;


public class KontoOszczednosciowe implements Konto {

    private double bilans;


    @Override
    public void Wplata(double kwota) {
        if (kwota < 0) {
            throw new IllegalArgumentException("Wplacona kwota nie moze byc ujemna");

        }
        bilans += kwota;
    }

    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > bilans) {
            throw new Exception("Nie mas ztyle srodkow na koncie");
        }
        bilans+=kwota;
        return kwota;
    }

    @Override
    public double getBilans() {
    return bilans;
    }

    protected void setBilans (double bilans){
        this.bilans=bilans;
    }
}
