package com.example.nekretnine_rok;

public abstract class Nekretnina {
    private String opstina;
    private double kmOdCentra;
    private double kvadratura; //u m^2
    private int cena;

    Nekretnina(String opstina, double kmOdCentra, double kvadratura, int cena){
        this.opstina = opstina;
        this.kmOdCentra = kmOdCentra;
        this.kvadratura = kvadratura;
        this.cena = cena;
    }

    public String getOpstina() {
        return opstina;
    }

    public double getKmOdCentra() {
        return kmOdCentra;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public int getCena() {
        return cena;
    }

    public abstract double isplativostNekretnine();

    @Override
    public String toString() {
        return getOpstina() + ", " + getKmOdCentra() + " kilometara od centra, " + getKvadratura() + " m^2, " + getCena() + " evra";
    }
}
