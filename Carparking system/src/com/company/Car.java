package com.company;

public class Car extends Vehicle{
    private  String color;
    private  int noofdoors;

    public Car() {
    }

    public Car(String idplate, String brand, String entrytime, String type, String date, String color, int noofdoors) {
        super(idplate, brand, entrytime, type, date);
        this.color = color;
        this.noofdoors = noofdoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoofdoors() {
        return noofdoors;
    }

    public void setNoofdoors(int noofdoors) {
        this.noofdoors = noofdoors;
    }
}
