package com.example.nekretnine_rok;

public class Kuca extends Nekretnina{

    private double povrsinaPoseda; // u arima

    Kuca(String opstina, double kmOdCentra, double kvadratura, int cena, double povrsinaPoseda){
        super(opstina, kmOdCentra, kvadratura, cena);
        this.povrsinaPoseda = povrsinaPoseda;
    }

    @Override
    public String getOpstina() {
        return super.getOpstina();
    }

    @Override
    public int getCena() {
        return super.getCena();
    }

    @Override
    public double getKvadratura() {
        return super.getKvadratura();
    }

    @Override
    public double getKmOdCentra() {
        return super.getKmOdCentra();
    }

    public double getPovrsinaPoseda() {
        return povrsinaPoseda;
    }

    @Override
    public double isplativostNekretnine() {
        return this.getCena()/(this.getKvadratura() + this.getPovrsinaPoseda() * 100 * 0.7);
    }

    @Override
    public String toString() {
        return super.getOpstina() + ", " + super.getKmOdCentra() + " kilometara od centra, " + super.getKvadratura() + " m^2, " + super.getCena() + " evra, " + this.getPovrsinaPoseda() + " ar";

    }
}
