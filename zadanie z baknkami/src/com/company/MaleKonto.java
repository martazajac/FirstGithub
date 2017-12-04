package com.company;


public class MaleKonto extends KontoOszczednosciowe {
    private double limit;

    public double getLimit() {
        return limit;
    }

    public MaleKonto(double limit) {
        this.limit = limit;
    }

    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > limit) {
            throw new Exception("Kwota wieksza niz limit");
        }
        return super.Wyplata(kwota);
    }
}
