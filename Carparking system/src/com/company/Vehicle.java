package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.Date;

public abstract class Vehicle {
    private String type;
    private String idplate;
    private String brand;
    private String entrytime;
    private String ddate;
    Date date;
    private String edate;
    Vehicle vehical[]=new Vehicle[20];
    int count=0;
    int i=0;
    int noofcars;
    int noofvans;
    int noofmoterbikes;
    float price;
    SimpleDateFormat tformatter=new SimpleDateFormat("HH:mm");
    SimpleDateFormat ptformatter=new SimpleDateFormat("HH");
    SimpleDateFormat dateFormatter=new SimpleDateFormat("yyyy/MM/dd");
    Scanner sc=new Scanner(System.in);

    public Vehicle() {
    }


    public Vehicle(String idplate, String brand, String entrytime,String type, String date) {
        this.idplate = idplate;
        this.brand = brand;
        this.entrytime = entrytime;
        this.type = type;
        this.ddate = ddate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return ddate;
    }

    public void setDate(String date) {
        this.ddate = ddate;
    }

    public String getIdplate() {
        return idplate;
    }

    public void setIdplate(String idplate) {
        this.idplate = idplate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public void addvehicle(int typechoice)
    {
        String id_plate;
        String entry_date;
        String entry_time;
        String brand;
        Van van=new Van();
        Motorbike moterbike=new Motorbike();
        Car car=new Car();
        for(int l=0;l<20;l++){
            car=new Car("No Vehicle","","","","","",0);
            vehical[l]=car;
        }
        for(int y=0;y<20;y++){
            String tpm=vehical[y].getIdplate();
            if(tpm.equals("No Vehicle")){
                count++;
            }
        }
        System.out.println("Enter the ID plate:");
        id_plate=sc.next();
        setIdplate(id_plate);
        System.out.println("Enter the brand:");
        brand=sc.next();
        setBrand(brand);
        System.out.println("Enter the Entry date:");
        date=new Date();
        edate = dateFormatter.format(date);
        System.out.println(edate);
        System.out.println("Enter the Entry time:");
        entry_time=sc.next();
        setEntrytime(entry_time);
        switch (typechoice)
        {
            case 1:this.type="Car";
                   System.out.println("Enter the colour:");
                   String colour=sc.next();
                   car.setColor(colour);
                   System.out.println("Enter the No of Doors:");
                   int noofdoors=sc.nextInt();
                   car.setNoofdoors(noofdoors);
                   vehical[i]=car;
                   i++;
                   break;
            case 2:this.type="Van";
                   System.out.println("Enter the Cargo Volume:");
                   int cargovolume=sc.nextInt();
                   van.setCargovolume(cargovolume);
                   vehical[i]=van;
                   i++;
                   break;
            case 3:this.type="MotorBike";
                   System.out.println("Enter the Engine Value:");
                   int enginevalue=sc.nextInt();
                   moterbike.setEnginevalue(enginevalue);
                   vehical[i]=moterbike;
                   i++;
                   break;
            default:break;
        }
    }
    public void deletevehicle()
    {
        System.out.println("---Remove Vehicle---");
        System.out.println("Vehicle ID:");
        String idPlt=sc.next();
        String temp="";
        try {
            for (int t = 0; t < 20; t++) {
                temp=vehical[t].getIdplate();
                if(temp.equals(idPlt)){
                    vehical[t].setIdplate("No Vehicle");
                    vehical[t].setBrand("");
                    vehical[t].setDate(null);
                    vehical[t].setEntrytime("");
                    vehical[t].setType("");
                }
            }
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("The vehicle not found");
        }
    }
    public void printvehiclelist()
    {
        try {
            int slt=20;
            for (int t = 0; t < 20; t++) {
                System.out.println("-----------------------------------------");
                System.out.println("Parking slot:" + (t + 1));
                System.out.println("Vehicle Id:" + vehical[t].getIdplate());
                System.out.println("Vehicle Type:" + vehical[t].getType());
                System.out.println("Vehicle Brand:" + vehical[t].getBrand());
                System.out.println("Vehicle entry time:" + vehical[t].getEntrytime());
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public void precentages()
    {
        String tp="";
        for(int x=0;x<20;x++) {
            tp=vehical[x].getType();
            if (tp.equals("Car")) {
                noofcars++;
            }
            if (tp.equals("Van")) {
                noofvans++;
            }
            if (tp.equals("MotorBike")) {
                noofmoterbikes++;
            }
        }
        System.out.println("Percentage of Cars:");
        float prc=((noofcars/20)*100);
        System.out.println(prc+"%");
        System.out.println("Percentage of Vans:");
        float prv=((noofvans/20)*100);
        System.out.println(prv+"%");
        System.out.println("Percentage of MotorBikes:");
        float prb=((noofmoterbikes/20)*100);
        System.out.println(prb+"%");
    }
    public void noofvehicles_in_a_day()
    {
        String ed="";
        String ued=sc.next();
        for(int r=0;i<20;i++){
            ed=vehical[r].getDate();
            if(ed.equals(ued)){
                System.out.println("-----------------------------------------");
                System.out.println("Parking slot:" + (r + 1));
                System.out.println("Vehicle Id:" + vehical[r].getIdplate());
                System.out.println("Vehicle Type:" + vehical[r].getType());
                System.out.println("Vehicle Brand:" + vehical[r].getBrand());
                System.out.println("Vehicle entry time:" + vehical[r].getEntrytime());
            }
        }
    }
    public void payment()
    {
        System.out.println("---------------Parking Payment----------------------");
        System.out.println("Enter vehicle Id Plate number:");
        String idplt=sc.next();
        Date ctime=new Date();
        String curtm=tformatter.format(ctime);
        System.out.println("Enter current time");
        System.out.println(curtm);
        String curTim=ptformatter.format(ctime);
        String tmpid;
        for(int q=0;q<20;q++){
            tmpid=vehical[q].getIdplate();
            if(tmpid.equals(idplt)){
                System.out.println("-----------------------------------------");
                try {
                    Date etime=ptformatter.parse(vehical[q].getEntrytime());
                    Date ctim=ptformatter.parse(curtm);
                    long timeDif=((Math.abs(etime.getTime()-ctim.getTime()))/1000)/3600;
                    System.out.println(etime.getTime()+""+ctim.getTime());
                    System.out.println(timeDif);
                    if(timeDif>3){
                        long pt1=timeDif*3;
                        long pt2=(timeDif-3)*1;
                        price=pt1+pt2;
                    }else {
                        long pt=timeDif*3;
                        price=pt;
                    }
                    System.out.println("Parking fee:Rs"+price);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
