package com.example.nekretnine_rok;

public class ParkingMesto extends Nekretnina{
    private boolean natkrivenost;

    ParkingMesto(String opstina, double kmOdCentra, double kvadratura, int cena, boolean natkrivenost){
        super(opstina, kmOdCentra, kvadratura, cena);
        this.natkrivenost = natkrivenost;
    }



    @Override
    public double isplativostNekretnine() {
        if(natkrivenost){
            return this.getCena()/(this.getKvadratura() * 1.2);
        }
        else{
            return this.getCena()/this.getKvadratura();
        }
    }

    @Override
    public String toString() {
        String s;
        if(this.natkrivenost){
            s = "DA";
        }else{
            s = "NE";
        }
        return super.getOpstina() + ", " + super.getKmOdCentra() + " kilometara od centra, " + super.getKvadratura() + " m^2, " + super.getCena() + " evra, natkrivenost: " + s;
    }
}
