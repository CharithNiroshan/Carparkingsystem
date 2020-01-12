package com.company;
import java.util.ArrayList;
import  java.util.Scanner;
public class WestministerCarParkManager {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            Car car=new Car();
            System.out.println("Welcome to West Minister Car Park");
            System.out.println("[1] Add New vehicle.");
            System.out.println("[2] Delete a vehicle.");
            System.out.println("[3] Print the list of vehicles.");
            System.out.println("[4] Percentages of vehicle types.");
            System.out.println("[5] Special Statistics.");
            System.out.println("[6] Vehicles in a specific day.");
            System.out.println("[7] Price for each vehicles.");
            System.out.println("[0] Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: int type_choice;
                        System.out.println("Enter the type of vehicle(1-Car,2-Van,3-Motorbike):");
                        type_choice = sc.nextInt();
                        switch (type_choice) {
                          case 1: car.addvehicle(1);
                                 break;
                          case 2: Van van = new Van();
                                 van.addvehicle(2);
                                 break;
                          case 3: Motorbike moterbike = new Motorbike();
                                 moterbike.addvehicle(3);
                                 break;
                          default: System.out.println("Invalid Input");
                        }
                        break;
                case 2: car.deletevehicle();
                        break;
                case 3: car.printvehiclelist();
                        break;
                case 4: car.precentages();
                        break;
                case 6: car.noofvehicles_in_a_day();
                        break;
                case 7: car.payment();
                        break;
                case 0:break;
            }
            i++;
        } while (i > 0);
    }
}
