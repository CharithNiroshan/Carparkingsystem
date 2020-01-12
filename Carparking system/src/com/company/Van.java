package com.company;

public class Van extends Vehicle{
    private int cargovolume;

    public Van() {
    }

    public Van(String idplate, String brand, String entrytime, String type, String date, int cargovolume) {
        super(idplate, brand, entrytime, type, date);
        this.cargovolume = cargovolume;
    }

    public int getCargovolume() {
        return cargovolume;
    }

    public void setCargovolume(int cargovolume) {
        this.cargovolume = cargovolume;
    }
}
