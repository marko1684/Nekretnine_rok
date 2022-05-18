package com.example.nekretnine_rok;

public class Stan extends Nekretnina{
    private boolean parkingMesto; // da li dolazi parking mesto uz stan

    Stan(String opstina, double kmOdCentra, double kvadratura, int cena){
        super(opstina,kmOdCentra,kvadratura,cena);
        this.parkingMesto = parkingMesto;
    }

    @Override
    public double isplativostNekretnine() {
        if(this.parkingMesto){
            return this.getCena()/(this.getKvadratura() + 10 * 0.8);
        }
        else{
            return this.getCena()/this.getKvadratura();
        }
    }

    @Override
    public double getKmOdCentra() {
        return super.getKmOdCentra();
    }

    @Override
    public double getKvadratura() {
        return super.getKvadratura();
    }

    @Override
    public int getCena() {
        return super.getCena();
    }

    @Override
    public String getOpstina() {
        return super.getOpstina();
    }

    public boolean isParkingMesto() {
        return parkingMesto;
    }

    @Override
    public String toString() {
        String s;
        if(this.parkingMesto){
            s = "IMA";
        }else{
            s = "NEMA";
        }
        return super.getOpstina() + ", " + super.getKmOdCentra() + " kilometara od centra, " + super.getKvadratura() + " m^2, " + super.getCena() + " evra, " + s;
    }


}
