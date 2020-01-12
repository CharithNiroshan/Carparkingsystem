package com.company;

public class Motorbike extends Vehicle{
    private int enginevalue;

    public Motorbike() {
    }

    public Motorbike(String idplate, String brand, String entrytime, String type, String date, int enginevalue) {
        super(idplate, brand, entrytime, type, date);
        this.enginevalue = enginevalue;
    }

    public int getEnginevalue() {
        return enginevalue;
    }

    public void setEnginevalue(int enginevalue) {
        this.enginevalue = enginevalue;
    }
}
